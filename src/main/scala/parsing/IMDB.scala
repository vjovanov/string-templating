package parsing
import org.htmlcleaner._
import scala.collection.JavaConversions._
import java.util.ArrayList
import org.jsoup._
import org.jsoup.nodes._

case class Top250(menu: Array[Item], movies: Array[Array[String]], sideBar: Array[Item])
case class Item(text: String, subitems: Array[Item])
case class CNN(sideMenu: Array[Item], central: Array[String], centralBelow1: Item, centralBelow2: Item) 

/*object CNNParse extends App {
  
  val input = new java.io.File("/tmp/cnn");
  val doc = Jsoup.parse(input, "UTF-8", "");

  println("Start")
  val sideMenu: Array[Item] = doc.getElementById("cnn_maintt2bul").child(0).children.filter(_.tag.getName.trim != "div")
    .partition(_.tag.getName == "h4").zipped.map((x, y) => 
      Item(x.toString, 
          y.children.map(x => Item(x.toString, null)).toArray)).toArray
   
      
  val centralMenu = doc.getElementsByClass("cnn_mc2nodecntr").first.children.map(_.toString).toArray
  
  def sectBin(x: Element) = 
    Item("bin", x.children.filter(_.className.startsWith("cnn_sectbin"))
        .map(y => Item("", y.getElementsByTag("li").toArray.map(x => Item(x.toString, null)))).toArray)
  
  
  val boxes = doc.getElementsByClass("cnn_shdsectbin").first.children
  val centralBelow1 = sectBin(boxes.filter(_.className == "cnn_sbalternate").head)
  val centralBelow2 = sectBin(doc.getElementsByClass("cnn_shdsectbin").first)
     
  
  val result = CNN(sideMenu, centralMenu, centralBelow1, centralBelow2)
  println(result)
  val os = new java.io.ObjectOutputStream(new java.io.FileOutputStream("/home/vjovanov/cnnObject"))
  os.writeObject(result)
  os.flush()
  os.close()
}*/
case class DELL(menu: Array[Item], center: Array[Item], links: Array[Item])

object DELLParse extends App {
  val input = new java.io.File("/tmp/dell1");
  val doc = Jsoup.parse(input, "UTF-8", "");

  println("Start")
  val menu: Array[Item] = doc.getElementsByClass("jd_menu").first.children.map(x => Item(x.child(0).toString, 
      x.child(1).children.map(x =>Item(x.toString, null)).toArray)).toArray
   println(menu(0))
      
  val tmpCenter = 
    doc.getElementById("column3").child(0).child(0).child(0).getElementsByClass("fragCntBrdFull").iterator.toArray
  val center = tmpCenter.map(x => Item("beep", x.children.toArray.map(y => Item(y.toString, null))))
  
  val tmpBottom = doc.getElementById("column5").child(0).child(0).child(0).children.filterNot(_.className == "vsep")
  val bottom = tmpBottom.map(x => 
    Item("boop", x.getElementsByTag("a").toArray.map(y => {Item(y.toString, null)}))).toArray
  println(bottom(0))
  
  val result = DELL(menu, center, bottom)
  
  val os = new java.io.ObjectOutputStream(new java.io.FileOutputStream("/home/vjovanov/dellObject"))
  os.writeObject(result)
  os.flush()
  os.close()
}

/*object IMDB extends App {
  
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
}*/