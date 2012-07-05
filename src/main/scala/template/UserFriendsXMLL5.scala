package template

trait L5 extends Benchmark with UserGeneration {
    // config
  val numberOfUsers = 10
  val numberOfFriends  = (0 to 20).map(x => baseNumberOfFriends * scala.math.pow(2, x).toInt)
  val numberOfFFriends = Seq.fill(15)(2)

  // user pool for memory reuse
  var userPool: Array[User] = null
  var users: Array[User] = null

  override def setUp = {
    scala.util.Random.setSeed(99999999999L)
    // load the data into the data structure
    userPool = (for (i <- 0 to 2)
      yield generateUser((for (j <- 0 to numberOfFriends(testRun))
        yield generateUser(for (k <- 0 to numberOfFFriends(testRun))
          yield generateUser(for (k <- 0 to numberOfFFriends(testRun))
            yield generateUser(for (k <- 0 to numberOfFFriends(testRun))
              yield generateUser(new Array[User](0)))))))).toArray

    users = (for (i <- 0 to numberOfUsers)
      yield userPool(i % userPool.size)).toArray

    testRun += 1
    res.clear()
    super.setUp()
  }

}

object UserFriendsXMLL5 extends UserGeneration with L5 with Benchmark {

  var a: Array[String] = null
  def run = {
    a = users.flatMap(userToXML)
  }

  override def tearDown() = {
    super.tearDown()
    res ++= a
    println(res.mkString.hashCode())
  }

  override def main(args: Array[String]) = super.main(args)

}

