package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark

import com.google.caliper.{ Runner => CaliperRunner }

object FileSystemBench {

  // main method for IDEs, from the CLI you can also run the caliper Runner directly
  // or simply use SBTs "run" action
  def main(args: Array[String]) {
    // we simply pass in the CLI args,
    // we could of course also just pass hardcoded arguments to the caliper Runner
    CaliperRunner.main(classOf[FileSystemBench], args: _*)

  }

}

class FileSystemBench extends SimpleScalaBenchmark with FileTemplates with Input {
  var file: SimpleFile = _
  import FileSystemBench._

  override def setUp() {
    if (file == null)
      //        file = parse("/home/vojin/fs")
      file = parseIdealTree(8)
  }

  def timeL6(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x177 = x176.length
    val x201_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x178 = 0
    while (x178 < x177) {
      val x180 = x176.apply(x178)
      // Sym(181)yield Map(Sym(181) -> <function1>)previous 
      x201_buff += x180
      val x181 = ()
      x178 += 1
    }
    val x1 = file
    val x20 = x1.files
    val x21 = x20.length
    var x22 = 0
    while (x22 < x21) {
      val x24 = x20.apply(x22)
      val x25 = x24.path
      val x26 = x24.name
      val x27 = Array("-&nbsp;<a href='", x25, "'>", x26, "</a><br/>")
      val x28 = x27.length
      var x29 = 0
      while (x29 < x28) {
        val x31 = x27.apply(x29)
        // prev yields ArrayBuffer(Sym(169), Sym(193), Sym(207))
        x201_buff += x31
        val x193 = ()
        x29 += 1
      }
      val x35 = x24.files
      val x36 = x35.length
      var x37 = 0
      while (x37 < x36) {
        val x39 = x35.apply(x37)
        val x40 = x39.path
        val x41 = x39.name
        val x42 = Array("-&nbsp;-&nbsp;<a href='", x40, "'>", x41, "</a><br/>")
        val x43 = x42.length
        var x44 = 0
        while (x44 < x43) {
          val x46 = x42.apply(x44)
          // prev yields ArrayBuffer(Sym(169), Sym(193), Sym(214), Sym(232), Sym(241), Sym(249), Sym(261))
          x201_buff += x46
          val x193 = ()
          x44 += 1
        }
        val x50 = x39.files
        val x51 = x50.length
        var x52 = 0
        while (x52 < x51) {
          val x54 = x50.apply(x52)
          val x55 = x54.path
          val x56 = x54.name
          val x57 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x55, "'>", x56, "</a><br/>")
          val x58 = x57.length
          var x59 = 0
          while (x59 < x58) {
            val x61 = x57.apply(x59)
            // prev yields ArrayBuffer(Sym(169), Sym(193), Sym(214), Sym(232), Sym(241), Sym(249), Sym(268), Sym(286), Sym(295), Sym(303), Sym(315))
            x201_buff += x61
            val x193 = ()
            x59 += 1
          }
          val x65 = x54.files
          val x66 = x65.length
          var x67 = 0
          while (x67 < x66) {
            val x69 = x65.apply(x67)
            val x70 = x69.path
            val x71 = x69.name
            val x72 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x70, "'>", x71, "</a><br/>")
            val x73 = x72.length
            var x74 = 0
            while (x74 < x73) {
              val x76 = x72.apply(x74)
              // prev yields ArrayBuffer(Sym(169), Sym(193), Sym(214), Sym(232), Sym(241), Sym(249), Sym(268), Sym(286), Sym(295), Sym(303), Sym(322), Sym(340), Sym(349), Sym(357), Sym(369))
              x201_buff += x76
              val x193 = ()
              x74 += 1
            }
            val x80 = x69.files
            val x81 = x80.length
            var x82 = 0
            while (x82 < x81) {
              val x84 = x80.apply(x82)
              val x85 = x84.path
              val x86 = x84.name
              val x87 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x85, "'>", x86, "</a><br/>")
              val x88 = x87.length
              var x89 = 0
              while (x89 < x88) {
                val x91 = x87.apply(x89)
                // prev yields ArrayBuffer(Sym(169), Sym(193), Sym(214), Sym(232), Sym(241), Sym(249), Sym(268), Sym(286), Sym(295), Sym(303), Sym(322), Sym(340), Sym(349), Sym(357), Sym(376), Sym(394), Sym(403), Sym(411))
                x201_buff += x91
                val x193 = ()
                x89 += 1
              }
              x82 += 1
            }
            val x418 = () // x399 ++ x417
            val x361 = x418
            x67 += 1
          }
          val x364 = () // x345 ++ x363
          val x307 = x364
          x52 += 1
        }
        val x310 = () // x291 ++ x309
        val x253 = x310
        x37 += 1
      }
      val x256 = () // x237 ++ x255
      val x195 = x256
      x22 += 1
    }
    val x10 = x1.path
    val x11 = x1.name
    val x12 = Array("<a href='", x10, "'>", x11, "</a><br/>")
    val x13 = x12.length
    var x14 = 0
    while (x14 < x13) {
      val x16 = x12.apply(x14)
      // Sym(17)yield Map(Sym(17) -> <function1>)previous 
      x201_buff += x16
      val x17 = ()
      x14 += 1
    }
    val x2 = Array("<html><body>")
    val x3 = x2.length
    var x4 = 0
    while (x4 < x3) {
      val x6 = x2.apply(x4)
      // Sym(7)yield Map(Sym(7) -> <function1>)previous 
      x201_buff += x6
      val x7 = ()
      x4 += 1
    }
    val x201 = x201_buff.result
    x201
  }

  def timeL5(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x20 = x1.files
    val x21 = x20.length
    val x575_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x435 = 0
    while (x435 < x21) {
      val x437 = x20.apply(x435)
      val x438 = x437.path
      val x439 = x437.name
      val x440 = Array("-&nbsp;-&nbsp;<a href='", x438, "'>", x439, "</a><br/>")
      val x441 = x440.length
      var x442 = 0
      while (x442 < x441) {
        val x444 = x440.apply(x442)
        // prev yields ArrayBuffer(Sym(551), Sym(567), Sym(581))
        x575_buff += x444
        val x567 = ()
        x442 += 1
      }
      val x448 = x437.files
      val x449 = x448.length
      var x450 = 0
      while (x450 < x449) {
        val x452 = x448.apply(x450)
        val x453 = x452.path
        val x454 = x452.name
        val x455 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x453, "'>", x454, "</a><br/>")
        val x456 = x455.length
        var x457 = 0
        while (x457 < x456) {
          val x459 = x455.apply(x457)
          // prev yields ArrayBuffer(Sym(551), Sym(567), Sym(588), Sym(606), Sym(615), Sym(623), Sym(635))
          x575_buff += x459
          val x567 = ()
          x457 += 1
        }
        val x463 = x452.files
        val x464 = x463.length
        var x465 = 0
        while (x465 < x464) {
          val x467 = x463.apply(x465)
          val x468 = x467.path
          val x469 = x467.name
          val x470 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x468, "'>", x469, "</a><br/>")
          val x471 = x470.length
          var x472 = 0
          while (x472 < x471) {
            val x474 = x470.apply(x472)
            // prev yields ArrayBuffer(Sym(551), Sym(567), Sym(588), Sym(606), Sym(615), Sym(623), Sym(642), Sym(660), Sym(669), Sym(677), Sym(689))
            x575_buff += x474
            val x567 = ()
            x472 += 1
          }
          val x478 = x467.files
          val x479 = x478.length
          var x480 = 0
          while (x480 < x479) {
            val x482 = x478.apply(x480)
            val x483 = x482.path
            val x484 = x482.name
            val x485 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x483, "'>", x484, "</a><br/>")
            val x486 = x485.length
            var x487 = 0
            while (x487 < x486) {
              val x489 = x485.apply(x487)
              // prev yields ArrayBuffer(Sym(551), Sym(567), Sym(588), Sym(606), Sym(615), Sym(623), Sym(642), Sym(660), Sym(669), Sym(677), Sym(696), Sym(714), Sym(723), Sym(731))
              x575_buff += x489
              val x567 = ()
              x487 += 1
            }
            x480 += 1
          }
          val x738 = () // x719 ++ x737
          val x681 = x738
          x465 += 1
        }
        val x684 = () // x665 ++ x683
        val x627 = x684
        x450 += 1
      }
      val x630 = () // x611 ++ x629
      val x569 = x630
      x435 += 1
    }
    val x10 = x1.path
    val x11 = x1.name
    val x427 = Array("-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x428 = x427.length
    var x429 = 0
    while (x429 < x428) {
      val x431 = x427.apply(x429)
      // Sym(432)yield Map(Sym(432) -> <function1>)previous 
      x575_buff += x431
      val x432 = ()
      x429 += 1
    }
    val x575 = x575_buff.result
    x575
  }

  def timeL4(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x20 = x1.files
    val x21 = x20.length
    val x864_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x755 = 0
    while (x755 < x21) {
      val x757 = x20.apply(x755)
      val x758 = x757.path
      val x759 = x757.name
      val x760 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x758, "'>", x759, "</a><br/>")
      val x761 = x760.length
      var x762 = 0
      while (x762 < x761) {
        val x764 = x760.apply(x762)
        // prev yields ArrayBuffer(Sym(840), Sym(856), Sym(870))
        x864_buff += x764
        val x856 = ()
        x762 += 1
      }
      val x768 = x757.files
      val x769 = x768.length
      var x770 = 0
      while (x770 < x769) {
        val x772 = x768.apply(x770)
        val x773 = x772.path
        val x774 = x772.name
        val x775 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x773, "'>", x774, "</a><br/>")
        val x776 = x775.length
        var x777 = 0
        while (x777 < x776) {
          val x779 = x775.apply(x777)
          // prev yields ArrayBuffer(Sym(840), Sym(856), Sym(877), Sym(895), Sym(904), Sym(912), Sym(924))
          x864_buff += x779
          val x856 = ()
          x777 += 1
        }
        val x783 = x772.files
        val x784 = x783.length
        var x785 = 0
        while (x785 < x784) {
          val x787 = x783.apply(x785)
          val x788 = x787.path
          val x789 = x787.name
          val x790 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x788, "'>", x789, "</a><br/>")
          val x791 = x790.length
          var x792 = 0
          while (x792 < x791) {
            val x794 = x790.apply(x792)
            // prev yields ArrayBuffer(Sym(840), Sym(856), Sym(877), Sym(895), Sym(904), Sym(912), Sym(931), Sym(949), Sym(958), Sym(966))
            x864_buff += x794
            val x856 = ()
            x792 += 1
          }
          x785 += 1
        }
        val x973 = () // x954 ++ x972
        val x916 = x973
        x770 += 1
      }
      val x919 = () // x900 ++ x918
      val x858 = x919
      x755 += 1
    }
    val x10 = x1.path
    val x11 = x1.name
    val x747 = Array("-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x748 = x747.length
    var x749 = 0
    while (x749 < x748) {
      val x751 = x747.apply(x749)
      // Sym(752)yield Map(Sym(752) -> <function1>)previous 
      x864_buff += x751
      val x752 = ()
      x749 += 1
    }
    val x864 = x864_buff.result
    x864
  }

  def timeL3(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x20 = x1.files
    val x21 = x20.length
    val x1068_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x990 = 0
    while (x990 < x21) {
      val x992 = x20.apply(x990)
      val x993 = x992.path
      val x994 = x992.name
      val x995 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x993, "'>", x994, "</a><br/>")
      val x996 = x995.length
      var x997 = 0
      while (x997 < x996) {
        val x999 = x995.apply(x997)
        // prev yields ArrayBuffer(Sym(1044), Sym(1060), Sym(1074))
        x1068_buff += x999
        val x1060 = ()
        x997 += 1
      }
      val x1003 = x992.files
      val x1004 = x1003.length
      var x1005 = 0
      while (x1005 < x1004) {
        val x1007 = x1003.apply(x1005)
        val x1008 = x1007.path
        val x1009 = x1007.name
        val x1010 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x1008, "'>", x1009, "</a><br/>")
        val x1011 = x1010.length
        var x1012 = 0
        while (x1012 < x1011) {
          val x1014 = x1010.apply(x1012)
          // prev yields ArrayBuffer(Sym(1044), Sym(1060), Sym(1081), Sym(1099), Sym(1108), Sym(1116))
          x1068_buff += x1014
          val x1060 = ()
          x1012 += 1
        }
        x1005 += 1
      }
      val x1123 = () // x1104 ++ x1122
      val x1062 = x1123
      x990 += 1
    }
    val x10 = x1.path
    val x11 = x1.name
    val x982 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x983 = x982.length
    var x984 = 0
    while (x984 < x983) {
      val x986 = x982.apply(x984)
      // Sym(987)yield Map(Sym(987) -> <function1>)previous 
      x1068_buff += x986
      val x987 = ()
      x984 += 1
    }
    val x1068 = x1068_buff.result
    x1068
  }

  def timeL2(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x20 = x1.files
    val x21 = x20.length
    val x1187_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x1140 = 0
    while (x1140 < x21) {
      val x1142 = x20.apply(x1140)
      val x1143 = x1142.path
      val x1144 = x1142.name
      val x1145 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x1143, "'>", x1144, "</a><br/>")
      val x1146 = x1145.length
      var x1147 = 0
      while (x1147 < x1146) {
        val x1149 = x1145.apply(x1147)
        // prev yields ArrayBuffer(Sym(1163), Sym(1179))
        x1187_buff += x1149
        val x1179 = ()
        x1147 += 1
      }
      x1140 += 1
    }
    val x10 = x1.path
    val x11 = x1.name
    val x1132 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x1133 = x1132.length
    var x1134 = 0
    while (x1134 < x1133) {
      val x1136 = x1132.apply(x1134)
      // Sym(1137)yield Map(Sym(1137) -> <function1>)previous 
      x1187_buff += x1136
      val x1137 = ()
      x1134 += 1
    }
    val x1187 = x1187_buff.result
    x1187
  }

  def timeL6orig(reps: Int) = repeat(reps) {

    val x2 = Array("<html><body>")
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
    val x1 = file
    val x10 = x1.path
    val x11 = x1.name
    val x12 = Array("<a href='", x10, "'>", x11, "</a><br/>")
    val x13 = x12.length
    val x19_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x14 = 0
    while (x14 < x13) {
      val x16 = x12.apply(x14)
      // Sym(17)yield Map(Sym(17) -> <function1>)previous 
      x19_buff += x16
      val x17 = ()
      x14 += 1
    }
    val x19 = x19_buff.toArray
    val x20 = x1.files
    val x21 = x20.length
    val x161_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x22 = 0
    while (x22 < x21) {
      val x24 = x20.apply(x22)
      val x25 = x24.path
      val x26 = x24.name
      val x27 = Array("-&nbsp;<a href='", x25, "'>", x26, "</a><br/>")
      val x28 = x27.length
      val x34_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x29 = 0
      while (x29 < x28) {
        val x31 = x27.apply(x29)
        // Sym(32)yield Map(Sym(159) -> <function1>, Sym(32) -> <function1>)previous 
        x34_buff += x31
        val x32 = ()
        x29 += 1
      }
      val x34 = x34_buff.toArray
      val x35 = x24.files
      val x36 = x35.length
      val x145_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x37 = 0
      while (x37 < x36) {
        val x39 = x35.apply(x37)
        val x40 = x39.path
        val x41 = x39.name
        val x42 = Array("-&nbsp;-&nbsp;<a href='", x40, "'>", x41, "</a><br/>")
        val x43 = x42.length
        val x49_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x44 = 0
        while (x44 < x43) {
          val x46 = x42.apply(x44)
          // Sym(47)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(47) -> <function1>)previous 
          x49_buff += x46
          val x47 = ()
          x44 += 1
        }
        val x49 = x49_buff.toArray
        val x50 = x39.files
        val x51 = x50.length
        val x129_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x52 = 0
        while (x52 < x51) {
          val x54 = x50.apply(x52)
          val x55 = x54.path
          val x56 = x54.name
          val x57 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x55, "'>", x56, "</a><br/>")
          val x58 = x57.length
          val x64_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x59 = 0
          while (x59 < x58) {
            val x61 = x57.apply(x59)
            // Sym(62)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(127) -> <function1>, Sym(62) -> <function1>)previous 
            x64_buff += x61
            val x62 = ()
            x59 += 1
          }
          val x64 = x64_buff.toArray
          val x65 = x54.files
          val x66 = x65.length
          val x113_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
          var x67 = 0
          while (x67 < x66) {
            val x69 = x65.apply(x67)
            val x70 = x69.path
            val x71 = x69.name
            val x72 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x70, "'>", x71, "</a><br/>")
            val x73 = x72.length
            val x79_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x74 = 0
            while (x74 < x73) {
              val x76 = x72.apply(x74)
              // Sym(77)yield Map(Sym(159) -> <function1>, Sym(77) -> <function1>, Sym(127) -> <function1>, Sym(143) -> <function1>, Sym(111) -> <function1>)previous 
              x79_buff += x76
              val x77 = ()
              x74 += 1
            }
            val x79 = x79_buff.toArray
            val x80 = x69.files
            val x81 = x80.length
            val x97_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
            var x82 = 0
            while (x82 < x81) {
              val x84 = x80.apply(x82)
              val x85 = x84.path
              val x86 = x84.name
              val x87 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x85, "'>", x86, "</a><br/>")
              val x88 = x87.length
              val x94_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x89 = 0
              while (x89 < x88) {
                val x91 = x87.apply(x89)
                // Sym(92)yield Map(Sym(159) -> <function1>, Sym(127) -> <function1>, Sym(143) -> <function1>, Sym(95) -> <function1>, Sym(92) -> <function1>, Sym(111) -> <function1>)previous 
                x94_buff += x91
                val x92 = ()
                x89 += 1
              }
              val x94 = x94_buff.toArray
              // Sym(95)yield Map(Sym(159) -> <function1>, Sym(127) -> <function1>, Sym(143) -> <function1>, Sym(95) -> <function1>, Sym(111) -> <function1>)previous 
              x97_buff += x94
              val x95 = ()
              x82 += 1
            }
            val x97 = x97_buff.toArray
            val x98 = x97.length
            val x109_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x99 = 0
            while (x99 < x98) {
              val x101 = x97.apply(x99)
              val x102 = x101.length
              var x103 = 0
              while (x103 < x102) {
                val x104 = x101.apply(x103)
                // Sym(105)yield Map(Sym(159) -> <function1>, Sym(105) -> <function1>, Sym(127) -> <function1>, Sym(143) -> <function1>, Sym(111) -> <function1>)previous 
                x109_buff += x104
                val x105 = ()
                x103 += 1
              }
              x99 += 1
            }
            val x109 = x109_buff.toArray
            val x110 = x79 ++ x109
            // Sym(111)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(127) -> <function1>, Sym(111) -> <function1>)previous 
            x113_buff += x110
            val x111 = ()
            x67 += 1
          }
          val x113 = x113_buff.toArray
          val x114 = x113.length
          val x125_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x115 = 0
          while (x115 < x114) {
            val x117 = x113.apply(x115)
            val x118 = x117.length
            var x119 = 0
            while (x119 < x118) {
              val x120 = x117.apply(x119)
              // Sym(121)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(127) -> <function1>, Sym(121) -> <function1>)previous 
              x125_buff += x120
              val x121 = ()
              x119 += 1
            }
            x115 += 1
          }
          val x125 = x125_buff.toArray
          val x126 = x64 ++ x125
          // Sym(127)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(127) -> <function1>)previous 
          x129_buff += x126
          val x127 = ()
          x52 += 1
        }
        val x129 = x129_buff.toArray
        val x130 = x129.length
        val x141_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x131 = 0
        while (x131 < x130) {
          val x133 = x129.apply(x131)
          val x134 = x133.length
          var x135 = 0
          while (x135 < x134) {
            val x136 = x133.apply(x135)
            // Sym(137)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>, Sym(137) -> <function1>)previous 
            x141_buff += x136
            val x137 = ()
            x135 += 1
          }
          x131 += 1
        }
        val x141 = x141_buff.toArray
        val x142 = x49 ++ x141
        // Sym(143)yield Map(Sym(159) -> <function1>, Sym(143) -> <function1>)previous 
        x145_buff += x142
        val x143 = ()
        x37 += 1
      }
      val x145 = x145_buff.toArray
      val x146 = x145.length
      val x157_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x147 = 0
      while (x147 < x146) {
        val x149 = x145.apply(x147)
        val x150 = x149.length
        var x151 = 0
        while (x151 < x150) {
          val x152 = x149.apply(x151)
          // Sym(153)yield Map(Sym(159) -> <function1>, Sym(153) -> <function1>)previous 
          x157_buff += x152
          val x153 = ()
          x151 += 1
        }
        x147 += 1
      }
      val x157 = x157_buff.toArray
      val x158 = x34 ++ x157
      // Sym(159)yield Map(Sym(159) -> <function1>)previous 
      x161_buff += x158
      val x159 = ()
      x22 += 1
    }
    val x161 = x161_buff.toArray
    val x162 = x161.length
    val x173_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x163 = 0
    while (x163 < x162) {
      val x165 = x161.apply(x163)
      val x166 = x165.length
      var x167 = 0
      while (x167 < x166) {
        val x168 = x165.apply(x167)
        // Sym(169)yield Map(Sym(169) -> <function1>)previous 
        x173_buff += x168
        val x169 = ()
        x167 += 1
      }
      x163 += 1
    }
    val x173 = x173_buff.toArray
    val x174 = x19 ++ x173
    val x175 = x9 ++ x174
    val x176 = Array("</body></html>")
    val x177 = x176.length
    val x183_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x178 = 0
    while (x178 < x177) {
      val x180 = x176.apply(x178)
      // Sym(181)yield Map(Sym(181) -> <function1>)previous 
      x183_buff += x180
      val x181 = ()
      x178 += 1
    }
    val x183 = x183_buff.toArray
    val x184 = x175 ++ x183

    x184
  }

  def timeL5orig(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x10 = x1.path
    val x11 = x1.name
    val x188 = Array("-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x189 = x188.length
    val x195_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x190 = 0
    while (x190 < x189) {
      val x192 = x188.apply(x190)
      // Sym(193)yield Map(Sym(193) -> <function1>)previous 
      x195_buff += x192
      val x193 = ()
      x190 += 1
    }
    val x195 = x195_buff.toArray
    val x20 = x1.files
    val x21 = x20.length
    val x304_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x196 = 0
    while (x196 < x21) {
      val x198 = x20.apply(x196)
      val x199 = x198.path
      val x200 = x198.name
      val x201 = Array("-&nbsp;-&nbsp;<a href='", x199, "'>", x200, "</a><br/>")
      val x202 = x201.length
      val x208_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x203 = 0
      while (x203 < x202) {
        val x205 = x201.apply(x203)
        // Sym(206)yield Map(Sym(302) -> <function1>, Sym(206) -> <function1>)previous 
        x208_buff += x205
        val x206 = ()
        x203 += 1
      }
      val x208 = x208_buff.toArray
      val x209 = x198.files
      val x210 = x209.length
      val x288_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x211 = 0
      while (x211 < x210) {
        val x213 = x209.apply(x211)
        val x214 = x213.path
        val x215 = x213.name
        val x216 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x214, "'>", x215, "</a><br/>")
        val x217 = x216.length
        val x223_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x218 = 0
        while (x218 < x217) {
          val x220 = x216.apply(x218)
          // Sym(221)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(221) -> <function1>)previous 
          x223_buff += x220
          val x221 = ()
          x218 += 1
        }
        val x223 = x223_buff.toArray
        val x224 = x213.files
        val x225 = x224.length
        val x272_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x226 = 0
        while (x226 < x225) {
          val x228 = x224.apply(x226)
          val x229 = x228.path
          val x230 = x228.name
          val x231 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x229, "'>", x230, "</a><br/>")
          val x232 = x231.length
          val x238_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x233 = 0
          while (x233 < x232) {
            val x235 = x231.apply(x233)
            // Sym(236)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(270) -> <function1>, Sym(236) -> <function1>)previous 
            x238_buff += x235
            val x236 = ()
            x233 += 1
          }
          val x238 = x238_buff.toArray
          val x239 = x228.files
          val x240 = x239.length
          val x256_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
          var x241 = 0
          while (x241 < x240) {
            val x243 = x239.apply(x241)
            val x244 = x243.path
            val x245 = x243.name
            val x246 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x244, "'>", x245, "</a><br/>")
            val x247 = x246.length
            val x253_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x248 = 0
            while (x248 < x247) {
              val x250 = x246.apply(x248)
              // Sym(251)yield Map(Sym(251) -> <function1>, Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(270) -> <function1>, Sym(254) -> <function1>)previous 
              x253_buff += x250
              val x251 = ()
              x248 += 1
            }
            val x253 = x253_buff.toArray
            // Sym(254)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(270) -> <function1>, Sym(254) -> <function1>)previous 
            x256_buff += x253
            val x254 = ()
            x241 += 1
          }
          val x256 = x256_buff.toArray
          val x257 = x256.length
          val x268_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x258 = 0
          while (x258 < x257) {
            val x260 = x256.apply(x258)
            val x261 = x260.length
            var x262 = 0
            while (x262 < x261) {
              val x263 = x260.apply(x262)
              // Sym(264)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(270) -> <function1>, Sym(264) -> <function1>)previous 
              x268_buff += x263
              val x264 = ()
              x262 += 1
            }
            x258 += 1
          }
          val x268 = x268_buff.toArray
          val x269 = x238 ++ x268
          // Sym(270)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(270) -> <function1>)previous 
          x272_buff += x269
          val x270 = ()
          x226 += 1
        }
        val x272 = x272_buff.toArray
        val x273 = x272.length
        val x284_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x274 = 0
        while (x274 < x273) {
          val x276 = x272.apply(x274)
          val x277 = x276.length
          var x278 = 0
          while (x278 < x277) {
            val x279 = x276.apply(x278)
            // Sym(280)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>, Sym(280) -> <function1>)previous 
            x284_buff += x279
            val x280 = ()
            x278 += 1
          }
          x274 += 1
        }
        val x284 = x284_buff.toArray
        val x285 = x223 ++ x284
        // Sym(286)yield Map(Sym(302) -> <function1>, Sym(286) -> <function1>)previous 
        x288_buff += x285
        val x286 = ()
        x211 += 1
      }
      val x288 = x288_buff.toArray
      val x289 = x288.length
      val x300_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x290 = 0
      while (x290 < x289) {
        val x292 = x288.apply(x290)
        val x293 = x292.length
        var x294 = 0
        while (x294 < x293) {
          val x295 = x292.apply(x294)
          // Sym(296)yield Map(Sym(302) -> <function1>, Sym(296) -> <function1>)previous 
          x300_buff += x295
          val x296 = ()
          x294 += 1
        }
        x290 += 1
      }
      val x300 = x300_buff.toArray
      val x301 = x208 ++ x300
      // Sym(302)yield Map(Sym(302) -> <function1>)previous 
      x304_buff += x301
      val x302 = ()
      x196 += 1
    }
    val x304 = x304_buff.toArray
    val x305 = x304.length
    val x316_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x306 = 0
    while (x306 < x305) {
      val x308 = x304.apply(x306)
      val x309 = x308.length
      var x310 = 0
      while (x310 < x309) {
        val x311 = x308.apply(x310)
        // Sym(312)yield Map(Sym(312) -> <function1>)previous 
        x316_buff += x311
        val x312 = ()
        x310 += 1
      }
      x306 += 1
    }
    val x316 = x316_buff.toArray
    val x317 = x195 ++ x316
    val x318 = x2 ++ x317
    val x319 = x318 ++ x176
    x319
  }

  def timeL4orig(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x10 = x1.path
    val x11 = x1.name
    val x323 = Array("-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x324 = x323.length
    val x330_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x325 = 0
    while (x325 < x324) {
      val x327 = x323.apply(x325)
      // Sym(328)yield Map(Sym(328) -> <function1>)previous 
      x330_buff += x327
      val x328 = ()
      x325 += 1
    }
    val x330 = x330_buff.toArray
    val x20 = x1.files
    val x21 = x20.length
    val x408_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x331 = 0
    while (x331 < x21) {
      val x333 = x20.apply(x331)
      val x334 = x333.path
      val x335 = x333.name
      val x336 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x334, "'>", x335, "</a><br/>")
      val x337 = x336.length
      val x343_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x338 = 0
      while (x338 < x337) {
        val x340 = x336.apply(x338)
        // Sym(341)yield Map(Sym(406) -> <function1>, Sym(341) -> <function1>)previous 
        x343_buff += x340
        val x341 = ()
        x338 += 1
      }
      val x343 = x343_buff.toArray
      val x344 = x333.files
      val x345 = x344.length
      val x392_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x346 = 0
      while (x346 < x345) {
        val x348 = x344.apply(x346)
        val x349 = x348.path
        val x350 = x348.name
        val x351 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x349, "'>", x350, "</a><br/>")
        val x352 = x351.length
        val x358_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x353 = 0
        while (x353 < x352) {
          val x355 = x351.apply(x353)
          // Sym(356)yield Map(Sym(406) -> <function1>, Sym(390) -> <function1>, Sym(356) -> <function1>)previous 
          x358_buff += x355
          val x356 = ()
          x353 += 1
        }
        val x358 = x358_buff.toArray
        val x359 = x348.files
        val x360 = x359.length
        val x376_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
        var x361 = 0
        while (x361 < x360) {
          val x363 = x359.apply(x361)
          val x364 = x363.path
          val x365 = x363.name
          val x366 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x364, "'>", x365, "</a><br/>")
          val x367 = x366.length
          val x373_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x368 = 0
          while (x368 < x367) {
            val x370 = x366.apply(x368)
            // Sym(371)yield Map(Sym(406) -> <function1>, Sym(390) -> <function1>, Sym(374) -> <function1>, Sym(371) -> <function1>)previous 
            x373_buff += x370
            val x371 = ()
            x368 += 1
          }
          val x373 = x373_buff.toArray
          // Sym(374)yield Map(Sym(406) -> <function1>, Sym(390) -> <function1>, Sym(374) -> <function1>)previous 
          x376_buff += x373
          val x374 = ()
          x361 += 1
        }
        val x376 = x376_buff.toArray
        val x377 = x376.length
        val x388_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x378 = 0
        while (x378 < x377) {
          val x380 = x376.apply(x378)
          val x381 = x380.length
          var x382 = 0
          while (x382 < x381) {
            val x383 = x380.apply(x382)
            // Sym(384)yield Map(Sym(406) -> <function1>, Sym(390) -> <function1>, Sym(384) -> <function1>)previous 
            x388_buff += x383
            val x384 = ()
            x382 += 1
          }
          x378 += 1
        }
        val x388 = x388_buff.toArray
        val x389 = x358 ++ x388
        // Sym(390)yield Map(Sym(406) -> <function1>, Sym(390) -> <function1>)previous 
        x392_buff += x389
        val x390 = ()
        x346 += 1
      }
      val x392 = x392_buff.toArray
      val x393 = x392.length
      val x404_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x394 = 0
      while (x394 < x393) {
        val x396 = x392.apply(x394)
        val x397 = x396.length
        var x398 = 0
        while (x398 < x397) {
          val x399 = x396.apply(x398)
          // Sym(400)yield Map(Sym(406) -> <function1>, Sym(400) -> <function1>)previous 
          x404_buff += x399
          val x400 = ()
          x398 += 1
        }
        x394 += 1
      }
      val x404 = x404_buff.toArray
      val x405 = x343 ++ x404
      // Sym(406)yield Map(Sym(406) -> <function1>)previous 
      x408_buff += x405
      val x406 = ()
      x331 += 1
    }
    val x408 = x408_buff.toArray
    val x409 = x408.length
    val x420_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x410 = 0
    while (x410 < x409) {
      val x412 = x408.apply(x410)
      val x413 = x412.length
      var x414 = 0
      while (x414 < x413) {
        val x415 = x412.apply(x414)
        // Sym(416)yield Map(Sym(416) -> <function1>)previous 
        x420_buff += x415
        val x416 = ()
        x414 += 1
      }
      x410 += 1
    }
    val x420 = x420_buff.toArray
    val x421 = x330 ++ x420
    val x422 = x2 ++ x421
    val x423 = x422 ++ x176
    val x424 = println(x423)
    x424
  }

  def timeL3orig(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x10 = x1.path
    val x11 = x1.name
    val x427 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x428 = x427.length
    val x434_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x429 = 0
    while (x429 < x428) {
      val x431 = x427.apply(x429)
      // Sym(432)yield Map(Sym(432) -> <function1>)previous 
      x434_buff += x431
      val x432 = ()
      x429 += 1
    }
    val x434 = x434_buff.toArray
    val x20 = x1.files
    val x21 = x20.length
    val x481_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x435 = 0
    while (x435 < x21) {
      val x437 = x20.apply(x435)
      val x438 = x437.path
      val x439 = x437.name
      val x440 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x438, "'>", x439, "</a><br/>")
      val x441 = x440.length
      val x447_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x442 = 0
      while (x442 < x441) {
        val x444 = x440.apply(x442)
        // Sym(445)yield Map(Sym(479) -> <function1>, Sym(445) -> <function1>)previous 
        x447_buff += x444
        val x445 = ()
        x442 += 1
      }
      val x447 = x447_buff.toArray
      val x448 = x437.files
      val x449 = x448.length
      val x465_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
      var x450 = 0
      while (x450 < x449) {
        val x452 = x448.apply(x450)
        val x453 = x452.path
        val x454 = x452.name
        val x455 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x453, "'>", x454, "</a><br/>")
        val x456 = x455.length
        val x462_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x457 = 0
        while (x457 < x456) {
          val x459 = x455.apply(x457)
          // Sym(460)yield Map(Sym(479) -> <function1>, Sym(463) -> <function1>, Sym(460) -> <function1>)previous 
          x462_buff += x459
          val x460 = ()
          x457 += 1
        }
        val x462 = x462_buff.toArray
        // Sym(463)yield Map(Sym(479) -> <function1>, Sym(463) -> <function1>)previous 
        x465_buff += x462
        val x463 = ()
        x450 += 1
      }
      val x465 = x465_buff.toArray
      val x466 = x465.length
      val x477_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x467 = 0
      while (x467 < x466) {
        val x469 = x465.apply(x467)
        val x470 = x469.length
        var x471 = 0
        while (x471 < x470) {
          val x472 = x469.apply(x471)
          // Sym(473)yield Map(Sym(479) -> <function1>, Sym(473) -> <function1>)previous 
          x477_buff += x472
          val x473 = ()
          x471 += 1
        }
        x467 += 1
      }
      val x477 = x477_buff.toArray
      val x478 = x447 ++ x477
      // Sym(479)yield Map(Sym(479) -> <function1>)previous 
      x481_buff += x478
      val x479 = ()
      x435 += 1
    }
    val x481 = x481_buff.toArray
    val x482 = x481.length
    val x493_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x483 = 0
    while (x483 < x482) {
      val x485 = x481.apply(x483)
      val x486 = x485.length
      var x487 = 0
      while (x487 < x486) {
        val x488 = x485.apply(x487)
        // Sym(489)yield Map(Sym(489) -> <function1>)previous 
        x493_buff += x488
        val x489 = ()
        x487 += 1
      }
      x483 += 1
    }
    val x493 = x493_buff.toArray
    val x494 = x434 ++ x493
    val x495 = x2 ++ x494
    val x496 = x495 ++ x176
    x496
  }

  def timeL2orig(reps: Int) = repeat(reps) {

    val x176 = Array("</body></html>")
    val x2 = Array("<html><body>")
    val x1 = file
    val x10 = x1.path
    val x11 = x1.name
    val x500 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x10, "'>", x11, "</a><br/>")
    val x501 = x500.length
    val x507_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x502 = 0
    while (x502 < x501) {
      val x504 = x500.apply(x502)
      // Sym(505)yield Map(Sym(505) -> <function1>)previous 
      x507_buff += x504
      val x505 = ()
      x502 += 1
    }
    val x507 = x507_buff.toArray
    val x20 = x1.files
    val x21 = x20.length
    val x523_buff = new scala.collection.mutable.ArrayBuffer[Array[java.lang.String]]
    var x508 = 0
    while (x508 < x21) {
      val x510 = x20.apply(x508)
      val x511 = x510.path
      val x512 = x510.name
      val x513 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x511, "'>", x512, "</a><br/>")
      val x514 = x513.length
      val x520_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x515 = 0
      while (x515 < x514) {
        val x517 = x513.apply(x515)
        // Sym(518)yield Map(Sym(521) -> <function1>, Sym(518) -> <function1>)previous 
        x520_buff += x517
        val x518 = ()
        x515 += 1
      }
      val x520 = x520_buff.toArray
      // Sym(521)yield Map(Sym(521) -> <function1>)previous 
      x523_buff += x520
      val x521 = ()
      x508 += 1
    }
    val x523 = x523_buff.toArray
    val x524 = x523.length
    val x535_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
    var x525 = 0
    while (x525 < x524) {
      val x527 = x523.apply(x525)
      val x528 = x527.length
      var x529 = 0
      while (x529 < x528) {
        val x530 = x527.apply(x529)
        // Sym(531)yield Map(Sym(531) -> <function1>)previous 
        x535_buff += x530
        val x531 = ()
        x529 += 1
      }
      x525 += 1
    }
    val x535 = x535_buff.toArray
    val x536 = x507 ++ x535
    val x537 = x2 ++ x536
    val x538 = x537 ++ x176
    x538
  }

  def timeL6S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f1(file) ++ Array("""</body></html>""")
    res
  }

  def timeL5S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f2(file) ++ Array("""</body></html>""")
    res
  }

  def timeL4S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f3(file) ++ Array("""</body></html>""")
    res
  }

  def timeL3S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f4(file) ++ Array("""</body></html>""")
    res
  }

  def timeL2S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f5(file) ++ Array("""</body></html>""")
    res
  }
}
