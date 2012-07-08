package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark

import com.google.caliper.{ Runner => CaliperRunner }

object LMS6 {
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
    CaliperRunner.main(classOf[LMS6], args: _*)

    assert(L6F == L6)
    assert(L5F == L5)
    assert(L4F == L4)
    assert(L3F == L3)
    assert(L2F == L2)
    assert(L1F == L1)
    println(L1F)
  }

}

class LMS6 extends SimpleScalaBenchmark with FileTemplates with Input {
  var file: SimpleFile = _
  import LMS6._

  override def setUp() {
    if (file == null)
        file = parse("/tmp/fs")
//      file = parseIdealTree(2)
  }

  def time1  (reps: Int) = repeat(reps) {
    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x13 = x1.files
    val x14 = x13.length
    val x150_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x15 = 0
    while (x15 < x14) {
      val x17 = x13.apply(x15)
      val x18 = x17.path
      val x19 = x17.name
      val x20 = Array("-&nbsp;<a href='", x18, "'>", x19, "</a><br/>")
      val x155 = x20.length
      var x154 = 0
      while (x154 < x155) {
        val x156 = x20.apply(x154)
        // prev yields ArrayBuffer(Sym(127), Sym(143))
        x150_buff += x156
        val x143 = ()
        x154 += 1
      }
      val x21 = x17.files
      val x22 = x21.length
      var x23 = 0
      while (x23 < x22) {
        val x25 = x21.apply(x23)
        val x26 = x25.path
        val x27 = x25.name
        val x28 = Array("-&nbsp;-&nbsp;<a href='", x26, "'>", x27, "</a><br/>")
        val x205 = x28.length
        var x204 = 0
        while (x204 < x205) {
          val x206 = x28.apply(x204)
          // prev yields ArrayBuffer(Sym(127), Sym(143), Sym(164), Sym(179), Sym(187), Sym(195))
          x150_buff += x206
          val x143 = ()
          x204 += 1
        }
        val x29 = x25.files
        val x30 = x29.length
        var x31 = 0
        while (x31 < x30) {
          val x33 = x29.apply(x31)
          val x34 = x33.path
          val x35 = x33.name
          val x36 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x34, "'>", x35, "</a><br/>")
          val x255 = x36.length
          var x254 = 0
          while (x254 < x255) {
            val x256 = x36.apply(x254)
            // prev yields ArrayBuffer(Sym(127), Sym(143), Sym(164), Sym(179), Sym(187), Sym(195), Sym(214), Sym(229), Sym(237), Sym(245))
            x150_buff += x256
            val x143 = ()
            x254 += 1
          }
          val x37 = x33.files
          val x38 = x37.length
          var x39 = 0
          while (x39 < x38) {
            val x41 = x37.apply(x39)
            val x42 = x41.path
            val x43 = x41.name
            val x44 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x42, "'>", x43, "</a><br/>")
            val x305 = x44.length
            var x304 = 0
            while (x304 < x305) {
              val x306 = x44.apply(x304)
              // prev yields ArrayBuffer(Sym(127), Sym(143), Sym(164), Sym(179), Sym(187), Sym(195), Sym(214), Sym(229), Sym(237), Sym(245), Sym(264), Sym(279), Sym(287), Sym(295))
              x150_buff += x306
              val x143 = ()
              x304 += 1
            }
            val x45 = x41.files
            val x46 = x45.length
            var x47 = 0
            while (x47 < x46) {
              val x49 = x45.apply(x47)
              val x50 = x49.path
              val x51 = x49.name
              val x52 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x50, "'>", x51, "</a><br/>")
              val x321 = x52.length
              var x61 = 0
              while (x61 < x321) {
                val x322 = x52.apply(x61)
                // prev yields ArrayBuffer(Sym(127), Sym(143), Sym(164), Sym(179), Sym(187), Sym(195), Sym(214), Sym(229), Sym(237), Sym(245), Sym(264), Sym(279), Sym(287), Sym(295), Sym(314), Sym(329), Sym(337))
                x150_buff += x322
                val x143 = ()
                x61 += 1
              }
              x47 += 1
            }
            val x352 = () // x309 ++ x351
            val x299 = x352
            x39 += 1
          }
          val x302 = () // x259 ++ x301
          val x249 = x302
          x31 += 1
        }
        val x252 = () // x209 ++ x251
        val x199 = x252
        x23 += 1
      }
      val x202 = () // x159 ++ x201
      val x145 = x202
      x15 += 1
    }
    val x150 = x150_buff.toArray
    val x3 = x1.path
    val x4 = x1.name
    val x5 = Array("<a href='", x3, "'>", x4, "</a><br/>")
    val x6 = x5.length
    val x12_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x7 = 0
    while (x7 < x6) {
      val x9 = x5.apply(x7)
      // Sym(10)yield Map(Sym(10) -> <function1>)previous 
      x12_buff += x9
      val x10 = ()
      x7 += 1
    }
    val x12 = x12_buff.toArray
    val x151 = () // x2 ++ x12 ++ x150 ++ x133
    val x152 = println(x151)
    val x135 = x152
    x135
  }

  def time2  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x355 = Array("-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x466_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x356 = 0
    while (x356 < x14) {
      val x358 = x13.apply(x356)
      val x359 = x358.path
      val x360 = x358.name
      val x361 = Array("-&nbsp;-&nbsp;<a href='", x359, "'>", x360, "</a><br/>")
      val x471 = x361.length
      var x470 = 0
      while (x470 < x471) {
        val x472 = x361.apply(x470)
        // prev yields ArrayBuffer(Sym(444), Sym(459))
        x466_buff += x472
        val x459 = ()
        x470 += 1
      }
      val x362 = x358.files
      val x363 = x362.length
      var x364 = 0
      while (x364 < x363) {
        val x366 = x362.apply(x364)
        val x367 = x366.path
        val x368 = x366.name
        val x369 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x367, "'>", x368, "</a><br/>")
        val x521 = x369.length
        var x520 = 0
        while (x520 < x521) {
          val x522 = x369.apply(x520)
          // prev yields ArrayBuffer(Sym(444), Sym(459), Sym(480), Sym(495), Sym(503), Sym(511))
          x466_buff += x522
          val x459 = ()
          x520 += 1
        }
        val x370 = x366.files
        val x371 = x370.length
        var x372 = 0
        while (x372 < x371) {
          val x374 = x370.apply(x372)
          val x375 = x374.path
          val x376 = x374.name
          val x377 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x375, "'>", x376, "</a><br/>")
          val x571 = x377.length
          var x570 = 0
          while (x570 < x571) {
            val x572 = x377.apply(x570)
            // prev yields ArrayBuffer(Sym(444), Sym(459), Sym(480), Sym(495), Sym(503), Sym(511), Sym(530), Sym(545), Sym(553), Sym(561))
            x466_buff += x572
            val x459 = ()
            x570 += 1
          }
          val x378 = x374.files
          val x379 = x378.length
          var x380 = 0
          while (x380 < x379) {
            val x382 = x378.apply(x380)
            val x383 = x382.path
            val x384 = x382.name
            val x385 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x383, "'>", x384, "</a><br/>")
            val x587 = x385.length
            var x394 = 0
            while (x394 < x587) {
              val x588 = x385.apply(x394)
              // prev yields ArrayBuffer(Sym(444), Sym(459), Sym(480), Sym(495), Sym(503), Sym(511), Sym(530), Sym(545), Sym(553), Sym(561), Sym(580), Sym(595), Sym(603))
              x466_buff += x588
              val x459 = ()
              x394 += 1
            }
            x380 += 1
          }
          val x618 = () // x575 ++ x617
          val x565 = x618
          x372 += 1
        }
        val x568 = () // x525 ++ x567
        val x515 = x568
        x364 += 1
      }
      val x518 = () // x475 ++ x517
      val x461 = x518
      x356 += 1
    }
    val x466 = x466_buff.toArray
    val x467 = () // x2 ++ x355 ++ x466 ++ x133
    val x468 = println(x467)
    val x451 = x468
    x451
  }

  def time3  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x621 = Array("-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x708_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x622 = 0
    while (x622 < x14) {
      val x624 = x13.apply(x622)
      val x625 = x624.path
      val x626 = x624.name
      val x627 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x625, "'>", x626, "</a><br/>")
      val x713 = x627.length
      var x712 = 0
      while (x712 < x713) {
        val x714 = x627.apply(x712)
        // prev yields ArrayBuffer(Sym(686), Sym(701))
        x708_buff += x714
        val x701 = ()
        x712 += 1
      }
      val x628 = x624.files
      val x629 = x628.length
      var x630 = 0
      while (x630 < x629) {
        val x632 = x628.apply(x630)
        val x633 = x632.path
        val x634 = x632.name
        val x635 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x633, "'>", x634, "</a><br/>")
        val x763 = x635.length
        var x762 = 0
        while (x762 < x763) {
          val x764 = x635.apply(x762)
          // prev yields ArrayBuffer(Sym(686), Sym(701), Sym(722), Sym(737), Sym(745), Sym(753))
          x708_buff += x764
          val x701 = ()
          x762 += 1
        }
        val x636 = x632.files
        val x637 = x636.length
        var x638 = 0
        while (x638 < x637) {
          val x640 = x636.apply(x638)
          val x641 = x640.path
          val x642 = x640.name
          val x643 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x641, "'>", x642, "</a><br/>")
          val x779 = x643.length
          var x652 = 0
          while (x652 < x779) {
            val x780 = x643.apply(x652)
            // prev yields ArrayBuffer(Sym(686), Sym(701), Sym(722), Sym(737), Sym(745), Sym(753), Sym(772), Sym(787), Sym(795))
            x708_buff += x780
            val x701 = ()
            x652 += 1
          }
          x638 += 1
        }
        val x810 = () // x767 ++ x809
        val x757 = x810
        x630 += 1
      }
      val x760 = () // x717 ++ x759
      val x703 = x760
      x622 += 1
    }
    val x708 = x708_buff.toArray
    val x709 = () // x2 ++ x621 ++ x708 ++ x133
    val x710 = println(x709)
    val x693 = x710
    x693
  }

  def time4  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x813 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x876_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x814 = 0
    while (x814 < x14) {
      val x816 = x13.apply(x814)
      val x817 = x816.path
      val x818 = x816.name
      val x819 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x817, "'>", x818, "</a><br/>")
      val x881 = x819.length
      var x880 = 0
      while (x880 < x881) {
        val x882 = x819.apply(x880)
        // prev yields ArrayBuffer(Sym(854), Sym(869))
        x876_buff += x882
        val x869 = ()
        x880 += 1
      }
      val x820 = x816.files
      val x821 = x820.length
      var x822 = 0
      while (x822 < x821) {
        val x824 = x820.apply(x822)
        val x825 = x824.path
        val x826 = x824.name
        val x827 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x825, "'>", x826, "</a><br/>")
        val x897 = x827.length
        var x836 = 0
        while (x836 < x897) {
          val x898 = x827.apply(x836)
          // prev yields ArrayBuffer(Sym(854), Sym(869), Sym(890), Sym(905), Sym(913))
          x876_buff += x898
          val x869 = ()
          x836 += 1
        }
        x822 += 1
      }
      val x928 = () // x885 ++ x927
      val x871 = x928
      x814 += 1
    }
    val x876 = x876_buff.toArray
    val x877 = () // x2 ++ x813 ++ x876 ++ x133
    val x878 = println(x877)
    val x861 = x878
    x861
  }

  def time5  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x931 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x970_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x932 = 0
    while (x932 < x14) {
      val x934 = x13.apply(x932)
      val x935 = x934.path
      val x936 = x934.name
      val x937 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x935, "'>", x936, "</a><br/>")
      val x961 = x937.length
      var x946 = 0
      while (x946 < x961) {
        val x962 = x937.apply(x946)
        // Sym(963)yield Map(Sym(963) -> <function1>)previous 
        x970_buff += x962
        val x963 = ()
        x946 += 1
      }
      x932 += 1
    }
    val x970 = x970_buff.toArray
    val x971 = () // x2 ++ x931 ++ x970 ++ x133
    val x972 = println(x971)
    val x955 = x972
    x955
}

