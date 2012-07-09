package parsing
import org.htmlcleaner._
import scala.collection.JavaConversions._
import java.util.ArrayList
import org.jsoup._
import org.jsoup.nodes._

case class Top250(menu: Array[Item], movies: Array[Array[String]], sideBar: Array[Item])
case class Item(text: String, subitems: Array[Item])

object IMDB extends App {
  
  val input = new java.io.File("/tmp/imdb250");
  val doc = Jsoup.parse(input, "UTF-8", "");

  val items = doc.getElementById("consumer_main_nav").children.map { x =>
    val inner = x.child(1).children().toArray.map { v =>      
      Item(v.asInstanceOf[Element].toString(), null)
    }
    
    Item(x.child(0).toString(), inner) 
  }.toArray
  
  // movies
  val body = doc.getElementById("main").children.filter(x => x.tag.getName == "table").head.child(0)
  var movies = body.children.filter(_.tag.getName == "tr").map(_.children.map(_.toString).toArray).toArray
  
  var sideBar = doc.getElementById("sidebar-narrow").children.filter(x => x.tag.getName == "div").toArray.map { x =>
    Item(x.child(0).toString, x.child(1).children.toArray.map{v =>
      Item(v.toString(), null)
    })
  }
  
  val result = Top250(items, movies, sideBar)
  
  val os = new java.io.ObjectOutputStream(new java.io.FileOutputStream("/home/vjovanov/imdb250"))
  os.writeObject(Top250(items, movies, sideBar))
  os.flush()
  os.close()
}
