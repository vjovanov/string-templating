package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark
import com.google.caliper.{ Runner => CaliperRunner }
import parsing._
object IMDBBench {

  var page: Top250 = _

  // main method for IDEs, from the CLI you can also run the caliper Runner directly
  // or simply use SBTs "run" action
  def main(args: Array[String]) {
    // we simply pass in the CLI args,
    // we could of course also just pass hardcoded arguments to the caliper Runner
    CaliperRunner.main(classOf[IMDBBench], args: _*)

  }

}

class IMDBBench extends SimpleScalaBenchmark {
  import IMDBBench._

  override def setUp() {
    if (page == null)
      page = new java.io.ObjectInputStream(new java.io.FileInputStream(
        "/home/vjovanov/imdbTop250")).readObject().asInstanceOf[Top250]
  }

  def printMenu(items: Array[Item]) = {
    Array("pre") ++ items.flatMap(menuItem) ++ Array("post")
  }

  def menuItem(item: Item) = {
    Array("pre1") ++ item.subitems.flatMap(innerItem) ++ Array("post1")
  }

  def innerItem(item: Item) = {
    Array("pre2", item.text, "post2")
  }

  def printSideMenu(items: Array[Item]) = {
    Array("pres") ++ items.flatMap(menuItem) ++ Array("posts")
  }

  def sideMenuItem(item: Item) = {
    Array("pres1") ++ item.subitems.flatMap(innerItem) ++ Array("posts1")
  }

  def sideInnerItem(item: Item) = {
    Array("pres2") ++ item.text ++ Array("posts2")
  }

  def movies(movies: Array[Array[String]]) = {
    Array("prem") ++ movies.flatMap(movie) ++ Array("postm")
  }

  def movie(movie: Array[String]) =
    Array("prem") ++ movie ++ Array("postm")

  def timeImdbTemplate(reps: Int) = repeat(reps) {
    val res = Array("prep") ++ printMenu(page.menu) ++ Array("inp") ++ printSideMenu(page.sideBar) ++ Array("prem") ++ movies(page.movies)
    res
  }

  def timeImdbf(reps: Int) = repeat(reps) { val x = new imdbfC(); val r = x(()); r }