def time1orig  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x5 = Array("<a href='", x3, "'>", x4, "</a><br/>")
    val x6 = x5.length
    val x12_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x7 = 0
    while (x7 < x6) {
      val x9 = x5.apply(x7)
      // Sym(10)yield Map(Sym(10) -> <function1>)previous 
      x12_buff += x9
      val x10 = ()
      x7 += 1
    }
    val x12 = x12_buff.toArray
    val x13 = x1.files
    val x14 = x13.length
    val x119_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x15 = 0
    while (x15 < x14) {
      val x17 = x13.apply(x15)
      val x18 = x17.path
      val x19 = x17.name
      val x20 = Array("-&nbsp;<a href='", x18, "'>", x19, "</a><br/>")
      val x21 = x17.files
      val x22 = x21.length
      val x103_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x23 = 0
      while (x23 < x22) {
        val x25 = x21.apply(x23)
        val x26 = x25.path
        val x27 = x25.name
        val x28 = Array("-&nbsp;-&nbsp;<a href='", x26, "'>", x27, "</a><br/>")
        val x29 = x25.files
        val x30 = x29.length
        val x87_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x31 = 0
        while (x31 < x30) {
          val x33 = x29.apply(x31)
          val x34 = x33.path
          val x35 = x33.name
          val x36 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x34, "'>", x35, "</a><br/>")
          val x37 = x33.files
          val x38 = x37.length
          val x71_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
          var x39 = 0
          while (x39 < x38) {
            val x41 = x37.apply(x39)
            val x42 = x41.path
            val x43 = x41.name
            val x44 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x42, "'>", x43, "</a><br/>")
            val x45 = x41.files
            val x46 = x45.length
            val x55_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
            var x47 = 0
            while (x47 < x46) {
              val x49 = x45.apply(x47)
              val x50 = x49.path
              val x51 = x49.name
              val x52 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x50, "'>", x51, "</a><br/>")
              // Sym(53)yield Map(Sym(101) -> <function1>, Sym(85) -> <function1>, Sym(69) -> <function1>, Sym(53) -> <function1>, Sym(117) -> <function1>)previous 
              x55_buff += x52
              val x53 = ()
              x47 += 1
            }
            val x55 = x55_buff.toArray
            val x56 = x55.length
            val x67_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x57 = 0
            while (x57 < x56) {
              val x59 = x55.apply(x57)
              val x60 = x59.length
              var x61 = 0
              while (x61 < x60) {
                val x62 = x59.apply(x61)
                // Sym(63)yield Map(Sym(101) -> <function1>, Sym(85) -> <function1>, Sym(69) -> <function1>, Sym(63) -> <function1>, Sym(117) -> <function1>)previous 
                x67_buff += x62
                val x63 = ()
                x61 += 1
              }
              x57 += 1
            }
            val x67 = x67_buff.toArray
            val x68 = x44 ++ x67
            // Sym(69)yield Map(Sym(117) -> <function1>, Sym(101) -> <function1>, Sym(85) -> <function1>, Sym(69) -> <function1>)previous 
            x71_buff += x68
            val x69 = ()
            x39 += 1
          }
          val x71 = x71_buff.toArray
          val x72 = x71.length
          val x83_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x73 = 0
          while (x73 < x72) {
            val x75 = x71.apply(x73)
            val x76 = x75.length
            var x77 = 0
            while (x77 < x76) {
              val x78 = x75.apply(x77)
              // Sym(79)yield Map(Sym(117) -> <function1>, Sym(101) -> <function1>, Sym(85) -> <function1>, Sym(79) -> <function1>)previous 
              x83_buff += x78
              val x79 = ()
              x77 += 1
            }
            x73 += 1
          }
          val x83 = x83_buff.toArray
          val x84 = x36 ++ x83
          // Sym(85)yield Map(Sym(117) -> <function1>, Sym(101) -> <function1>, Sym(85) -> <function1>)previous 
          x87_buff += x84
          val x85 = ()
          x31 += 1
        }
        val x87 = x87_buff.toArray
        val x88 = x87.length
        val x99_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x89 = 0
        while (x89 < x88) {
          val x91 = x87.apply(x89)
          val x92 = x91.length
          var x93 = 0
          while (x93 < x92) {
            val x94 = x91.apply(x93)
            // Sym(95)yield Map(Sym(117) -> <function1>, Sym(101) -> <function1>, Sym(95) -> <function1>)previous 
            x99_buff += x94
            val x95 = ()
            x93 += 1
          }
          x89 += 1
        }
        val x99 = x99_buff.toArray
        val x100 = x28 ++ x99
        // Sym(101)yield Map(Sym(117) -> <function1>, Sym(101) -> <function1>)previous 
        x103_buff += x100
        val x101 = ()
        x23 += 1
      }
      val x103 = x103_buff.toArray
      val x104 = x103.length
      val x115_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x105 = 0
      while (x105 < x104) {
        val x107 = x103.apply(x105)
        val x108 = x107.length
        var x109 = 0
        while (x109 < x108) {
          val x110 = x107.apply(x109)
          // Sym(111)yield Map(Sym(117) -> <function1>, Sym(111) -> <function1>)previous 
          x115_buff += x110
          val x111 = ()
          x109 += 1
        }
        x105 += 1
      }
      val x115 = x115_buff.toArray
      val x116 = x20 ++ x115
      // Sym(117)yield Map(Sym(117) -> <function1>)previous 
      x119_buff += x116
      val x117 = ()
      x15 += 1
    }
    val x119 = x119_buff.toArray
    val x120 = x119.length
    val x131_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x121 = 0
    while (x121 < x120) {
      val x123 = x119.apply(x121)
      val x124 = x123.length
      var x125 = 0
      while (x125 < x124) {
        val x126 = x123.apply(x125)
        // Sym(127)yield Map(Sym(127) -> <function1>)previous 
        x131_buff += x126
        val x127 = ()
        x125 += 1
      }
      x121 += 1
    }
    val x131 = x131_buff.toArray
    val x132 = x12 ++ x131
    val x133 = Array("</body></html>")
    val x134 = x2 ++ x132 ++ x133
    val x135 = println(x134)
    x135
}

