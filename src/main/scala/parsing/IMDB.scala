package parsing
import org.htmlcleaner._

object IMDB extends App {
  val source = scala.io.Source.fromFile("/tmp/imdb250.html")
  val lines = source.mkString
  source.close()
  
  val props = new CleanerProperties();
 
// set some properties to non-default values
props.setTranslateSpecialEntities(true);
props.setTransResCharsToNCR(true);
props.setOmitComments(true);
 
// do parsing
val tagNode = new HtmlCleaner(props).clean(
    new java.net.URL("http://www.imdb.com/chart/top")
);
 
// serialize to xml file
new PrettyXmlSerializer(props).writeToFile(
    tagNode, "/home/vjovanov/imdb.xml", "utf-8"
);
 

}