  def timeImdbOrig(reps: Int) = repeat(reps) { val x = new imdborigC(); val r = x(()); r }

  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  class imdbfC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x51 = Array("post")
      val x54 = Array("inp")
      val x57 = Array("pres")
      val x104 = Array("posts")
      val x107 = Array("prem")
      val x134 = Array("postm")
      val x1 = page
      val x109 = x1.movies
      val x110 = x109.length
      val x114 = Array("prem1")
      val x116 = Array("postm1")
      val x221_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x111 = 0
      while (x111 < x110) {
        val x114 = Array("prem1")
        val x225 = x114.length
        var x224 = 0
        while (x224 < x225) {
          val x226 = x114.apply(x224)
          // prev yields ArrayBuffer(Sym(128), Sym(182), Sym(211))
          x221_buff += x226
          val x211 = ()
          x224 += 1
        }
        val x113 = x109.apply(x111)
        val x232 = x113.length
        var x231 = 0
        while (x231 < x232) {
          val x233 = x113.apply(x231)
          // prev yields ArrayBuffer(Sym(128), Sym(182), Sym(211))
          x221_buff += x233
          val x211 = ()
          x231 += 1
        }
        val x116 = Array("postm1")
        val x239 = x116.length
        var x238 = 0
        while (x238 < x239) {
          val x240 = x116.apply(x238)
          // prev yields ArrayBuffer(Sym(128), Sym(182), Sym(211))
          x221_buff += x240
          val x211 = ()
          x238 += 1
        }
        val x245 = () // x229 ++ x236 ++ x243
        val x213 = x245
        x111 += 1
      }
      val x56 = x1.sideBar
      val x58 = x56.length
      val x62 = Array("pres1")
      val x86 = Array("posts1")
      var x59 = 0
      while (x59 < x58) {
        val x62 = Array("pres1")
        val x248 = x62.length
        var x247 = 0
        while (x247 < x248) {
          val x249 = x62.apply(x247)
          // prev yields ArrayBuffer(Sym(98), Sym(166), Sym(205))
          x221_buff += x249
          val x205 = ()
          x247 += 1
        }
        val x61 = x56.apply(x59)
        val x63 = x61.subitems
        val x64 = x63.length
        var x65 = 0
        while (x65 < x64) {
          val x67 = x63.apply(x65)
          val x68 = x67.text
          val x69 = Array("pre2", x68, "post2")
          val x271 = x69.length
          var x78 = 0
          while (x78 < x271) {
            val x272 = x69.apply(x78)
            // prev yields ArrayBuffer(Sym(98), Sym(166), Sym(205), Sym(257), Sym(279), Sym(287))
            x221_buff += x272
            val x205 = ()
            x78 += 1
          }
          x65 += 1
        }
        val x86 = Array("posts1")
        val x262 = x86.length
        var x261 = 0
        while (x261 < x262) {
          val x263 = x86.apply(x261)
          // prev yields ArrayBuffer(Sym(98), Sym(166), Sym(205))
          x221_buff += x263
          val x205 = ()
          x261 += 1
        }
        val x302 = () // x252 ++ x301 ++ x266
        val x207 = x302
        x59 += 1
      }
      val x3 = x1.menu
      val x5 = x3.length
      val x9 = Array("pre1")
      val x33 = Array("post1")
      var x6 = 0
      while (x6 < x5) {
        val x9 = Array("pre1")
        val x305 = x9.length
        var x304 = 0
        while (x304 < x305) {
          val x306 = x9.apply(x304)
          // prev yields ArrayBuffer(Sym(45), Sym(150), Sym(199))
          x221_buff += x306
          val x199 = ()
          x304 += 1
        }
        val x8 = x3.apply(x6)
        val x10 = x8.subitems
        val x11 = x10.length
        var x12 = 0
        while (x12 < x11) {
          val x14 = x10.apply(x12)
          val x15 = x14.text
          val x16 = Array("pre2", x15, "post2")
          val x328 = x16.length
          var x25 = 0
          while (x25 < x328) {
            val x329 = x16.apply(x25)
            // prev yields ArrayBuffer(Sym(45), Sym(150), Sym(199), Sym(314), Sym(336), Sym(344))
            x221_buff += x329
            val x199 = ()
            x25 += 1
          }
          x12 += 1
        }
        val x33 = Array("post1")
        val x319 = x33.length
        var x318 = 0
        while (x318 < x319) {
          val x320 = x33.apply(x318)
          // prev yields ArrayBuffer(Sym(45), Sym(150), Sym(199))
          x221_buff += x320
          val x199 = ()
          x318 += 1
        }
        val x359 = () // x309 ++ x358 ++ x323
        val x201 = x359
        x6 += 1
      }
      val x221 = x221_buff.result
      val x222 = x221 // println(x221)
      val x137 = x222
      x137
    }
  }
  /**
   * ***************************************
   * End of Generated Code
   * *****************************************
   */
  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  class imdborigC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x1 = page
      val x3 = x1.menu
      val x5 = x3.length
      val x9 = Array("pre1")
      val x26 = Array("post1")
      val x35_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x6 = 0
      while (x6 < x5) {
        val x8 = x3.apply(x6)
        val x10 = x8.subitems
        val x11 = x10.length
        val x24_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x12 = 0
        while (x12 < x11) {
          val x14 = x10.apply(x12)
          val x15 = x14.text
          val x16 = Array("pre2", x15, "post2")
          val x17 = x16.length
          var x18 = 0
          while (x18 < x17) {
            val x19 = x16.apply(x18)
            // Sym(20)yield Map(Sym(31) -> <function1>, Sym(20) -> <function1>)previous 
            x24_buff += x19
            val x20 = ()
            x18 += 1
          }
          x12 += 1
        }
        val x24 = x24_buff.toArray
        val x25 = x9 ++ x24
        val x27 = x25 ++ x26
        val x28 = x27.length
        var x29 = 0
        while (x29 < x28) {
          val x30 = x27.apply(x29)
          // Sym(31)yield Map(Sym(31) -> <function1>)previous 
          x35_buff += x30
          val x31 = ()
          x29 += 1
        }
        x6 += 1
      }
      val x35 = x35_buff.toArray
      val x36 = x4 ++ x35
      val x37 = Array("post")
      val x38 = x36 ++ x37
      val x39 = x2 ++ x38
      val x40 = Array("inp")
      val x41 = x39 ++ x40
      val x43 = Array("pres")
      val x42 = x1.sideBar
      val x44 = x42.length
      val x48 = Array("pres1")
      val x65 = Array("posts1")
      val x74_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x45 = 0
      while (x45 < x44) {
        val x47 = x42.apply(x45)
        val x49 = x47.subitems
        val x50 = x49.length
        val x63_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x51 = 0
        while (x51 < x50) {
          val x53 = x49.apply(x51)
          val x54 = x53.text
          val x55 = Array("pre2", x54, "post2")
          val x56 = x55.length
          var x57 = 0
          while (x57 < x56) {
            val x58 = x55.apply(x57)
            // Sym(59)yield Map(Sym(70) -> <function1>, Sym(59) -> <function1>)previous 
            x63_buff += x58
            val x59 = ()
            x57 += 1
          }
          x51 += 1
        }
        val x63 = x63_buff.toArray
        val x64 = x48 ++ x63
        val x66 = x64 ++ x65
        val x67 = x66.length
        var x68 = 0
        while (x68 < x67) {
          val x69 = x66.apply(x68)
          // Sym(70)yield Map(Sym(70) -> <function1>)previous 
          x74_buff += x69
          val x70 = ()
          x68 += 1
        }
        x45 += 1
      }
      val x74 = x74_buff.toArray
      val x75 = x43 ++ x74
      val x76 = Array("posts")
      val x77 = x75 ++ x76
      val x78 = x41 ++ x77
      val x79 = Array("prem")
      val x80 = x78 ++ x79
      val x81 = x1.movies
      val x82 = x81.length
      val x86 = Array("prem1")
      val x88 = Array("postm1")
      val x97_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x83 = 0
      while (x83 < x82) {
        val x85 = x81.apply(x83)
        val x87 = x86 ++ x85
        val x89 = x87 ++ x88
        val x90 = x89.length
        var x91 = 0
        while (x91 < x90) {
          val x92 = x89.apply(x91)
          // Sym(93)yield Map(Sym(93) -> <function1>)previous 
          x97_buff += x92
          val x93 = ()
          x91 += 1
        }
        x83 += 1
      }
      val x97 = x97_buff.toArray
      val x98 = x79 ++ x97
      val x99 = Array("postm")
      val x100 = x98 ++ x99
      val x101 = x80 ++ x100
      val x102 = x101 // println(x101)
      x102
    }
  }
  /**
   * ***************************************
   * End of Generated Code
   * *****************************************
   */

}