def time2orig  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x138 = Array("-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x219_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x139 = 0
    while (x139 < x14) {
      val x141 = x13.apply(x139)
      val x142 = x141.path
      val x143 = x141.name
      val x144 = Array("-&nbsp;-&nbsp;<a href='", x142, "'>", x143, "</a><br/>")
      val x145 = x141.files
      val x146 = x145.length
      val x203_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x147 = 0
      while (x147 < x146) {
        val x149 = x145.apply(x147)
        val x150 = x149.path
        val x151 = x149.name
        val x152 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x150, "'>", x151, "</a><br/>")
        val x153 = x149.files
        val x154 = x153.length
        val x187_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x155 = 0
        while (x155 < x154) {
          val x157 = x153.apply(x155)
          val x158 = x157.path
          val x159 = x157.name
          val x160 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x158, "'>", x159, "</a><br/>")
          val x161 = x157.files
          val x162 = x161.length
          val x171_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
          var x163 = 0
          while (x163 < x162) {
            val x165 = x161.apply(x163)
            val x166 = x165.path
            val x167 = x165.name
            val x168 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x166, "'>", x167, "</a><br/>")
            // Sym(169)yield Map(Sym(217) -> <function1>, Sym(201) -> <function1>, Sym(185) -> <function1>, Sym(169) -> <function1>)previous 
            x171_buff += x168
            val x169 = ()
            x163 += 1
          }
          val x171 = x171_buff.toArray
          val x172 = x171.length
          val x183_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x173 = 0
          while (x173 < x172) {
            val x175 = x171.apply(x173)
            val x176 = x175.length
            var x177 = 0
            while (x177 < x176) {
              val x178 = x175.apply(x177)
              // Sym(179)yield Map(Sym(217) -> <function1>, Sym(201) -> <function1>, Sym(185) -> <function1>, Sym(179) -> <function1>)previous 
              x183_buff += x178
              val x179 = ()
              x177 += 1
            }
            x173 += 1
          }
          val x183 = x183_buff.toArray
          val x184 = x160 ++ x183
          // Sym(185)yield Map(Sym(217) -> <function1>, Sym(201) -> <function1>, Sym(185) -> <function1>)previous 
          x187_buff += x184
          val x185 = ()
          x155 += 1
        }
        val x187 = x187_buff.toArray
        val x188 = x187.length
        val x199_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x189 = 0
        while (x189 < x188) {
          val x191 = x187.apply(x189)
          val x192 = x191.length
          var x193 = 0
          while (x193 < x192) {
            val x194 = x191.apply(x193)
            // Sym(195)yield Map(Sym(217) -> <function1>, Sym(201) -> <function1>, Sym(195) -> <function1>)previous 
            x199_buff += x194
            val x195 = ()
            x193 += 1
          }
          x189 += 1
        }
        val x199 = x199_buff.toArray
        val x200 = x152 ++ x199
        // Sym(201)yield Map(Sym(217) -> <function1>, Sym(201) -> <function1>)previous 
        x203_buff += x200
        val x201 = ()
        x147 += 1
      }
      val x203 = x203_buff.toArray
      val x204 = x203.length
      val x215_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x205 = 0
      while (x205 < x204) {
        val x207 = x203.apply(x205)
        val x208 = x207.length
        var x209 = 0
        while (x209 < x208) {
          val x210 = x207.apply(x209)
          // Sym(211)yield Map(Sym(217) -> <function1>, Sym(211) -> <function1>)previous 
          x215_buff += x210
          val x211 = ()
          x209 += 1
        }
        x205 += 1
      }
      val x215 = x215_buff.toArray
      val x216 = x144 ++ x215
      // Sym(217)yield Map(Sym(217) -> <function1>)previous 
      x219_buff += x216
      val x217 = ()
      x139 += 1
    }
    val x219 = x219_buff.toArray
    val x220 = x219.length
    val x231_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x221 = 0
    while (x221 < x220) {
      val x223 = x219.apply(x221)
      val x224 = x223.length
      var x225 = 0
      while (x225 < x224) {
        val x226 = x223.apply(x225)
        // Sym(227)yield Map(Sym(227) -> <function1>)previous 
        x231_buff += x226
        val x227 = ()
        x225 += 1
      }
      x221 += 1
    }
    val x231 = x231_buff.toArray
    val x232 = x138 ++ x231
    val x233 = x2 ++ x232 ++ x133
    val x234 = println(x233)
    x234
}

