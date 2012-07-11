package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark
import com.google.caliper.{ Runner => CaliperRunner }
import parsing._
object IMDBBench {

  var page: Top250 = _
  var dellPage: DELL = _
  var cnnPage: CNN = _

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
        "/home/vojin/imdbTop250")).readObject().asInstanceOf[Top250]
    if (cnnPage == null)
      cnnPage = new java.io.ObjectInputStream(new java.io.FileInputStream(
        "/home/vojin/cnnObject")).readObject().asInstanceOf[CNN]
    if (dellPage == null)
      dellPage = new java.io.ObjectInputStream(new java.io.FileInputStream(
        "/home/vojin/dellObject")).readObject().asInstanceOf[DELL]
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

  def printSide(items: Array[Item]) = {
    Array("pre") ++ items.flatMap(x => sideItem(x)) ++ Array("post")
  }

  def sideItem(item: Item) = {
    Array("pre1", item.text) ++ item.subitems.flatMap(x => Array("post", x.text, "pre")) ++ Array("post1")
  }

  def central(items: Array[String]) = {
    Array("prec") ++ items ++ Array("postc")
  }

  def centralBelow1(item: Item) = {
    Array("prec") ++ item.subitems.flatMap(c1i) ++ Array("postc")
  }

  def c1i(item: Item) = {
    Array("prec", item.text) ++ item.subitems.flatMap(c1ii) ++ Array("postc")
  }

  def c1ii(item: Item) = {
    Array("prec", item.text, "postc")
  }

  def centralBelow2(item: Item) = {
    Array("prec", item.text) ++ item.subitems.flatMap(c2i) ++ Array("postc")
  }

  def c2i(item: Item) = {
    Array("prec", item.text) ++ item.subitems.flatMap(c2ii) ++ Array("postc")
  }

  def c2ii(item: Item) = Array("prec", item.text, "postc")

  def timeCNNTemplate(reps: Int) = repeat(reps) { 
    val res = Array("prep") ++ printSide(cnnPage.sideMenu) ++ Array("inp") ++ central(cnnPage.central) ++ Array("prem") ++
      centralBelow1(cnnPage.centralBelow1) ++ Array("postm", "pre") ++ centralBelow2(cnnPage.centralBelow2)
    res
  }

  def timecnnf(reps: Int) = repeat(reps) { val x = new cnnC(); val r = x(()); r }

  def timecnnOrig(reps: Int) = repeat(reps) { val x = new cnnorigC(); val r = x(()); r } 

  def printMenu1(items: Array[Item]) = {
    Array("pre") ++ items.flatMap(menuItem) ++ Array("post")
  }

  def menuItem1(item: Item) = {
    Array("pre1") ++ item.subitems.flatMap(innerItem1) ++ Array("post1")
  }

  def innerItem1(item: Item) = {
    Array("pre2", item.text, "post2")
  }

  def printCenter(items: Array[Item]) = {
    Array("pre") ++ items.flatMap(centerItem) ++ Array("post")
  }

  def centerItem(item: Item) = {
    Array("pre1") ++ item.subitems.flatMap(innerCenterItem) ++ Array("post1")
  }

  def innerCenterItem(item: Item) = {
    Array("pre2", item.text, "post2")
  }

  def printBottomMenu(items: Array[Item]) = {
    Array("pre") ++ items.flatMap(bottomItem) ++ Array("post")
  }

  def bottomItem(item: Item) = {
    Array("pre1") ++ item.subitems.flatMap(bottomInnerItem) ++ Array("post1")
  }

  def bottomInnerItem(item: Item) = {
    Array("pre2", item.text, "post2")
  }

  def timeDell(reps: Int) = repeat(reps) {
    val res = Array("prep") ++ printMenu1(dellPage.menu) ++ Array("inp") ++ printCenter(dellPage.center) ++ Array("prem") ++ printBottomMenu(dellPage.links)
    res
  }
  
  def timedellf(reps: Int) = repeat(reps) { val x = new dellC(); val r = x(()); r }

  def timedellOrig(reps: Int) = repeat(reps) { val x = new dellorigC(); val r = x(()); r } 


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

  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  class cnnC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x52 = Array("post")
      val x55 = Array("inp")
      val x1 = cnnPage
      val x57 = x1.central
      val x58 = Array("prec")
      val x60 = Array("postc")
      val x63 = Array("prem")
      val x115 = Array("postm", "pre")
      val x117 = x1.centralBelow2
      val x118 = x117.text
      val x119 = Array("prec", x118)
      val x120 = x117.subitems
      val x121 = x120.length
      val x255_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x122 = 0
      while (x122 < x121) {
        val x124 = x120.apply(x122)
        val x125 = x124.text
        val x126 = Array("prec", x125)
        val x259 = x126.length
        var x258 = 0
        while (x258 < x259) {
          val x260 = x126.apply(x258)
          // prev yields ArrayBuffer(Sym(161), Sym(216), Sym(245))
          x255_buff += x260
          val x245 = ()
          x258 += 1
        }
        val x127 = x124.subitems
        val x128 = x127.length
        var x129 = 0
        while (x129 < x128) {
          val x131 = x127.apply(x129)
          val x132 = x131.text
          val x133 = Array("prec", x132, "postc")
          val x282 = x133.length
          var x142 = 0
          while (x142 < x282) {
            val x283 = x133.apply(x142)
            // prev yields ArrayBuffer(Sym(161), Sym(216), Sym(245), Sym(268), Sym(290), Sym(298))
            x255_buff += x283
            val x245 = ()
            x142 += 1
          }
          x129 += 1
        }
        val x60 = Array("postc")
        val x273 = x60.length
        var x272 = 0
        while (x272 < x273) {
          val x274 = x60.apply(x272)
          // prev yields ArrayBuffer(Sym(161), Sym(216), Sym(245))
          x255_buff += x274
          val x245 = ()
          x272 += 1
        }
        val x313 = () // x263 ++ x312 ++ x277
        val x247 = x313
        x122 += 1
      }
      val x65 = x1.centralBelow1
      val x66 = x65.subitems
      val x67 = x66.length
      var x68 = 0
      while (x68 < x67) {
        val x70 = x66.apply(x68)
        val x71 = x70.text
        val x72 = Array("prec", x71)
        val x316 = x72.length
        var x315 = 0
        while (x315 < x316) {
          val x317 = x72.apply(x315)
          // prev yields ArrayBuffer(Sym(107), Sym(200), Sym(239))
          x255_buff += x317
          val x239 = ()
          x315 += 1
        }
        val x73 = x70.subitems
        val x74 = x73.length
        var x75 = 0
        while (x75 < x74) {
          val x77 = x73.apply(x75)
          val x78 = x77.text
          val x79 = Array("prec", x78, "postc")
          val x338 = x79.length
          var x88 = 0
          while (x88 < x338) {
            val x339 = x79.apply(x88)
            // prev yields ArrayBuffer(Sym(107), Sym(200), Sym(239), Sym(325), Sym(346), Sym(354))
            x255_buff += x339
            val x239 = ()
            x88 += 1
          }
          x75 += 1
        }
        val x60 = Array("postc")
        val x273 = x60.length
        var x329 = 0
        while (x329 < x273) {
          val x330 = x60.apply(x329)
          // prev yields ArrayBuffer(Sym(107), Sym(200), Sym(239))
          x255_buff += x330
          val x239 = ()
          x329 += 1
        }
        val x369 = () // x320 ++ x368 ++ x333
        val x241 = x369
        x68 += 1
      }
      val x3 = x1.sideMenu
      val x5 = x3.length
      val x34 = Array("post1")
      var x6 = 0
      while (x6 < x5) {
        val x8 = x3.apply(x6)
        val x9 = x8.text
        val x10 = Array("pre1", x9)
        val x372 = x10.length
        var x371 = 0
        while (x371 < x372) {
          val x373 = x10.apply(x371)
          // prev yields ArrayBuffer(Sym(46), Sym(182), Sym(233))
          x255_buff += x373
          val x233 = ()
          x371 += 1
        }
        val x11 = x8.subitems
        val x12 = x11.length
        var x13 = 0
        while (x13 < x12) {
          val x15 = x11.apply(x13)
          val x16 = x15.text
          val x17 = Array("post", x16, "pre")
          val x395 = x17.length
          var x26 = 0
          while (x26 < x395) {
            val x396 = x17.apply(x26)
            // prev yields ArrayBuffer(Sym(46), Sym(182), Sym(233), Sym(381), Sym(403), Sym(411))
            x255_buff += x396
            val x233 = ()
            x26 += 1
          }
          x13 += 1
        }
        val x34 = Array("post1")
        val x386 = x34.length
        var x385 = 0
        while (x385 < x386) {
          val x387 = x34.apply(x385)
          // prev yields ArrayBuffer(Sym(46), Sym(182), Sym(233))
          x255_buff += x387
          val x233 = ()
          x385 += 1
        }
        val x426 = () // x376 ++ x425 ++ x390
        val x235 = x426
        x6 += 1
      }
      val x255 = x255_buff.result
      val x256 = x255 //println(x255)
      val x169 = x256
      x169
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
  class cnnorigC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x1 = cnnPage
      val x3 = x1.sideMenu
      val x5 = x3.length
      val x27 = Array("post1")
      val x36_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x6 = 0
      while (x6 < x5) {
        val x8 = x3.apply(x6)
        val x9 = x8.text
        val x10 = Array("pre1", x9)
        val x11 = x8.subitems
        val x12 = x11.length
        val x25_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x13 = 0
        while (x13 < x12) {
          val x15 = x11.apply(x13)
          val x16 = x15.text
          val x17 = Array("post", x16, "pre")
          val x18 = x17.length
          var x19 = 0
          while (x19 < x18) {
            val x20 = x17.apply(x19)
            // Sym(21)yield Map(Sym(32) -> <function1>, Sym(21) -> <function1>)previous 
            x25_buff += x20
            val x21 = ()
            x19 += 1
          }
          x13 += 1
        }
        val x25 = x25_buff.toArray
        val x26 = x10 ++ x25
        val x28 = x26 ++ x27
        val x29 = x28.length
        var x30 = 0
        while (x30 < x29) {
          val x31 = x28.apply(x30)
          // Sym(32)yield Map(Sym(32) -> <function1>)previous 
          x36_buff += x31
          val x32 = ()
          x30 += 1
        }
        x6 += 1
      }
      val x36 = x36_buff.toArray
      val x37 = x4 ++ x36
      val x38 = Array("post")
      val x39 = x37 ++ x38
      val x40 = x2 ++ x39
      val x41 = Array("inp")
      val x42 = x40 ++ x41
      val x43 = x1.central
      val x44 = Array("prec")
      val x45 = x44 ++ x43
      val x46 = Array("postc")
      val x47 = x45 ++ x46
      val x48 = x42 ++ x47
      val x49 = Array("prem")
      val x50 = x48 ++ x49
      val x51 = x1.centralBelow1
      val x52 = x51.subitems
      val x53 = x52.length
      val x83_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x54 = 0
      while (x54 < x53) {
        val x56 = x52.apply(x54)
        val x57 = x56.text
        val x58 = Array("prec", x57)
        val x59 = x56.subitems
        val x60 = x59.length
        val x73_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x61 = 0
        while (x61 < x60) {
          val x63 = x59.apply(x61)
          val x64 = x63.text
          val x65 = Array("prec", x64, "postc")
          val x66 = x65.length
          var x67 = 0
          while (x67 < x66) {
            val x68 = x65.apply(x67)
            // Sym(69)yield Map(Sym(79) -> <function1>, Sym(69) -> <function1>)previous 
            x73_buff += x68
            val x69 = ()
            x67 += 1
          }
          x61 += 1
        }
        val x73 = x73_buff.toArray
        val x74 = x58 ++ x73
        val x75 = x74 ++ x46
        val x76 = x75.length
        var x77 = 0
        while (x77 < x76) {
          val x78 = x75.apply(x77)
          // Sym(79)yield Map(Sym(79) -> <function1>)previous 
          x83_buff += x78
          val x79 = ()
          x77 += 1
        }
        x54 += 1
      }
      val x83 = x83_buff.toArray
      val x84 = x44 ++ x83
      val x85 = x84 ++ x46
      val x86 = x50 ++ x85
      val x87 = Array("postm", "pre")
      val x88 = x86 ++ x87
      val x89 = x1.centralBelow2
      val x90 = x89.text
      val x91 = Array("prec", x90)
      val x92 = x89.subitems
      val x93 = x92.length
      val x123_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x94 = 0
      while (x94 < x93) {
        val x96 = x92.apply(x94)
        val x97 = x96.text
        val x98 = Array("prec", x97)
        val x99 = x96.subitems
        val x100 = x99.length
        val x113_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x101 = 0
        while (x101 < x100) {
          val x103 = x99.apply(x101)
          val x104 = x103.text
          val x105 = Array("prec", x104, "postc")
          val x106 = x105.length
          var x107 = 0
          while (x107 < x106) {
            val x108 = x105.apply(x107)
            // Sym(109)yield Map(Sym(119) -> <function1>, Sym(109) -> <function1>)previous 
            x113_buff += x108
            val x109 = ()
            x107 += 1
          }
          x101 += 1
        }
        val x113 = x113_buff.toArray
        val x114 = x98 ++ x113
        val x115 = x114 ++ x46
        val x116 = x115.length
        var x117 = 0
        while (x117 < x116) {
          val x118 = x115.apply(x117)
          // Sym(119)yield Map(Sym(119) -> <function1>)previous 
          x123_buff += x118
          val x119 = ()
          x117 += 1
        }
        x94 += 1
      }
      val x123 = x123_buff.toArray
      val x124 = x91 ++ x123
      val x125 = x124 ++ x46
      val x126 = x88 ++ x125
      val x127 = x126 //println(x126)
      x127
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
  class dellC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x51 = Array("post")
      val x54 = Array("inp")
      val x103 = Array("prem")
      val x1 = dellPage
      val x105 = x1.links
      val x106 = x105.length
      val x9 = Array("pre1")
      val x33 = Array("post1")
      val x228_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x107 = 0
      while (x107 < x106) {
        val x9 = Array("pre1")
        val x230 = x9.length
        var x229 = 0
        while (x229 < x230) {
          val x231 = x9.apply(x229)
          // prev yields ArrayBuffer(Sym(144), Sym(195), Sym(220))
          x228_buff += x231
          val x220 = ()
          x229 += 1
        }
        val x109 = x105.apply(x107)
        val x110 = x109.subitems
        val x111 = x110.length
        var x112 = 0
        while (x112 < x111) {
          val x114 = x110.apply(x112)
          val x115 = x114.text
          val x116 = Array("pre2", x115, "post2")
          val x253 = x116.length
          var x125 = 0
          while (x125 < x253) {
            val x254 = x116.apply(x125)
            // prev yields ArrayBuffer(Sym(144), Sym(195), Sym(220), Sym(239), Sym(261), Sym(269))
            x228_buff += x254
            val x220 = ()
            x125 += 1
          }
          x112 += 1
        }
        val x33 = Array("post1")
        val x244 = x33.length
        var x243 = 0
        while (x243 < x244) {
          val x245 = x33.apply(x243)
          // prev yields ArrayBuffer(Sym(144), Sym(195), Sym(220))
          x228_buff += x245
          val x220 = ()
          x243 += 1
        }
        val x284 = () // x234 ++ x283 ++ x248
        val x222 = x284
        x107 += 1
      }
      val x56 = x1.center
      val x57 = x56.length
      var x58 = 0
      while (x58 < x57) {
        val x9 = Array("pre1")
        val x230 = x9.length
        var x286 = 0
        while (x286 < x230) {
          val x287 = x9.apply(x286)
          // prev yields ArrayBuffer(Sym(95), Sym(179), Sym(214))
          x228_buff += x287
          val x214 = ()
          x286 += 1
        }
        val x60 = x56.apply(x58)
        val x61 = x60.subitems
        val x62 = x61.length
        var x63 = 0
        while (x63 < x62) {
          val x65 = x61.apply(x63)
          val x66 = x65.text
          val x67 = Array("pre2", x66, "post2")
          val x308 = x67.length
          var x76 = 0
          while (x76 < x308) {
            val x309 = x67.apply(x76)
            // prev yields ArrayBuffer(Sym(95), Sym(179), Sym(214), Sym(295), Sym(316), Sym(324))
            x228_buff += x309
            val x214 = ()
            x76 += 1
          }
          x63 += 1
        }
        val x33 = Array("post1")
        val x244 = x33.length
        var x299 = 0
        while (x299 < x244) {
          val x300 = x33.apply(x299)
          // prev yields ArrayBuffer(Sym(95), Sym(179), Sym(214))
          x228_buff += x300
          val x214 = ()
          x299 += 1
        }
        val x339 = () // x290 ++ x338 ++ x303
        val x216 = x339
        x58 += 1
      }
      val x3 = x1.menu
      val x5 = x3.length
      var x6 = 0
      while (x6 < x5) {
        val x9 = Array("pre1")
        val x230 = x9.length
        var x341 = 0
        while (x341 < x230) {
          val x342 = x9.apply(x341)
          // prev yields ArrayBuffer(Sym(45), Sym(163), Sym(208))
          x228_buff += x342
          val x208 = ()
          x341 += 1
        }
        val x8 = x3.apply(x6)
        val x10 = x8.subitems
        val x11 = x10.length
        var x12 = 0
        while (x12 < x11) {
          val x14 = x10.apply(x12)
          val x15 = x14.text
          val x16 = Array("pre2", x15, "post2")
          val x363 = x16.length
          var x25 = 0
          while (x25 < x363) {
            val x364 = x16.apply(x25)
            // prev yields ArrayBuffer(Sym(45), Sym(163), Sym(208), Sym(350), Sym(371), Sym(379))
            x228_buff += x364
            val x208 = ()
            x25 += 1
          }
          x12 += 1
        }
        val x33 = Array("post1")
        val x244 = x33.length
        var x354 = 0
        while (x354 < x244) {
          val x355 = x33.apply(x354)
          // prev yields ArrayBuffer(Sym(45), Sym(163), Sym(208))
          x228_buff += x355
          val x208 = ()
          x354 += 1
        }
        val x394 = () // x345 ++ x393 ++ x358
        val x210 = x394
        x6 += 1
      }
      val x228 = x228_buff.result
      val x151 = x228
      x151
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
  class dellorigC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("prep")
      val x4 = Array("pre")
      val x1 = dellPage
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
      val x42 = x1.center
      val x43 = x42.length
      val x71_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x44 = 0
      while (x44 < x43) {
        val x46 = x42.apply(x44)
        val x47 = x46.subitems
        val x48 = x47.length
        val x61_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x49 = 0
        while (x49 < x48) {
          val x51 = x47.apply(x49)
          val x52 = x51.text
          val x53 = Array("pre2", x52, "post2")
          val x54 = x53.length
          var x55 = 0
          while (x55 < x54) {
            val x56 = x53.apply(x55)
            // Sym(57)yield Map(Sym(67) -> <function1>, Sym(57) -> <function1>)previous 
            x61_buff += x56
            val x57 = ()
            x55 += 1
          }
          x49 += 1
        }
        val x61 = x61_buff.toArray
        val x62 = x9 ++ x61
        val x63 = x62 ++ x26
        val x64 = x63.length
        var x65 = 0
        while (x65 < x64) {
          val x66 = x63.apply(x65)
          // Sym(67)yield Map(Sym(67) -> <function1>)previous 
          x71_buff += x66
          val x67 = ()
          x65 += 1
        }
        x44 += 1
      }
      val x71 = x71_buff.toArray
      val x72 = x4 ++ x71
      val x73 = x72 ++ x37
      val x74 = x41 ++ x73
      val x75 = Array("prem")
      val x76 = x74 ++ x75
      val x77 = x1.links
      val x78 = x77.length
      val x106_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x79 = 0
      while (x79 < x78) {
        val x81 = x77.apply(x79)
        val x82 = x81.subitems
        val x83 = x82.length
        val x96_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x84 = 0
        while (x84 < x83) {
          val x86 = x82.apply(x84)
          val x87 = x86.text
          val x88 = Array("pre2", x87, "post2")
          val x89 = x88.length
          var x90 = 0
          while (x90 < x89) {
            val x91 = x88.apply(x90)
            // Sym(92)yield Map(Sym(102) -> <function1>, Sym(92) -> <function1>)previous 
            x96_buff += x91
            val x92 = ()
            x90 += 1
          }
          x84 += 1
        }
        val x96 = x96_buff.toArray
        val x97 = x9 ++ x96
        val x98 = x97 ++ x26
        val x99 = x98.length
        var x100 = 0
        while (x100 < x99) {
          val x101 = x98.apply(x100)
          // Sym(102)yield Map(Sym(102) -> <function1>)previous 
          x106_buff += x101
          val x102 = ()
          x100 += 1
        }
        x79 += 1
      }
      val x106 = x106_buff.toArray
      val x107 = x4 ++ x106
      val x108 = x107 ++ x37
      val x109 = x76 ++ x108
      x109
    }
  }
  /**
   * ***************************************
   * End of Generated Code
   * *****************************************
   */

}


