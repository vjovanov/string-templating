package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark

import com.google.caliper.{ Runner => CaliperRunner }

object IMDBBench {

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
    Array("pre") ++ item.subitems.flatMap(innerItem) ++ Array("post")
  }
  
  def innerItem(item: Item) = {
    Array("pre") ++ item.text ++ Array("post")
  }
  
  def printSideMenu(items: Array[Item]) = {
    Array("pres") ++ items.flatMap(menuItem) ++ Array("posts")    
  }
  
  def sideMenuItem(item: Item) = {
    Array("pres") ++ item.subitems.flatMap(innerItem) ++ Array("posts")
  }
  
  def sideInnerItem(item: Item) = {
    Array("pres") ++ item.text ++ Array("posts")
  }
  
  def movies(movies: Array[Array[String]]) = {
    Array("prem") ++ movies.flatMap(movie) ++ Array("postm")
  }
  
  def movie(movie: Array[String]) = 
    Array("prem") ++ movie ++ Array("postm")
  
  def timeImdbTemplate(reps: Int) = repeat(reps) {
     val res = Array("prep") ++ printMenu(page.menu) ++ Array("inp") ++ printSideMenu(page.sideBar) ++ Array("prem") ++ movies(page.movies)  
  }

  /**
 * ***************************************
 * Emitting Generated Code
 * *****************************************
 */