def time3orig  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x237 = Array("-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x294_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x238 = 0
    while (x238 < x14) {
      val x240 = x13.apply(x238)
      val x241 = x240.path
      val x242 = x240.name
      val x243 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x241, "'>", x242, "</a><br/>")
      val x244 = x240.files
      val x245 = x244.length
      val x278_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x246 = 0
      while (x246 < x245) {
        val x248 = x244.apply(x246)
        val x249 = x248.path
        val x250 = x248.name
        val x251 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x249, "'>", x250, "</a><br/>")
        val x252 = x248.files
        val x253 = x252.length
        val x262_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x254 = 0
        while (x254 < x253) {
          val x256 = x252.apply(x254)
          val x257 = x256.path
          val x258 = x256.name
          val x259 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x257, "'>", x258, "</a><br/>")
          // Sym(260)yield Map(Sym(292) -> <function1>, Sym(276) -> <function1>, Sym(260) -> <function1>)previous 
          x262_buff += x259
          val x260 = ()
          x254 += 1
        }
        val x262 = x262_buff.toArray
        val x263 = x262.length
        val x274_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x264 = 0
        while (x264 < x263) {
          val x266 = x262.apply(x264)
          val x267 = x266.length
          var x268 = 0
          while (x268 < x267) {
            val x269 = x266.apply(x268)
            // Sym(270)yield Map(Sym(292) -> <function1>, Sym(276) -> <function1>, Sym(270) -> <function1>)previous 
            x274_buff += x269
            val x270 = ()
            x268 += 1
          }
          x264 += 1
        }
        val x274 = x274_buff.toArray
        val x275 = x251 ++ x274
        // Sym(276)yield Map(Sym(292) -> <function1>, Sym(276) -> <function1>)previous 
        x278_buff += x275
        val x276 = ()
        x246 += 1
      }
      val x278 = x278_buff.toArray
      val x279 = x278.length
      val x290_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x280 = 0
      while (x280 < x279) {
        val x282 = x278.apply(x280)
        val x283 = x282.length
        var x284 = 0
        while (x284 < x283) {
          val x285 = x282.apply(x284)
          // Sym(286)yield Map(Sym(292) -> <function1>, Sym(286) -> <function1>)previous 
          x290_buff += x285
          val x286 = ()
          x284 += 1
        }
        x280 += 1
      }
      val x290 = x290_buff.toArray
      val x291 = x243 ++ x290
      // Sym(292)yield Map(Sym(292) -> <function1>)previous 
      x294_buff += x291
      val x292 = ()
      x238 += 1
    }
    val x294 = x294_buff.toArray
    val x295 = x294.length
    val x306_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x296 = 0
    while (x296 < x295) {
      val x298 = x294.apply(x296)
      val x299 = x298.length
      var x300 = 0
      while (x300 < x299) {
        val x301 = x298.apply(x300)
        // Sym(302)yield Map(Sym(302) -> <function1>)previous 
        x306_buff += x301
        val x302 = ()
        x300 += 1
      }
      x296 += 1
    }
    val x306 = x306_buff.toArray
    val x307 = x237 ++ x306
    val x308 = x2 ++ x307 ++ x133
    val x309 = println(x308)
    x309
}

