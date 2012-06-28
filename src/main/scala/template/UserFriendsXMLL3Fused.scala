package template

/**
 * Modify the number of Friends:
 * Users           : 10
 * Friends' Friends: 100
 * Friends         : 2  , 4 , 8 , 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768
 * Time            : 4  , 7 , 11, 15, 28, 43, 81 , 168, 344, 670 , 930 , 1823, 3548, 7531 , 15244
 * Time Fused      : 0  , 1 , 1 , 3 , 7 , 9 , 18 , 35 , 70 , 139 , 278 , 557 , 776 , 2436 , 3757

 * No quadratic speedup with data size in experiments. Maybe we have quadratic speedup with the level of nesting.
 *
 * Users
 * Unfused:
 *  val res =
 *    for (u <- users) {
 *      val x =
 *        for(fr <- u.friends) {
 *          val y =
 *            for (ffr <- fr.friends)
 *              for (txt <- Seq("<ffriend>", ffr.bunchOfText, "</ffriend>"))
 *                yield txt
 *
 *          for (frstxt <- Seq("<ffriend>") ++ y ++ Seq("<\ffriend>"))
 *            yield frstxt
 *         }
 *
 *       for (txt <- Seq("<friend>") ++ x ++ Seq("<\friend>")
 *         yield txt
 *     }
 *  Seq("<user>") ++ res ++ Seq("</user>")
 *
 * Fused:
 *  val res = ArrayBuffer[String]()
 *  for (u <- users + 2) {
 *    res += "<user>"
 *    for(fr <- u.friends) {
 *      res += "<friend>"
 *      for (ffr <- fr.friends) {
 *        res += "<ffriend>"
 *        res += "ffr.bunchOfText"
 *        res += "</ffriend>"
 *      }
 *      res += "<\friend>"
 *    }
 *    res += "</user>"
 *  }
 *
 */
object UserFriendsXMLL3Fused extends UserGeneration with Benchmark {

  // config
  val numberOfUsers = 10
  val baseNumberOfFriends = 2
  val numberOfFriends =
    (0 to 15).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  val numberOfFFriends =
    Seq.fill(15)(100)

  println(numberOfFriends)
  // user pool for memory reuse
  var userPool: Array[UserArr] = new Array[UserArr](0)
  var users: Array[UserArr] = new Array[UserArr](0)


  var testRun = 0

  override def setUp = {
    // load the data into the data structure
    userPool = (for (i <- 0 to 2)
      yield generateUserArr((for (j <- 0 to numberOfFriends(testRun))
      yield generateUserArr((for (k <- 0 to numberOfFFriends(testRun))
      yield generateUserArr(new Array(0))).toArray)).toArray)).toArray

    users = (for (i <- 0 to numberOfUsers)
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
      userPre(buf)
      while (j < ufsize) {
        val fr = u.friends(j)
        var k = 0
        val ffsize = fr.friends.size
        friendPre(buf)
        while (k < ffsize) {
          val frfr = fr.friends(k)
          fFriendPre(buf)
          buf += frfr.bunchOfText
          fFriendPost(buf)
          k += 1
        }
        friendPost(buf)
        j += 1
      }
      userPost(buf)
      i += 1
    }
    buf
  }
}