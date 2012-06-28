package template
import scala.collection.mutable.ArrayBuffer

trait UserGeneration {
  @inline
  final def friendOfFriendXML(u: User) = Seq("<ffriend>", u.bunchOfText, "</ffriend>")

  @inline
  final def friendToXML(u: User) = Seq("<friend>") ++  u.friends.flatMap(friendOfFriendXML(_)) ++ Seq("</friend>")

  @inline
  final def userToXML(u: User) = Seq("<user><name>", u.name, "</name>", "<friends>") ++ u.friends.flatMap(friendToXML) ++ Seq("</friends></user>")

  final def friendPre(b: ArrayBuffer[String]) = b += "<friend>"
  final def friendPost(b: ArrayBuffer[String]) = b += "<\friend>"
  final def fFriendPre(b: ArrayBuffer[String]) = b += "<ffriend>"
  final def fFriendPost(b: ArrayBuffer[String]) = b += "<\ffriend>"
  final def userPre(b: ArrayBuffer[String]) = {
    b += "<user><name>"
    b += u.name
    b += "</name>"
    b += "<friends>"
  }
  final def userPost(b: ArrayBuffer[String]) = b += "</friends></user>"

  def generateUser(friends: Seq[User]) = User(scala.util.Random.nextString(10), friends, scala.util.Random.nextString(50))

  def generateUserArr(friends: Array[User]) = UserArr(scala.util.Random.nextString(10), friends, scala.util.Random.nextString(50))
}