def timeImdbf (reps: Int) = repeat(reps) {
    val x11 = Array("pre")
    val x56 = Array("post")
    val x67 = Array("pres")
    val x112 = Array("posts")
    val x114 = Array("prem")
    val x145 = Array("postm")
    val x1 = page
    val x122 = x1.movies
    val x123 = x122.length
    val x127 = Array("prem1")
    val x128 = Array("postm1")
    val x180_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x124 = 0
    while (x124 < x123) {
      val x127 = Array("prem1")
      val x184 = x127.length
      var x183 = 0
      while (x183 < x184) {
        val x185 = x127.apply(x183)
        // prev yields ArrayBuffer(Sym(140), Sym(170))
        x180_buff += x185
        val x170 = ()
        x183 += 1
      }
      val x126 = x122.apply(x124)
      val x191 = x126.length
      var x190 = 0
      while (x190 < x191) {
        val x192 = x126.apply(x190)
        // prev yields ArrayBuffer(Sym(140), Sym(170))
        x180_buff += x192
        val x170 = ()
        x190 += 1
      }
      val x128 = Array("postm1")
      val x198 = x128.length
      var x197 = 0
      while (x197 < x198) {
        val x199 = x128.apply(x197)
        // prev yields ArrayBuffer(Sym(140), Sym(170))
        x180_buff += x199
        val x170 = ()
        x197 += 1
      }
      val x204 = () // x188 ++ x195 ++ x202
      val x172 = x204
      x124 += 1
    }
    val x115 = x114.length
    var x116 = 0
    while (x116 < x115) {
      val x118 = x114.apply(x116)
      // Sym(119)yield Map(Sym(119) -> <function1>)previous 
      x180_buff += x118
      val x119 = ()
      x116 += 1
    }
    val x66 = x1.sideBar
    val x68 = x66.length
    val x72 = Array("pres1")
    val x95 = Array("posts1")
    var x69 = 0
    while (x69 < x68) {
      val x72 = Array("pres1")
      val x207 = x72.length
      var x206 = 0
      while (x206 < x207) {
        val x208 = x72.apply(x206)
        // prev yields ArrayBuffer(Sym(107), Sym(164))
        x180_buff += x208
        val x164 = ()
        x206 += 1
      }
      val x71 = x66.apply(x69)
      val x73 = x71.subitems
      val x74 = x73.length
      var x75 = 0
      while (x75 < x74) {
        val x77 = x73.apply(x75)
        val x78 = x77.text
        val x79 = Array("pre2", x78, "post2")
        val x230 = x79.length
        var x88 = 0
        while (x88 < x230) {
          val x231 = x79.apply(x88)
          // prev yields ArrayBuffer(Sym(107), Sym(164), Sym(216), Sym(238), Sym(246))
          x180_buff += x231
          val x164 = ()
          x88 += 1
        }
        x75 += 1
      }
      val x95 = Array("posts1")
      val x221 = x95.length
      var x220 = 0
      while (x220 < x221) {
        val x222 = x95.apply(x220)
        // prev yields ArrayBuffer(Sym(107), Sym(164))
        x180_buff += x222
        val x164 = ()
        x220 += 1
      }
      val x261 = () // x211 ++ x260 ++ x225
      val x166 = x261
      x69 += 1
    }
    val x58 = Array("inp")
    val x59 = x58.length
    var x60 = 0
    while (x60 < x59) {
      val x62 = x58.apply(x60)
      // Sym(63)yield Map(Sym(63) -> <function1>)previous 
      x180_buff += x62
      val x63 = ()
      x60 += 1
    }
    val x10 = x1.menu
    val x12 = x10.length
    val x16 = Array("pre1")
    val x39 = Array("post1")
    var x13 = 0
    while (x13 < x12) {
      val x16 = Array("pre1")
      val x264 = x16.length
      var x263 = 0
      while (x263 < x264) {
        val x265 = x16.apply(x263)
        // prev yields ArrayBuffer(Sym(51), Sym(158))
        x180_buff += x265
        val x158 = ()
        x263 += 1
      }
      val x15 = x10.apply(x13)
      val x17 = x15.subitems
      val x18 = x17.length
      var x19 = 0
      while (x19 < x18) {
        val x21 = x17.apply(x19)
        val x22 = x21.text
        val x23 = Array("pre2", x22, "post2")
        val x287 = x23.length
        var x32 = 0
        while (x32 < x287) {
          val x288 = x23.apply(x32)
          // prev yields ArrayBuffer(Sym(51), Sym(158), Sym(273), Sym(295), Sym(303))
          x180_buff += x288
          val x158 = ()
          x32 += 1
        }
        x19 += 1
      }
      val x39 = Array("post1")
      val x278 = x39.length
      var x277 = 0
      while (x277 < x278) {
        val x279 = x39.apply(x277)
        // prev yields ArrayBuffer(Sym(51), Sym(158))
        x180_buff += x279
        val x158 = ()
        x277 += 1
      }
      val x318 = () // x268 ++ x317 ++ x282
      val x160 = x318
      x13 += 1
    }
    val x2 = Array("prep")
    val x3 = x2.length
    var x4 = 0
    while (x4 < x3) {
      val x6 = x2.apply(x4)
      // Sym(7)yield Map(Sym(7) -> <function1>)previous 
      x180_buff += x6
      val x7 = ()
      x4 += 1
    }
    val x180 = x180_buff.result
    x180
  }

