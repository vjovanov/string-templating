package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark

import com.google.caliper.{ Runner => CaliperRunner }

object FileSystemBench {

  var file: SimpleFile = _
  // main method for IDEs, from the CLI you can also run the caliper Runner directly
  // or simply use SBTs "run" action
  def main(args: Array[String]) {
    // we simply pass in the CLI args,
    // we could of course also just pass hardcoded arguments to the caliper Runner
    CaliperRunner.main(classOf[FileSystemBench], args: _*)

  }

}

class FileSystemBench extends SimpleScalaBenchmark with FileTemplates with Input {

  import FileSystemBench._

  override def setUp() {
    if (file == null)
      //        file = parse("/home/vojin/fs")
      file = parseIdealTree(8)
  }

  
  
  def timeL6S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f1(file) ++ Array("""</body></html>""")
    res
  }

  def timeL6orig(reps: Int) = repeat(reps) { val x = new timeL6origC; val r = x.apply(()); r }

  def timeL6(reps: Int) = repeat(reps) { val x = new timeL6C; val r = x.apply(()); r }

  
  
  def timeL5S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f2(file) ++ Array("""</body></html>""")
    res
  }

  def timeL5orig(reps: Int) = repeat(reps) { val x = new timeL5origC; val r = x.apply(()); r }

  def timeL5(reps: Int) = repeat(reps) { val x = new timeL5C; val r = x.apply(()); r }

  
  
  def timeL4S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f3(file) ++ Array("""</body></html>""")
    res
  }

  def timeL4orig(reps: Int) = repeat(reps) { val x = new timeL4origC; val r = x.apply(()); r }

  def timeL4(reps: Int) = repeat(reps) { val x = new timeL4C; val r = x.apply(()); r }

  
  
  def timeL3S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f4(file) ++ Array("""</body></html>""")
    res
  }
  
  def timeL3orig(reps: Int) = repeat(reps) { val x = new timeL3origC; val r = x.apply(()); r }
  
  def timeL3(reps: Int) = repeat(reps) { val x = new timeL3C; val r = x.apply(()); r }

  
  
  def timeL2S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f5(file) ++ Array("""</body></html>""")
    res
  }

  def timeL2orig(reps: Int) = repeat(reps) { val x = new timeL2origC; val r = x.apply(()); r }

  def timeL2(reps: Int) = repeat(reps) { val x = new timeL6origC; val r = x.apply(()); r }

  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  class timeL6C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a><br/>")
      val x127 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x145_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x149 = x13.length
        var x148 = 0
        while (x148 < x149) {
          val x150 = x13.apply(x148)
          // prev yields ArrayBuffer(Sym(120), Sym(137))
          x145_buff += x150
          val x137 = ()
          x148 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x199 = x21.length
          var x198 = 0
          while (x198 < x199) {
            val x200 = x21.apply(x198)
            // prev yields ArrayBuffer(Sym(120), Sym(137), Sym(158), Sym(173), Sym(181), Sym(189))
            x145_buff += x200
            val x137 = ()
            x198 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x249 = x29.length
            var x248 = 0
            while (x248 < x249) {
              val x250 = x29.apply(x248)
              // prev yields ArrayBuffer(Sym(120), Sym(137), Sym(158), Sym(173), Sym(181), Sym(189), Sym(208), Sym(223), Sym(231), Sym(239))
              x145_buff += x250
              val x137 = ()
              x248 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x299 = x37.length
              var x298 = 0
              while (x298 < x299) {
                val x300 = x37.apply(x298)
                // prev yields ArrayBuffer(Sym(120), Sym(137), Sym(158), Sym(173), Sym(181), Sym(189), Sym(208), Sym(223), Sym(231), Sym(239), Sym(258), Sym(273), Sym(281), Sym(289))
                x145_buff += x300
                val x137 = ()
                x298 += 1
              }
              val x38 = x34.files
              val x39 = x38.length
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x315 = x45.length
                var x54 = 0
                while (x54 < x315) {
                  val x316 = x45.apply(x54)
                  // prev yields ArrayBuffer(Sym(120), Sym(137), Sym(158), Sym(173), Sym(181), Sym(189), Sym(208), Sym(223), Sym(231), Sym(239), Sym(258), Sym(273), Sym(281), Sym(289), Sym(308), Sym(323), Sym(331))
                  x145_buff += x316
                  val x137 = ()
                  x54 += 1
                }
                x40 += 1
              }
              val x346 = () // x303 ++ x345
              val x293 = x346
              x32 += 1
            }
            val x296 = () // x253 ++ x295
            val x243 = x296
            x24 += 1
          }
          val x246 = () // x203 ++ x245
          val x193 = x246
          x16 += 1
        }
        val x196 = () // x153 ++ x195
        val x139 = x196
        x8 += 1
      }
      val x145 = x145_buff.result
      val x146 = x145 // println(x145)
      val x129 = x146
      x129
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
  class timeL5C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x103 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x121_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x125 = x13.length
        var x124 = 0
        while (x124 < x125) {
          val x126 = x13.apply(x124)
          // prev yields ArrayBuffer(Sym(96), Sym(113))
          x121_buff += x126
          val x113 = ()
          x124 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x175 = x21.length
          var x174 = 0
          while (x174 < x175) {
            val x176 = x21.apply(x174)
            // prev yields ArrayBuffer(Sym(96), Sym(113), Sym(134), Sym(149), Sym(157), Sym(165))
            x121_buff += x176
            val x113 = ()
            x174 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x225 = x29.length
            var x224 = 0
            while (x224 < x225) {
              val x226 = x29.apply(x224)
              // prev yields ArrayBuffer(Sym(96), Sym(113), Sym(134), Sym(149), Sym(157), Sym(165), Sym(184), Sym(199), Sym(207), Sym(215))
              x121_buff += x226
              val x113 = ()
              x224 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x241 = x37.length
              var x46 = 0
              while (x46 < x241) {
                val x242 = x37.apply(x46)
                // prev yields ArrayBuffer(Sym(96), Sym(113), Sym(134), Sym(149), Sym(157), Sym(165), Sym(184), Sym(199), Sym(207), Sym(215), Sym(234), Sym(249), Sym(257))
                x121_buff += x242
                val x113 = ()
                x46 += 1
              }
              x32 += 1
            }
            val x272 = () // x229 ++ x271
            val x219 = x272
            x24 += 1
          }
          val x222 = () // x179 ++ x221
          val x169 = x222
          x16 += 1
        }
        val x172 = () // x129 ++ x171
        val x115 = x172
        x8 += 1
      }
      val x121 = x121_buff.result
      val x122 = x121 // println(x121)
      val x105 = x122
      x105
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
  class timeL4C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x79 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x97_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x101 = x13.length
        var x100 = 0
        while (x100 < x101) {
          val x102 = x13.apply(x100)
          // prev yields ArrayBuffer(Sym(72), Sym(89))
          x97_buff += x102
          val x89 = ()
          x100 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x151 = x21.length
          var x150 = 0
          while (x150 < x151) {
            val x152 = x21.apply(x150)
            // prev yields ArrayBuffer(Sym(72), Sym(89), Sym(110), Sym(125), Sym(133), Sym(141))
            x97_buff += x152
            val x89 = ()
            x150 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x167 = x29.length
            var x38 = 0
            while (x38 < x167) {
              val x168 = x29.apply(x38)
              // prev yields ArrayBuffer(Sym(72), Sym(89), Sym(110), Sym(125), Sym(133), Sym(141), Sym(160), Sym(175), Sym(183))
              x97_buff += x168
              val x89 = ()
              x38 += 1
            }
            x24 += 1
          }
          val x198 = () // x155 ++ x197
          val x145 = x198
          x16 += 1
        }
        val x148 = () // x105 ++ x147
        val x91 = x148
        x8 += 1
      }
      val x97 = x97_buff.result
      val x98 = x97 // println(x97)
      val x81 = x98
      x81
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
  class timeL3C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x55 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x73_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x77 = x13.length
        var x76 = 0
        while (x76 < x77) {
          val x78 = x13.apply(x76)
          // prev yields ArrayBuffer(Sym(48), Sym(65))
          x73_buff += x78
          val x65 = ()
          x76 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x93 = x21.length
          var x30 = 0
          while (x30 < x93) {
            val x94 = x21.apply(x30)
            // prev yields ArrayBuffer(Sym(48), Sym(65), Sym(86), Sym(101), Sym(109))
            x73_buff += x94
            val x65 = ()
            x30 += 1
          }
          x16 += 1
        }
        val x124 = () // x81 ++ x123
        val x67 = x124
        x8 += 1
      }
      val x73 = x73_buff.result
      val x74 = x73 // println(x73)
      val x57 = x74
      x57
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
  class timeL2C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x31 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x49_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x39 = x13.length
        var x22 = 0
        while (x22 < x39) {
          val x40 = x13.apply(x22)
          // Sym(41)yield Map(Sym(41) -> <function1>)previous 
          x49_buff += x40
          val x41 = ()
          x22 += 1
        }
        x8 += 1
      }
      val x49 = x49_buff.result
      val x50 = x49 // println(x49)
      val x33 = x50
      x33
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
  class timeL6origC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x89_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("-&nbsp;<a href='", x11, "'>", x12, "</a><br/>")
        val x14 = x10.files
        val x15 = x14.length
        val x80_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x22 = x18.files
          val x23 = x22.length
          val x71_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x30 = x26.files
            val x31 = x30.length
            val x62_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x38 = x34.files
              val x39 = x38.length
              val x53_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x46 = x45.length
                var x47 = 0
                while (x47 < x46) {
                  val x48 = x45.apply(x47)
                  // Sym(49)yield Map(Sym(85) -> <function1>, Sym(67) -> <function1>, Sym(58) -> <function1>, Sym(76) -> <function1>, Sym(49) -> <function1>)previous 
                  x53_buff += x48
                  val x49 = ()
                  x47 += 1
                }
                x40 += 1
              }
              val x53 = x53_buff.toArray
              val x54 = x37 ++ x53
              val x55 = x54.length
              var x56 = 0
              while (x56 < x55) {
                val x57 = x54.apply(x56)
                // Sym(58)yield Map(Sym(85) -> <function1>, Sym(76) -> <function1>, Sym(67) -> <function1>, Sym(58) -> <function1>)previous 
                x62_buff += x57
                val x58 = ()
                x56 += 1
              }
              x32 += 1
            }
            val x62 = x62_buff.toArray
            val x63 = x29 ++ x62
            val x64 = x63.length
            var x65 = 0
            while (x65 < x64) {
              val x66 = x63.apply(x65)
              // Sym(67)yield Map(Sym(85) -> <function1>, Sym(76) -> <function1>, Sym(67) -> <function1>)previous 
              x71_buff += x66
              val x67 = ()
              x65 += 1
            }
            x24 += 1
          }
          val x71 = x71_buff.toArray
          val x72 = x21 ++ x71
          val x73 = x72.length
          var x74 = 0
          while (x74 < x73) {
            val x75 = x72.apply(x74)
            // Sym(76)yield Map(Sym(85) -> <function1>, Sym(76) -> <function1>)previous 
            x80_buff += x75
            val x76 = ()
            x74 += 1
          }
          x16 += 1
        }
        val x80 = x80_buff.toArray
        val x81 = x13 ++ x80
        val x82 = x81.length
        var x83 = 0
        while (x83 < x82) {
          val x84 = x81.apply(x83)
          // Sym(85)yield Map(Sym(85) -> <function1>)previous 
          x89_buff += x84
          val x85 = ()
          x83 += 1
        }
        x8 += 1
      }
      val x89 = x89_buff.toArray
      val x90 = x5 ++ x89
      val x91 = x2 ++ x90
      val x92 = Array("</body></html>")
      val x93 = x91 ++ x92
      val x94 = x93 // println(x93)
      x94
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
  class timeL5origC extends ((Unit) => (Any)) {
    def apply(x96: Unit): Any = {
      val x92 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x97 = Array("-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x162_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x98 = 0
      while (x98 < x7) {
        val x100 = x6.apply(x98)
        val x101 = x100.path
        val x102 = x100.name
        val x103 = Array("-&nbsp;-&nbsp;<a href='", x101, "'>", x102, "</a><br/>")
        val x104 = x100.files
        val x105 = x104.length
        val x153_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x106 = 0
        while (x106 < x105) {
          val x108 = x104.apply(x106)
          val x109 = x108.path
          val x110 = x108.name
          val x111 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x109, "'>", x110, "</a><br/>")
          val x112 = x108.files
          val x113 = x112.length
          val x144_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x114 = 0
          while (x114 < x113) {
            val x116 = x112.apply(x114)
            val x117 = x116.path
            val x118 = x116.name
            val x119 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x117, "'>", x118, "</a><br/>")
            val x120 = x116.files
            val x121 = x120.length
            val x135_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x122 = 0
            while (x122 < x121) {
              val x124 = x120.apply(x122)
              val x125 = x124.path
              val x126 = x124.name
              val x127 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x125, "'>", x126, "</a><br/>")
              val x128 = x127.length
              var x129 = 0
              while (x129 < x128) {
                val x130 = x127.apply(x129)
                // Sym(131)yield Map(Sym(158) -> <function1>, Sym(149) -> <function1>, Sym(140) -> <function1>, Sym(131) -> <function1>)previous 
                x135_buff += x130
                val x131 = ()
                x129 += 1
              }
              x122 += 1
            }
            val x135 = x135_buff.toArray
            val x136 = x119 ++ x135
            val x137 = x136.length
            var x138 = 0
            while (x138 < x137) {
              val x139 = x136.apply(x138)
              // Sym(140)yield Map(Sym(158) -> <function1>, Sym(149) -> <function1>, Sym(140) -> <function1>)previous 
              x144_buff += x139
              val x140 = ()
              x138 += 1
            }
            x114 += 1
          }
          val x144 = x144_buff.toArray
          val x145 = x111 ++ x144
          val x146 = x145.length
          var x147 = 0
          while (x147 < x146) {
            val x148 = x145.apply(x147)
            // Sym(149)yield Map(Sym(158) -> <function1>, Sym(149) -> <function1>)previous 
            x153_buff += x148
            val x149 = ()
            x147 += 1
          }
          x106 += 1
        }
        val x153 = x153_buff.toArray
        val x154 = x103 ++ x153
        val x155 = x154.length
        var x156 = 0
        while (x156 < x155) {
          val x157 = x154.apply(x156)
          // Sym(158)yield Map(Sym(158) -> <function1>)previous 
          x162_buff += x157
          val x158 = ()
          x156 += 1
        }
        x98 += 1
      }
      val x162 = x162_buff.toArray
      val x163 = x97 ++ x162
      val x164 = x2 ++ x163
      val x165 = x164 ++ x92
      val x166 = x165 // println(x165)
      x166
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
  class timeL4origC extends ((Unit) => (Any)) {
    def apply(x168: Unit): Any = {
      val x92 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x169 = Array("-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x217_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x170 = 0
      while (x170 < x7) {
        val x172 = x6.apply(x170)
        val x173 = x172.path
        val x174 = x172.name
        val x175 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x173, "'>", x174, "</a><br/>")
        val x176 = x172.files
        val x177 = x176.length
        val x208_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x178 = 0
        while (x178 < x177) {
          val x180 = x176.apply(x178)
          val x181 = x180.path
          val x182 = x180.name
          val x183 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x181, "'>", x182, "</a><br/>")
          val x184 = x180.files
          val x185 = x184.length
          val x199_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x186 = 0
          while (x186 < x185) {
            val x188 = x184.apply(x186)
            val x189 = x188.path
            val x190 = x188.name
            val x191 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x189, "'>", x190, "</a><br/>")
            val x192 = x191.length
            var x193 = 0
            while (x193 < x192) {
              val x194 = x191.apply(x193)
              // Sym(195)yield Map(Sym(213) -> <function1>, Sym(204) -> <function1>, Sym(195) -> <function1>)previous 
              x199_buff += x194
              val x195 = ()
              x193 += 1
            }
            x186 += 1
          }
          val x199 = x199_buff.toArray
          val x200 = x183 ++ x199
          val x201 = x200.length
          var x202 = 0
          while (x202 < x201) {
            val x203 = x200.apply(x202)
            // Sym(204)yield Map(Sym(213) -> <function1>, Sym(204) -> <function1>)previous 
            x208_buff += x203
            val x204 = ()
            x202 += 1
          }
          x178 += 1
        }
        val x208 = x208_buff.toArray
        val x209 = x175 ++ x208
        val x210 = x209.length
        var x211 = 0
        while (x211 < x210) {
          val x212 = x209.apply(x211)
          // Sym(213)yield Map(Sym(213) -> <function1>)previous 
          x217_buff += x212
          val x213 = ()
          x211 += 1
        }
        x170 += 1
      }
      val x217 = x217_buff.toArray
      val x218 = x169 ++ x217
      val x219 = x2 ++ x218
      val x220 = x219 ++ x92
      val x221 = x220 // println(x220)
      x221
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
  class timeL3origC extends ((Unit) => (Any)) {
    def apply(x223: Unit): Any = {
      val x92 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x224 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x255_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x225 = 0
      while (x225 < x7) {
        val x227 = x6.apply(x225)
        val x228 = x227.path
        val x229 = x227.name
        val x230 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x228, "'>", x229, "</a><br/>")
        val x231 = x227.files
        val x232 = x231.length
        val x246_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x233 = 0
        while (x233 < x232) {
          val x235 = x231.apply(x233)
          val x236 = x235.path
          val x237 = x235.name
          val x238 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x236, "'>", x237, "</a><br/>")
          val x239 = x238.length
          var x240 = 0
          while (x240 < x239) {
            val x241 = x238.apply(x240)
            // Sym(242)yield Map(Sym(251) -> <function1>, Sym(242) -> <function1>)previous 
            x246_buff += x241
            val x242 = ()
            x240 += 1
          }
          x233 += 1
        }
        val x246 = x246_buff.toArray
        val x247 = x230 ++ x246
        val x248 = x247.length
        var x249 = 0
        while (x249 < x248) {
          val x250 = x247.apply(x249)
          // Sym(251)yield Map(Sym(251) -> <function1>)previous 
          x255_buff += x250
          val x251 = ()
          x249 += 1
        }
        x225 += 1
      }
      val x255 = x255_buff.toArray
      val x256 = x224 ++ x255
      val x257 = x2 ++ x256
      val x258 = x257 ++ x92
      val x259 = x258 // println(x258)
      x259
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
  class timeL2origC extends ((Unit) => (Any)) {
    def apply(x261: Unit): Any = {
      val x92 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x262 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x276_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x263 = 0
      while (x263 < x7) {
        val x265 = x6.apply(x263)
        val x266 = x265.path
        val x267 = x265.name
        val x268 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x266, "'>", x267, "</a><br/>")
        val x269 = x268.length
        var x270 = 0
        while (x270 < x269) {
          val x271 = x268.apply(x270)
          // Sym(272)yield Map(Sym(272) -> <function1>)previous 
          x276_buff += x271
          val x272 = ()
          x270 += 1
        }
        x263 += 1
      }
      val x276 = x276_buff.toArray
      val x277 = x262 ++ x276
      val x278 = x2 ++ x277
      val x279 = x278 ++ x92
      val x280 = x279 // println(x279)
      x280
    }
  }
  /**
   * ***************************************
   * End of Generated Code
   * *****************************************
   */

}

