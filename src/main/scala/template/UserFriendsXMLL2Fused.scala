package template

/**
 * Users = 1000
 * Friends = (4 , 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536)
 * Times   = (10, 8, 12, 17, 22, 45 , 87 , 180, 351 , 704 , 1419, 2893, 5811 , 12200, 29384)
 * Fused   = (7 , 2, 4 , 4 , 7 , 18 , 19 , 50 , 97  , 193 , 456 , 851 , 2370 , 4694 , 12234)
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
 *    for (str <- friendsXML)
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
object UserFriendsXMLL2Fused extends UserGeneration with Benchmark {

  // config
  val numberOfUsers = 1000
  val numberOfFriends = (1 to 20).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  println(numberOfFriends)

  // user pool for memory reuse
  var userPool: Array[User] = new Array[User](0)
  var users: Array[User] = new Array[User](0)


  override def setUp = {
    // load the data into the data structure
    userPool = (for (i <- (0 to 2))
      yield generateUser(
          (for (j <- 0 to numberOfFriends(testRun)) 
            yield generateUser(
                new Array[User](0))))).toArray

    users = (for (i <- (0 to numberOfUsers))
      yield userPool(i % userPool.size)).toArray
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
      userPre(buf,u)
      while (j < ufsize) {
        val fr = u.friends(j)
        friendPre(buf, fr)
        buf += fr.bunchOfText
        friendPost(buf)
        j += 1
      }
      userPost(buf)
      i += 1
    }
    buf
  }

}

