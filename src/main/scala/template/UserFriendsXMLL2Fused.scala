package template

/**
 * Users = 1000
 * Friends = (4 , 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536)
 * Times   = (11, 7, 10, 18, 21, 43 , 84 , 167, 340 , 762 , 1548, 2706, 5659, 11695, 28973)
 * Fused   = (5 , 5, 7 , 14, 17, 39 , 71 , 130, 261 , 530 , 1101, 2214, 5100, 13277, 29876)
 * No quadratic behavior.
 */
/**
 *
 * Unfused version:
 *  for (u  <- users) {
 *    val friendsXML =
 *      for (friend <- user.friends)
 *        for (friendXML <- friendToXML(friend))
 *          yield friendXML
 *
 *    for (str <- frindsXML)
 *      yield str
 *  }
 */

/**
 * Fused version would look like:
 *  for (u  <- users) {
 *    for (fr <- u.friends)
 *     for (str <- friendToXML(fr))
 *       yield str
 *    }
 */

object UserFriendsXMLL2Fused extends Benchmark {
  def friendToXML(u: User) = Seq("<f>", u.bunchOfText, "</f>")
  def userToXML(u: User) = u.friends.flatMap(friendToXML)

  // config
  val numberOfUsers = 1000
  val baseNumberOfFriends = 4
  val numberOfFriends = (0 to 15).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  println(numberOfFriends)

  // user pool for memory reuse
  var userPool: Seq[User] = Nil
  var users: Seq[User] = Nil

  def generateUser(friends: Seq[User]) = User("n", friends, "blob")

  var testRun = 0

  override def setUp = {
    // load the data into the data structure
    userPool = for (i <- 0 to 2)
      yield generateUser(for (j <- 0 to numberOfFriends(testRun)) yield generateUser(Nil))

    users = for (i <- 0 to numberOfUsers)
      yield userPool(i % userPool.size)
    testRun += 1

    super.setUp()
  }

  def run = {
    var buf = new scala.collection.mutable.ArrayBuffer[String]()
    var i = 0
    val usize = users.size
    while (i < usize) {
      val u = users(i)
      var j = 0
      val ufsize = u.friends.size

      while (j < ufsize) {
        val fr = u.friends(j)
        val ffxml = friendToXML(fr)
        var k = 0
        val ffxmlsize = ffxml.size
        while (k < ffxmlsize) {
          buf += ffxml(k)
          k += 1
        }
        j += 1
      }
      i += 1
    }
    buf
  }

}

