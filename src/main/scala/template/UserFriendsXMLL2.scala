package template

/**
 * Users = 1000
 * Friends = (4 , 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536)
 * Times   = (10, 8, 12, 17, 22, 45 , 87 , 180, 351 , 704 , 1419, 2893, 5811 , 12200, 29384)
 * No data size related quadratic complexity.
 */

/**
 *
 * Unfused loop version:
 *  for (u  <- users) {
 *
 *    val friendsXML =
 *      for (friend <- user.friends)
 *        for (friendXML <- friendToXML(friend))
 *          yield friendXML)
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

/**
 * Concat version:
 *  val res = Seq("pre") ++ for (u  <- users) {
 *
 *    val friendsXML = Seq("fpre") ++
 *      for (friend <- user.friends)
 *        for (friendXML <- friendToXML(friend))
 *          yield friendXML) ++ Seq("fpost")
 *
 *    for (str <- friendsXML)
 *      yield str + "marker"
 *
 *  } ++ Seq("post")
 */

/**
 * Fused concat version:
 *  val users =
 *   for (u  <- users) {
 *
 *    val preFXML =
 *     for (str <- Seq("fpre"))
 *      yield str + "marker"
 *
 *    val loop =
 *      for (friend <- user.friends)
 *          for (str <- Seq("<friend>", friend.bunchOfText, "</friend>"))
 *            yield str + "marker"
 *
 *    val postFXML = 
 *     for (str <- Seq("fpre"))
 *      yield str + "marker"
 *
 *    yield preFXML ++ loop ++ postFXML
 *   }
 *
 *  val res = Seq("pre") ++ union ++ Seq("post")
 */


object UserFriendsXMLL2 extends UserGeneration with Benchmark {

  // config
  val numberOfUsers = 1000
  var numberOfFriends = (1 to 20).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  println(numberOfFriends)

  // user pool for memory reuse
  var userPool: Array[User] = null
  var users: Array[User] = null

  override def setUp = {
    // load the data into the data structure
    userPool = (for (i <- 0 to 2)
      yield generateUser((for (j <- 0 to numberOfFriends(testRun)) yield generateUser(new Array[User](0))))).toArray

    users = (for (i <- 0 to numberOfUsers)
      yield userPool(i % userPool.size)).toArray
    testRun += 1

    super.setUp()
  }

  def run = {
    users.flatMap(friend3ToXML)
  }

}