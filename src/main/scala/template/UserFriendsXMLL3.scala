package template

/**
 *
 * Modify the number of Friends:
 * Users           : 10
 * Friends' Friends: 100
 * Friends         : 2  , 4 , 8 , 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768
 * Time            : 4  , 6 , 8 , 16, 24, 46, 57 , 133, 239, 484 , 904 , 1782, 3607, 7584 , 15531
 * No quadratic speedup in experiments.
 *
 * Users
 * Unfused:
 *  val res = 
 *    for (u <- users) {
 *      val x =
 *        for(fr <- u.friends) {
 *          val y = 
 *            for (ffr <- fr.friends)
 *              for (txt <- friendOfFriendXML(ffr))
 *                yield txt
 *
 *          for (frstxt <- y)
 *            yield frstxt
 *         }
 *
 *       for (txt <- x)
 *         yield txt
 *     }
 *
 * Fused:
 *  for (u <- users) {
 *    for (fr <- users.friends)
 *      for (ffr <- fr.friends)
 *        for(txt <- friendOfFriendXML(ffr))
 *          yield txt
 *
 * Each piece of data is traversed only once.
 */
object UserFriendsXMLL3 extends Benchmark {
  def friendOfFriendXML(u: User) = Seq("<f>", u.bunchOfText, "</f>")
  def friendToXML(u: User) =  u.friends.flatMap(friendOfFriendXML(_))
  def userToXML(u: User) = u.friends.flatMap(friendToXML)

  // config
  val numberOfUsers = 10
  val baseNumberOfFriends = 2
  val numberOfFriends  =
    (0 to 15).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  val numberOfFFriends =
    Seq.fill(15)(100)

  println(numberOfFriends)
  // user pool for memory reuse
  var userPool: Seq[User] = Nil
  var users: Seq[User] = Nil

  def generateUser(friends: Seq[User]) = User("n", friends, "blob")

  var testRun = 0

  override def setUp = {
    // load the data into the data structure
    userPool = for (i <- 0 to 2)
      yield generateUser(for (j <- 0 to numberOfFriends(testRun)) 
        yield generateUser(for (k <- 0 to numberOfFFriends(testRun))
          yield generateUser(Nil)))

    users = for (i <- 0 to numberOfUsers)
      yield userPool(i % userPool.size)
    testRun += 1

    super.setUp()
  }

  def run = {
    val x = users.flatMap(userToXML)
  }

  override def main(args: Array[String]) = super.main(args)
}
