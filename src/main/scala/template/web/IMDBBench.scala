package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark
import com.google.caliper.{ Runner => CaliperRunner }

object IMDBBench {

  var L6F: Array[String] = _
  var L6: Array[String] = _
  var L5F: Array[String] = _
  var L5: Array[String] = _
  var L4F: Array[String] = _
  var L4: Array[String] = _
  var L3F: Array[String] = _
  var L3: Array[String] = _
  var L2F: Array[String] = _
  var L2: Array[String] = _
  var L1F: Array[String] = _
  var L1: Array[String] = _
  
  // main method for IDEs, from the CLI you can also run the caliper Runner directly
  // or simply use SBTs "run" action
  def main(args: Array[String]) {
    // we simply pass in the CLI args,
    // we could of course also just pass hardcoded arguments to the caliper Runner
    CaliperRunner.main(classOf[IMDBBench], args: _*)

  }

}
import parsing._
class IMDBBench extends SimpleScalaBenchmark with FileTemplates with Input {
  var file: SimpleFile = _
  import IMDBBench._
  var page: Top250 = _

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

  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  def timeImdbf(reps: Int) = repeat(reps) {
    val x11 = Array("pre")
    val x58 = Array("post")
    val x71 = Array("pres")
    val x118 = Array("posts")
    val x121 = Array("prem")
    val x155 = Array("postm")
    val x1 = page
    val x130 = x1.movies
    val x131 = x130.length
    val x135 = Array("prem1")
    val x137 = Array("postm1")
    val x242_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x132 = 0
    while (x132 < x131) {
      val x135 = Array("prem1")
      val x246 = x135.length
      var x245 = 0
      while (x245 < x246) {
        val x247 = x135.apply(x245)
        // prev yields ArrayBuffer(Sym(149), Sym(203), Sym(232))
        x242_buff += x247
        val x232 = ()
        x245 += 1
      }
      val x134 = x130.apply(x132)
      val x253 = x134.length
      var x252 = 0
      while (x252 < x253) {
        val x254 = x134.apply(x252)
        // prev yields ArrayBuffer(Sym(149), Sym(203), Sym(232))
        x242_buff += x254
        val x232 = ()
        x252 += 1
      }
      val x137 = Array("postm1")
      val x260 = x137.length
      var x259 = 0
      while (x259 < x260) {
        val x261 = x137.apply(x259)
        // prev yields ArrayBuffer(Sym(149), Sym(203), Sym(232))
        x242_buff += x261
        val x232 = ()
        x259 += 1
      }
      val x266 = () // x250 ++ x257 ++ x264
      val x234 = x266
      x132 += 1
    }
    val x122 = x121.length
    var x123 = 0
    while (x123 < x122) {
      val x125 = x121.apply(x123)
      // Sym(126)yield Map(Sym(126) -> <function1>)previous 
      x242_buff += x125
      val x126 = ()
      x123 += 1
    }
    val x70 = x1.sideBar
    val x72 = x70.length
    val x76 = Array("pres1")
    val x100 = Array("posts1")
    var x73 = 0
    while (x73 < x72) {
      val x76 = Array("pres1")
      val x269 = x76.length
      var x268 = 0
      while (x268 < x269) {
        val x270 = x76.apply(x268)
        // prev yields ArrayBuffer(Sym(112), Sym(187), Sym(226))
        x242_buff += x270
        val x226 = ()
        x268 += 1
      }
      val x75 = x70.apply(x73)
      val x77 = x75.subitems
      val x78 = x77.length
      var x79 = 0
      while (x79 < x78) {
        val x81 = x77.apply(x79)
        val x82 = x81.text
        val x83 = Array("pre2", x82, "post2")
        val x292 = x83.length
        var x92 = 0
        while (x92 < x292) {
          val x293 = x83.apply(x92)
          // prev yields ArrayBuffer(Sym(112), Sym(187), Sym(226), Sym(278), Sym(300), Sym(308))
          x242_buff += x293
          val x226 = ()
          x92 += 1
        }
        x79 += 1
      }
      val x100 = Array("posts1")
      val x283 = x100.length
      var x282 = 0
      while (x282 < x283) {
        val x284 = x100.apply(x282)
        // prev yields ArrayBuffer(Sym(112), Sym(187), Sym(226))
        x242_buff += x284
        val x226 = ()
        x282 += 1
      }
      val x323 = () // x273 ++ x322 ++ x287
      val x228 = x323
      x73 += 1
    }
    val x61 = Array("inp")
    val x62 = x61.length
    var x63 = 0
    while (x63 < x62) {
      val x65 = x61.apply(x63)
      // Sym(66)yield Map(Sym(66) -> <function1>)previous 
      x242_buff += x65
      val x66 = ()
      x63 += 1
    }
    val x10 = x1.menu
    val x12 = x10.length
    val x16 = Array("pre1")
    val x40 = Array("post1")
    var x13 = 0
    while (x13 < x12) {
      val x16 = Array("pre1")
      val x326 = x16.length
      var x325 = 0
      while (x325 < x326) {
        val x327 = x16.apply(x325)
        // prev yields ArrayBuffer(Sym(52), Sym(171), Sym(220))
        x242_buff += x327
        val x220 = ()
        x325 += 1
      }
      val x15 = x10.apply(x13)
      val x17 = x15.subitems
      val x18 = x17.length
      var x19 = 0
      while (x19 < x18) {
        val x21 = x17.apply(x19)
        val x22 = x21.text
        val x23 = Array("pre2", x22, "post2")
        val x349 = x23.length
        var x32 = 0
        while (x32 < x349) {
          val x350 = x23.apply(x32)
          // prev yields ArrayBuffer(Sym(52), Sym(171), Sym(220), Sym(335), Sym(357), Sym(365))
          x242_buff += x350
          val x220 = ()
          x32 += 1
        }
        x19 += 1
      }
      val x40 = Array("post1")
      val x340 = x40.length
      var x339 = 0
      while (x339 < x340) {
        val x341 = x40.apply(x339)
        // prev yields ArrayBuffer(Sym(52), Sym(171), Sym(220))
        x242_buff += x341
        val x220 = ()
        x339 += 1
      }
      val x380 = () // x330 ++ x379 ++ x344
      val x222 = x380
      x13 += 1
    }
    val x2 = Array("prep")
    val x3 = x2.length
    var x4 = 0
    while (x4 < x3) {
      val x6 = x2.apply(x4)
      // Sym(7)yield Map(Sym(7) -> <function1>)previous 
      x242_buff += x6
      val x7 = ()
      x4 += 1
    }
    val x242 = x242_buff.result
    x242
  }