def time4orig  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x312 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x345_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x313 = 0
    while (x313 < x14) {
      val x315 = x13.apply(x313)
      val x316 = x315.path
      val x317 = x315.name
      val x318 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x316, "'>", x317, "</a><br/>")
      val x319 = x315.files
      val x320 = x319.length
      val x329_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x321 = 0
      while (x321 < x320) {
        val x323 = x319.apply(x321)
        val x324 = x323.path
        val x325 = x323.name
        val x326 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x324, "'>", x325, "</a><br/>")
        // Sym(327)yield Map(Sym(343) -> <function1>, Sym(327) -> <function1>)previous 
        x329_buff += x326
        val x327 = ()
        x321 += 1
      }
      val x329 = x329_buff.toArray
      val x330 = x329.length
      val x341_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x331 = 0
      while (x331 < x330) {
        val x333 = x329.apply(x331)
        val x334 = x333.length
        var x335 = 0
        while (x335 < x334) {
          val x336 = x333.apply(x335)
          // Sym(337)yield Map(Sym(343) -> <function1>, Sym(337) -> <function1>)previous 
          x341_buff += x336
          val x337 = ()
          x335 += 1
        }
        x331 += 1
      }
      val x341 = x341_buff.toArray
      val x342 = x318 ++ x341
      // Sym(343)yield Map(Sym(343) -> <function1>)previous 
      x345_buff += x342
      val x343 = ()
      x313 += 1
    }
    val x345 = x345_buff.toArray
    val x346 = x345.length
    val x357_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x347 = 0
    while (x347 < x346) {
      val x349 = x345.apply(x347)
      val x350 = x349.length
      var x351 = 0
      while (x351 < x350) {
        val x352 = x349.apply(x351)
        // Sym(353)yield Map(Sym(353) -> <function1>)previous 
        x357_buff += x352
        val x353 = ()
        x351 += 1
      }
      x347 += 1
    }
    val x357 = x357_buff.toArray
    val x358 = x312 ++ x357
    val x359 = x2 ++ x358 ++ x133
    val x360 = println(x359)
    x360
  }

def time5orig  (reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
    val x133 = Array("</body></html>")
    val x1 = file
    val x3 = x1.path
    val x4 = x1.name
    val x363 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
    val x13 = x1.files
    val x14 = x13.length
    val x372_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x364 = 0
    while (x364 < x14) {
      val x366 = x13.apply(x364)
      val x367 = x366.path
      val x368 = x366.name
      val x369 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x367, "'>", x368, "</a><br/>")
      // Sym(370)yield Map(Sym(370) -> <function1>)previous 
      x372_buff += x369
      val x370 = ()
      x364 += 1
    }
    val x372 = x372_buff.toArray
    val x373 = x372.length
    val x384_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x374 = 0
    while (x374 < x373) {
      val x376 = x372.apply(x374)
      val x377 = x376.length
      var x378 = 0
      while (x378 < x377) {
        val x379 = x376.apply(x378)
        // Sym(380)yield Map(Sym(380) -> <function1>)previous 
        x384_buff += x379
        val x380 = ()
        x378 += 1
      }
      x374 += 1
    }
    val x384 = x384_buff.toArray
    val x385 = x363 ++ x384
    val x386 = x2 ++ x385 ++ x133
    val x387 = println(x386)
    x387
  }
}
