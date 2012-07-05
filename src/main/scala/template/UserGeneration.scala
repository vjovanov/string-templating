package template
import scala.collection.mutable.ArrayBuffer

case class User(name: String, friends: Array[User], bunchOfText: String) {
  override def toString = "n:" + name.take(5) + "  f:" + friends.size + "  t:" + bunchOfText.take(5)
}

trait UserGeneration {

  @inline
  final def friend4ToXML(u: User) = Array("<ffriend>", u.bunchOfText, "</ffriend>")

  @inline
  final def friend3ToXML(u: User) = Array("<friend>", "<name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friend4ToXML(_)) ++ Array("</friends>", "</friend>")

  @inline
  final def friend2ToXML(u: User) = Array("<friend>", "<name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friend3ToXML(_)) ++ Array("</friends>", "</friend>")

  @inline
  final def friend1ToXML(u: User) = Array("<friend>", "<name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friend2ToXML(_)) ++ Array("</friends>", "</friend>")

  @inline
  final def friendToXML(u: User) = Array("<friend>", "<name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friend1ToXML(_)) ++ Array("</friends>", "</friend>")

  @inline
  final def userToXML(u: User) = Array("<user>", "<name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friendToXML) ++ Array("</friends></user>")

  val baseNumberOfFriends = 2

  final def friendPre(b: ArrayBuffer[String], u: User) = {
    b += "<friend>"
    b += "<name>"
    b += u.name
    b += "</name>"
    b += "<friends>"
  }
  final def friendPost(b: ArrayBuffer[String]) = {
    b += "</friends>"
    b += "</friend>"
  }
  final def fFriendPre(b: ArrayBuffer[String]) = b += "<ffriend>"
  final def fFriendPost(b: ArrayBuffer[String]) = b += "</ffriend>"
  final def userPre(b: ArrayBuffer[String], u: User) = {
    b += "<user><name>"
    b += u.name
    b += "</name>"
    b += "<friends>"
  }
  final def userPost(b: ArrayBuffer[String]) = b += "</friends></user>"

  def generateUser(friends: IndexedSeq[User]) = User(scala.util.Random.nextString(10), friends.toArray, scala.util.Random.nextString(5000))

  var res = new scala.collection.mutable.ArrayBuffer[String]()
}