  def timeImdbOrig(reps: Int) = repeat(reps) {
    val x2 = Array("prep")
    val x3 = x2.length
    val x9_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x4 = 0
    while (x4 < x3) {
      val x6 = x2.apply(x4)
      // Sym(7)yield Map(Sym(7) -> <function1>)previous 
      x9_buff += x6
      val x7 = ()
      x4 += 1
    }
    val x9 = x9_buff.toArray
    val x11 = Array("pre")
    val x1 = page
    val x10 = x1.menu
    val x12 = x10.length
    val x16 = Array("pre1")
    val x40 = Array("post1")
    val x44_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x13 = 0
    while (x13 < x12) {
      val x15 = x10.apply(x13)
      val x17 = x15.subitems
      val x18 = x17.length
      val x26_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x19 = 0
      while (x19 < x18) {
        val x21 = x17.apply(x19)
        val x22 = x21.text
        val x23 = Array("pre2", x22, "post2")
        // Sym(24)yield Map(Sym(42) -> <function1>, Sym(24) -> <function1>)previous 
        x26_buff += x23
        val x24 = ()
        x19 += 1
      }
      val x26 = x26_buff.toArray
      val x27 = x26.length
      val x38_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]

      var x28 = 0
      while (x28 < x27) {
        val x30 = x26.apply(x28)
        val x31 = x30.length
        var x32 = 0
        while (x32 < x31) {
          val x33 = x30.apply(x32)
          // Sym(34)yield Map(Sym(42) -> <function1>, Sym(34) -> <function1>)previous 
          x38_buff += x33
          val x34 = ()
          x32 += 1
        }
        x28 += 1
      }
      val x38 = x38_buff.toArray
      val x39 = x16 ++ x38
      val x41 = x39 ++ x40
      // Sym(42)yield Map(Sym(42) -> <function1>)previous 
      x44_buff += x41
      val x42 = ()
      x13 += 1
    }
    val x44 = x44_buff.toArray
    val x45 = x44.length
    val x56_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x46 = 0
    while (x46 < x45) {
      val x48 = x44.apply(x46)
      val x49 = x48.length
      var x50 = 0
      while (x50 < x49) {
        val x51 = x48.apply(x50)
        // Sym(52)yield Map(Sym(52) -> <function1>)previous 
        x56_buff += x51
        val x52 = ()
        x50 += 1
      }
      x46 += 1
    }
    val x56 = x56_buff.toArray
    val x57 = x11 ++ x56
    val x58 = Array("post")
    val x59 = x57 ++ x58
    val x60 = x9 ++ x59
    val x61 = Array("inp")
    val x62 = x61.length
    val x68_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x63 = 0
    while (x63 < x62) {
      val x65 = x61.apply(x63)
      // Sym(66)yield Map(Sym(66) -> <function1>)previous 
      x68_buff += x65
      val x66 = ()
      x63 += 1
    }
    val x68 = x68_buff.toArray
    val x69 = x60 ++ x68
    val x71 = Array("pres")
    val x70 = x1.sideBar
    val x72 = x70.length
    val x76 = Array("pres1")
    val x100 = Array("posts1")
    val x104_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x73 = 0
    while (x73 < x72) {
      val x75 = x70.apply(x73)
      val x77 = x75.subitems
      val x78 = x77.length
      val x86_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x79 = 0
      while (x79 < x78) {
        val x81 = x77.apply(x79)
        val x82 = x81.text
        val x83 = Array("pre2", x82, "post2")
        // Sym(84)yield Map(Sym(102) -> <function1>, Sym(84) -> <function1>)previous 
        x86_buff += x83
        val x84 = ()
        x79 += 1
      }
      val x86 = x86_buff.toArray
      val x87 = x86.length
      val x98_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x88 = 0
      while (x88 < x87) {
        val x90 = x86.apply(x88)
        val x91 = x90.length
        var x92 = 0
        while (x92 < x91) {
          val x93 = x90.apply(x92)
          // Sym(94)yield Map(Sym(102) -> <function1>, Sym(94) -> <function1>)previous 
          x98_buff += x93
          val x94 = ()
          x92 += 1
        }
        x88 += 1
      }
      val x98 = x98_buff.toArray
      val x99 = x76 ++ x98
      val x101 = x99 ++ x100
      // Sym(102)yield Map(Sym(102) -> <function1>)previous 
      x104_buff += x101
      val x102 = ()
      x73 += 1
    }
    val x104 = x104_buff.toArray
    val x105 = x104.length
    val x116_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x106 = 0
    while (x106 < x105) {
      val x108 = x104.apply(x106)
      val x109 = x108.length
      var x110 = 0
      while (x110 < x109) {
        val x111 = x108.apply(x110)
        // Sym(112)yield Map(Sym(112) -> <function1>)previous 
        x116_buff += x111
        val x112 = ()
        x110 += 1
      }
      x106 += 1
    }
    val x116 = x116_buff.toArray
    val x117 = x71 ++ x116
    val x118 = Array("posts")
    val x119 = x117 ++ x118
    val x120 = x69 ++ x119
    val x121 = Array("prem")
    val x122 = x121.length
    val x128_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x123 = 0
    while (x123 < x122) {
      val x125 = x121.apply(x123)
      // Sym(126)yield Map(Sym(126) -> <function1>)previous 
      x128_buff += x125
      val x126 = ()
      x123 += 1
    }
    val x128 = x128_buff.toArray
    val x129 = x120 ++ x128
    val x130 = x1.movies
    val x131 = x130.length
    val x135 = Array("prem1")
    val x137 = Array("postm1")
    val x141_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x132 = 0
    while (x132 < x131) {
      val x134 = x130.apply(x132)
      val x136 = x135 ++ x134
      val x138 = x136 ++ x137
      // Sym(139)yield Map(Sym(139) -> <function1>)previous 
      x141_buff += x138
      val x139 = ()
      x132 += 1
    }
    val x141 = x141_buff.toArray
    val x142 = x141.length
    val x153_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x143 = 0
    while (x143 < x142) {
      val x145 = x141.apply(x143)
      val x146 = x145.length
      var x147 = 0
      while (x147 < x146) {
        val x148 = x145.apply(x147)
        // Sym(149)yield Map(Sym(149) -> <function1>)previous 
        x153_buff += x148
        val x149 = ()
        x147 += 1
      }
      x143 += 1
    }
    val x153 = x153_buff.toArray
    val x154 = x121 ++ x153
    val x155 = Array("postm")
    val x156 = x154 ++ x155
    val x157 = x129 ++ x156
    x157
  }
}
