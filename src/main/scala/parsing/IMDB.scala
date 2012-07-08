package parsing
import org.htmlcleaner._
import scala.collection.JavaConversions._

case class NavBar(tabs: Array[String])

object IMDB extends App {
  /*val source = scala.io.Source.fromFile("/tmp/imdb250.html")
  val lines = source.mkString
  source.close()*/
  
  val props = new CleanerProperties();
 
// set some properties to non-default values
props.setTranslateSpecialEntities(true);
props.setTransResCharsToNCR(true);
props.setOmitComments(true);

// do parsing
val tagNode = new HtmlCleaner(props).clean(
    new java.net.URL("file:///tmp/top250")
);
 
// serialize to xml file
new PrettyXmlSerializer(props).writeToFile(
    tagNode, "/tmp/imdb250.xml", "utf-8"
);

  val source = scala.io.Source.fromFile("/tmp/imdb250.xml")
  val page = source.mkString
  source.close()

  tagNode.getElementsByAttValue("id", "consumer_main_nav", true, true)(0).
    getChildren.foreach(x => println(x.getClass))
}