def timeImdbOrig (reps: Int) = repeat(reps) {
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
    val x39 = Array("post1")
    val x43_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
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
        // Sym(24)yield Map(Sym(41) -> <function1>, Sym(24) -> <function1>)previous 
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
          // Sym(34)yield Map(Sym(41) -> <function1>, Sym(34) -> <function1>)previous 
          x38_buff += x33
          val x34 = ()
          x32 += 1
        }
        x28 += 1
      }
      val x38 = x38_buff.toArray
      val x40 = x16 ++ x38 ++ x39
      // Sym(41)yield Map(Sym(41) -> <function1>)previous 
      x43_buff += x40
      val x41 = ()
      x13 += 1
    }
    val x43 = x43_buff.toArray
    val x44 = x43.length
    val x55_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x45 = 0
    while (x45 < x44) {
      val x47 = x43.apply(x45)
      val x48 = x47.length
      var x49 = 0
      while (x49 < x48) {
        val x50 = x47.apply(x49)
        // Sym(51)yield Map(Sym(51) -> <function1>)previous 
        x55_buff += x50
        val x51 = ()
        x49 += 1
      }
      x45 += 1
    }
    val x55 = x55_buff.toArray
    val x56 = Array("post")
    val x57 = x11 ++ x55 ++ x56
    val x58 = Array("inp")
    val x59 = x58.length
    val x65_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x60 = 0
    while (x60 < x59) {
      val x62 = x58.apply(x60)
      // Sym(63)yield Map(Sym(63) -> <function1>)previous 
      x65_buff += x62
      val x63 = ()
      x60 += 1
    }
    val x65 = x65_buff.toArray
    val x67 = Array("pres")
    val x66 = x1.sideBar
    val x68 = x66.length
    val x72 = Array("pres1")
    val x95 = Array("posts1")
    val x99_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x69 = 0
    while (x69 < x68) {
      val x71 = x66.apply(x69)
      val x73 = x71.subitems
      val x74 = x73.length
      val x82_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x75 = 0
      while (x75 < x74) {
        val x77 = x73.apply(x75)
        val x78 = x77.text
        val x79 = Array("pre2", x78, "post2")
        // Sym(80)yield Map(Sym(97) -> <function1>, Sym(80) -> <function1>)previous 
        x82_buff += x79
        val x80 = ()
        x75 += 1
      }
      val x82 = x82_buff.toArray
      val x83 = x82.length
      val x94_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x84 = 0
      while (x84 < x83) {
        val x86 = x82.apply(x84)
        val x87 = x86.length
        var x88 = 0
        while (x88 < x87) {
          val x89 = x86.apply(x88)
          // Sym(90)yield Map(Sym(97) -> <function1>, Sym(90) -> <function1>)previous 
          x94_buff += x89
          val x90 = ()
          x88 += 1
        }
        x84 += 1
      }
      val x94 = x94_buff.toArray
      val x96 = x72 ++ x94 ++ x95
      // Sym(97)yield Map(Sym(97) -> <function1>)previous 
      x99_buff += x96
      val x97 = ()
      x69 += 1
    }
    val x99 = x99_buff.toArray
    val x100 = x99.length
    val x111_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x101 = 0
    while (x101 < x100) {
      val x103 = x99.apply(x101)
      val x104 = x103.length
      var x105 = 0
      while (x105 < x104) {
        val x106 = x103.apply(x105)
        // Sym(107)yield Map(Sym(107) -> <function1>)previous 
        x111_buff += x106
        val x107 = ()
        x105 += 1
      }
      x101 += 1
    }
    val x111 = x111_buff.toArray
    val x112 = Array("posts")
    val x113 = x67 ++ x111 ++ x112
    val x114 = Array("prem")
    val x115 = x114.length
    val x121_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x116 = 0
    while (x116 < x115) {
      val x118 = x114.apply(x116)
      // Sym(119)yield Map(Sym(119) -> <function1>)previous 
      x121_buff += x118
      val x119 = ()
      x116 += 1
    }
    val x121 = x121_buff.toArray
    val x122 = x1.movies
    val x123 = x122.length
    val x127 = Array("prem1")
    val x128 = Array("postm1")
    val x132_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x124 = 0
    while (x124 < x123) {
      val x126 = x122.apply(x124)
      val x129 = x127 ++ x126 ++ x128
      // Sym(130)yield Map(Sym(130) -> <function1>)previous 
      x132_buff += x129
      val x130 = ()
      x124 += 1
    }
    val x132 = x132_buff.toArray
    val x133 = x132.length
    val x144_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x134 = 0
    while (x134 < x133) {
      val x136 = x132.apply(x134)
      val x137 = x136.length
      var x138 = 0
      while (x138 < x137) {
        val x139 = x136.apply(x138)
        // Sym(140)yield Map(Sym(140) -> <function1>)previous 
        x144_buff += x139
        val x140 = ()
        x138 += 1
      }
      x134 += 1
    }
    val x144 = x144_buff.toArray
    val x145 = Array("postm")
    val x146 = x114 ++ x144 ++ x145
    val x147 = x9 ++ x57 ++ x65 ++ x113 ++ x121 ++ x146
    x147
  }
}
