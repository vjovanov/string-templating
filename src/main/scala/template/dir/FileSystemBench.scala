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
      file = parseIdealTree(5)
  }

  
  
  def timeL10S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f01(file) ++ Array("""</body></html>""")
    res
  }

  def timeL10orig(reps: Int) = repeat(reps) { val x = new timeL10origC; val r = x.apply(()); r }

  def timeL10(reps: Int) = repeat(reps) { val x = new timeL10C; val r = x.apply(()); r }

  
  
  def timeL9S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f02(file) ++ Array("""</body></html>""")
    res
  }

  def timeL9orig(reps: Int) = repeat(reps) { val x = new timeL9origC; val r = x.apply(()); r }

  def timeL9(reps: Int) = repeat(reps) { val x = new timeL9C; val r = x.apply(()); r }

  
  
  def timeL8S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f03(file) ++ Array("""</body></html>""")
    res
  }

  def timeL8orig(reps: Int) = repeat(reps) { val x = new timeL8origC; val r = x.apply(()); r }

  def timeL8(reps: Int) = repeat(reps) { val x = new timeL8C; val r = x.apply(()); r }

  
  
  def timeL7S(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f04(file) ++ Array("""</body></html>""")
    res
  }

  def timeL7orig(reps: Int) = repeat(reps) { val x = new timeL7origC; val r = x.apply(()); r }

  def timeL7(reps: Int) = repeat(reps) { val x = new timeL7C; val r = x.apply(()); r }

  
  
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

  def timeL2(reps: Int) = repeat(reps) { val x = new timeL2C; val r = x.apply(()); r }

  /**
   * ***************************************
   * Emitting Generated Code
   * *****************************************
   */
  class timeL10C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x223 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x241_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("<a href='", x11, "'>", x12, "</a></br>")
        val x245 = x13.length
        var x244 = 0
        while (x244 < x245) {
          val x246 = x13.apply(x244)
          // prev yields ArrayBuffer(Sym(216), Sym(233))
          x241_buff += x246
          val x233 = ()
          x244 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("<a href='", x19, "'>", x20, "</a></br>")
          val x295 = x21.length
          var x294 = 0
          while (x294 < x295) {
            val x296 = x21.apply(x294)
            // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285))
            x241_buff += x296
            val x233 = ()
            x294 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("<a href='", x27, "'>", x28, "</a></br>")
            val x345 = x29.length
            var x344 = 0
            while (x344 < x345) {
              val x346 = x29.apply(x344)
              // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335))
              x241_buff += x346
              val x233 = ()
              x344 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("<a href='", x35, "'>", x36, "</a><br/>")
              val x395 = x37.length
              var x394 = 0
              while (x394 < x395) {
                val x396 = x37.apply(x394)
                // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385))
                x241_buff += x396
                val x233 = ()
                x394 += 1
              }
              val x38 = x34.files
              val x39 = x38.length
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x445 = x45.length
                var x444 = 0
                while (x444 < x445) {
                  val x446 = x45.apply(x444)
                  // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385), Sym(404), Sym(419), Sym(427), Sym(435))
                  x241_buff += x446
                  val x233 = ()
                  x444 += 1
                }
                val x46 = x42.files
                val x47 = x46.length
                var x48 = 0
                while (x48 < x47) {
                  val x50 = x46.apply(x48)
                  val x51 = x50.path
                  val x52 = x50.name
                  val x53 = Array("-&nbsp;-&nbsp;<a href='", x51, "'>", x52, "</a><br/>")
                  val x495 = x53.length
                  var x494 = 0
                  while (x494 < x495) {
                    val x496 = x53.apply(x494)
                    // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385), Sym(404), Sym(419), Sym(427), Sym(435), Sym(454), Sym(469), Sym(477), Sym(485))
                    x241_buff += x496
                    val x233 = ()
                    x494 += 1
                  }
                  val x54 = x50.files
                  val x55 = x54.length
                  var x56 = 0
                  while (x56 < x55) {
                    val x58 = x54.apply(x56)
                    val x59 = x58.path
                    val x60 = x58.name
                    val x61 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x59, "'>", x60, "</a><br/>")
                    val x545 = x61.length
                    var x544 = 0
                    while (x544 < x545) {
                      val x546 = x61.apply(x544)
                      // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385), Sym(404), Sym(419), Sym(427), Sym(435), Sym(454), Sym(469), Sym(477), Sym(485), Sym(504), Sym(519), Sym(527), Sym(535))
                      x241_buff += x546
                      val x233 = ()
                      x544 += 1
                    }
                    val x62 = x58.files
                    val x63 = x62.length
                    var x64 = 0
                    while (x64 < x63) {
                      val x66 = x62.apply(x64)
                      val x67 = x66.path
                      val x68 = x66.name
                      val x69 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x67, "'>", x68, "</a><br/>")
                      val x595 = x69.length
                      var x594 = 0
                      while (x594 < x595) {
                        val x596 = x69.apply(x594)
                        // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385), Sym(404), Sym(419), Sym(427), Sym(435), Sym(454), Sym(469), Sym(477), Sym(485), Sym(504), Sym(519), Sym(527), Sym(535), Sym(554), Sym(569), Sym(577), Sym(585))
                        x241_buff += x596
                        val x233 = ()
                        x594 += 1
                      }
                      val x70 = x66.files
                      val x71 = x70.length
                      var x72 = 0
                      while (x72 < x71) {
                        val x74 = x70.apply(x72)
                        val x75 = x74.path
                        val x76 = x74.name
                        val x77 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x75, "'>", x76, "</a><br/>")
                        val x611 = x77.length
                        var x86 = 0
                        while (x86 < x611) {
                          val x612 = x77.apply(x86)
                          // prev yields ArrayBuffer(Sym(216), Sym(233), Sym(254), Sym(269), Sym(277), Sym(285), Sym(304), Sym(319), Sym(327), Sym(335), Sym(354), Sym(369), Sym(377), Sym(385), Sym(404), Sym(419), Sym(427), Sym(435), Sym(454), Sym(469), Sym(477), Sym(485), Sym(504), Sym(519), Sym(527), Sym(535), Sym(554), Sym(569), Sym(577), Sym(585), Sym(604), Sym(619), Sym(627))
                          x241_buff += x612
                          val x233 = ()
                          x86 += 1
                        }
                        x72 += 1
                      }
                      val x642 = () // x599 ++ x641
                      val x589 = x642
                      x64 += 1
                    }
                    val x592 = () // x549 ++ x591
                    val x539 = x592
                    x56 += 1
                  }
                  val x542 = () // x499 ++ x541
                  val x489 = x542
                  x48 += 1
                }
                val x492 = () // x449 ++ x491
                val x439 = x492
                x40 += 1
              }
              val x442 = () // x399 ++ x441
              val x389 = x442
              x32 += 1
            }
            val x392 = () // x349 ++ x391
            val x339 = x392
            x24 += 1
          }
          val x342 = () // x299 ++ x341
          val x289 = x342
          x16 += 1
        }
        val x292 = () // x249 ++ x291
        val x235 = x292
        x8 += 1
      }
      val x241 = x241_buff.result
      val x242 = x241 //println(x241)
      val x225 = x242
      x225
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
  class timeL9C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x199 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x217_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("<a href='", x11, "'>", x12, "</a></br>")
        val x221 = x13.length
        var x220 = 0
        while (x220 < x221) {
          val x222 = x13.apply(x220)
          // prev yields ArrayBuffer(Sym(192), Sym(209))
          x217_buff += x222
          val x209 = ()
          x220 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("<a href='", x19, "'>", x20, "</a></br>")
          val x271 = x21.length
          var x270 = 0
          while (x270 < x271) {
            val x272 = x21.apply(x270)
            // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261))
            x217_buff += x272
            val x209 = ()
            x270 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("<a href='", x27, "'>", x28, "</a><br/>")
            val x321 = x29.length
            var x320 = 0
            while (x320 < x321) {
              val x322 = x29.apply(x320)
              // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311))
              x217_buff += x322
              val x209 = ()
              x320 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x371 = x37.length
              var x370 = 0
              while (x370 < x371) {
                val x372 = x37.apply(x370)
                // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311), Sym(330), Sym(345), Sym(353), Sym(361))
                x217_buff += x372
                val x209 = ()
                x370 += 1
              }
              val x38 = x34.files
              val x39 = x38.length
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x421 = x45.length
                var x420 = 0
                while (x420 < x421) {
                  val x422 = x45.apply(x420)
                  // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311), Sym(330), Sym(345), Sym(353), Sym(361), Sym(380), Sym(395), Sym(403), Sym(411))
                  x217_buff += x422
                  val x209 = ()
                  x420 += 1
                }
                val x46 = x42.files
                val x47 = x46.length
                var x48 = 0
                while (x48 < x47) {
                  val x50 = x46.apply(x48)
                  val x51 = x50.path
                  val x52 = x50.name
                  val x53 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x51, "'>", x52, "</a><br/>")
                  val x471 = x53.length
                  var x470 = 0
                  while (x470 < x471) {
                    val x472 = x53.apply(x470)
                    // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311), Sym(330), Sym(345), Sym(353), Sym(361), Sym(380), Sym(395), Sym(403), Sym(411), Sym(430), Sym(445), Sym(453), Sym(461))
                    x217_buff += x472
                    val x209 = ()
                    x470 += 1
                  }
                  val x54 = x50.files
                  val x55 = x54.length
                  var x56 = 0
                  while (x56 < x55) {
                    val x58 = x54.apply(x56)
                    val x59 = x58.path
                    val x60 = x58.name
                    val x61 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x59, "'>", x60, "</a><br/>")
                    val x521 = x61.length
                    var x520 = 0
                    while (x520 < x521) {
                      val x522 = x61.apply(x520)
                      // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311), Sym(330), Sym(345), Sym(353), Sym(361), Sym(380), Sym(395), Sym(403), Sym(411), Sym(430), Sym(445), Sym(453), Sym(461), Sym(480), Sym(495), Sym(503), Sym(511))
                      x217_buff += x522
                      val x209 = ()
                      x520 += 1
                    }
                    val x62 = x58.files
                    val x63 = x62.length
                    var x64 = 0
                    while (x64 < x63) {
                      val x66 = x62.apply(x64)
                      val x67 = x66.path
                      val x68 = x66.name
                      val x69 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x67, "'>", x68, "</a><br/>")
                      val x537 = x69.length
                      var x78 = 0
                      while (x78 < x537) {
                        val x538 = x69.apply(x78)
                        // prev yields ArrayBuffer(Sym(192), Sym(209), Sym(230), Sym(245), Sym(253), Sym(261), Sym(280), Sym(295), Sym(303), Sym(311), Sym(330), Sym(345), Sym(353), Sym(361), Sym(380), Sym(395), Sym(403), Sym(411), Sym(430), Sym(445), Sym(453), Sym(461), Sym(480), Sym(495), Sym(503), Sym(511), Sym(530), Sym(545), Sym(553))
                        x217_buff += x538
                        val x209 = ()
                        x78 += 1
                      }
                      x64 += 1
                    }
                    val x568 = () // x525 ++ x567
                    val x515 = x568
                    x56 += 1
                  }
                  val x518 = () // x475 ++ x517
                  val x465 = x518
                  x48 += 1
                }
                val x468 = () // x425 ++ x467
                val x415 = x468
                x40 += 1
              }
              val x418 = () // x375 ++ x417
              val x365 = x418
              x32 += 1
            }
            val x368 = () // x325 ++ x367
            val x315 = x368
            x24 += 1
          }
          val x318 = () // x275 ++ x317
          val x265 = x318
          x16 += 1
        }
        val x268 = () // x225 ++ x267
        val x211 = x268
        x8 += 1
      }
      val x217 = x217_buff.result
      val x218 = x217 //println(x217)
      val x201 = x218
      x201
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
  class timeL8C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x175 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x193_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("<a href='", x11, "'>", x12, "</a></br>")
        val x197 = x13.length
        var x196 = 0
        while (x196 < x197) {
          val x198 = x13.apply(x196)
          // prev yields ArrayBuffer(Sym(168), Sym(185))
          x193_buff += x198
          val x185 = ()
          x196 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("<a href='", x19, "'>", x20, "</a><br/>")
          val x247 = x21.length
          var x246 = 0
          while (x246 < x247) {
            val x248 = x21.apply(x246)
            // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237))
            x193_buff += x248
            val x185 = ()
            x246 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x297 = x29.length
            var x296 = 0
            while (x296 < x297) {
              val x298 = x29.apply(x296)
              // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237), Sym(256), Sym(271), Sym(279), Sym(287))
              x193_buff += x298
              val x185 = ()
              x296 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x347 = x37.length
              var x346 = 0
              while (x346 < x347) {
                val x348 = x37.apply(x346)
                // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237), Sym(256), Sym(271), Sym(279), Sym(287), Sym(306), Sym(321), Sym(329), Sym(337))
                x193_buff += x348
                val x185 = ()
                x346 += 1
              }
              val x38 = x34.files
              val x39 = x38.length
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x397 = x45.length
                var x396 = 0
                while (x396 < x397) {
                  val x398 = x45.apply(x396)
                  // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237), Sym(256), Sym(271), Sym(279), Sym(287), Sym(306), Sym(321), Sym(329), Sym(337), Sym(356), Sym(371), Sym(379), Sym(387))
                  x193_buff += x398
                  val x185 = ()
                  x396 += 1
                }
                val x46 = x42.files
                val x47 = x46.length
                var x48 = 0
                while (x48 < x47) {
                  val x50 = x46.apply(x48)
                  val x51 = x50.path
                  val x52 = x50.name
                  val x53 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x51, "'>", x52, "</a><br/>")
                  val x447 = x53.length
                  var x446 = 0
                  while (x446 < x447) {
                    val x448 = x53.apply(x446)
                    // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237), Sym(256), Sym(271), Sym(279), Sym(287), Sym(306), Sym(321), Sym(329), Sym(337), Sym(356), Sym(371), Sym(379), Sym(387), Sym(406), Sym(421), Sym(429), Sym(437))
                    x193_buff += x448
                    val x185 = ()
                    x446 += 1
                  }
                  val x54 = x50.files
                  val x55 = x54.length
                  var x56 = 0
                  while (x56 < x55) {
                    val x58 = x54.apply(x56)
                    val x59 = x58.path
                    val x60 = x58.name
                    val x61 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x59, "'>", x60, "</a><br/>")
                    val x463 = x61.length
                    var x70 = 0
                    while (x70 < x463) {
                      val x464 = x61.apply(x70)
                      // prev yields ArrayBuffer(Sym(168), Sym(185), Sym(206), Sym(221), Sym(229), Sym(237), Sym(256), Sym(271), Sym(279), Sym(287), Sym(306), Sym(321), Sym(329), Sym(337), Sym(356), Sym(371), Sym(379), Sym(387), Sym(406), Sym(421), Sym(429), Sym(437), Sym(456), Sym(471), Sym(479))
                      x193_buff += x464
                      val x185 = ()
                      x70 += 1
                    }
                    x56 += 1
                  }
                  val x494 = () // x451 ++ x493
                  val x441 = x494
                  x48 += 1
                }
                val x444 = () // x401 ++ x443
                val x391 = x444
                x40 += 1
              }
              val x394 = () // x351 ++ x393
              val x341 = x394
              x32 += 1
            }
            val x344 = () // x301 ++ x343
            val x291 = x344
            x24 += 1
          }
          val x294 = () // x251 ++ x293
          val x241 = x294
          x16 += 1
        }
        val x244 = () // x201 ++ x243
        val x187 = x244
        x8 += 1
      }
      val x193 = x193_buff.result
      val x194 = x193 //println(x193)
      val x177 = x194
      x177
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
  class timeL7C extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x151 = Array("</body></html>")
      val x6 = x1.files
      val x7 = x6.length
      val x169_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("<a href='", x11, "'>", x12, "</a><br/>")
        val x173 = x13.length
        var x172 = 0
        while (x172 < x173) {
          val x174 = x13.apply(x172)
          // prev yields ArrayBuffer(Sym(144), Sym(161))
          x169_buff += x174
          val x161 = ()
          x172 += 1
        }
        val x14 = x10.files
        val x15 = x14.length
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("-&nbsp;<a href='", x19, "'>", x20, "</a><br/>")
          val x223 = x21.length
          var x222 = 0
          while (x222 < x223) {
            val x224 = x21.apply(x222)
            // prev yields ArrayBuffer(Sym(144), Sym(161), Sym(182), Sym(197), Sym(205), Sym(213))
            x169_buff += x224
            val x161 = ()
            x222 += 1
          }
          val x22 = x18.files
          val x23 = x22.length
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("-&nbsp;-&nbsp;<a href='", x27, "'>", x28, "</a><br/>")
            val x273 = x29.length
            var x272 = 0
            while (x272 < x273) {
              val x274 = x29.apply(x272)
              // prev yields ArrayBuffer(Sym(144), Sym(161), Sym(182), Sym(197), Sym(205), Sym(213), Sym(232), Sym(247), Sym(255), Sym(263))
              x169_buff += x274
              val x161 = ()
              x272 += 1
            }
            val x30 = x26.files
            val x31 = x30.length
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x35, "'>", x36, "</a><br/>")
              val x323 = x37.length
              var x322 = 0
              while (x322 < x323) {
                val x324 = x37.apply(x322)
                // prev yields ArrayBuffer(Sym(144), Sym(161), Sym(182), Sym(197), Sym(205), Sym(213), Sym(232), Sym(247), Sym(255), Sym(263), Sym(282), Sym(297), Sym(305), Sym(313))
                x169_buff += x324
                val x161 = ()
                x322 += 1
              }
              val x38 = x34.files
              val x39 = x38.length
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x373 = x45.length
                var x372 = 0
                while (x372 < x373) {
                  val x374 = x45.apply(x372)
                  // prev yields ArrayBuffer(Sym(144), Sym(161), Sym(182), Sym(197), Sym(205), Sym(213), Sym(232), Sym(247), Sym(255), Sym(263), Sym(282), Sym(297), Sym(305), Sym(313), Sym(332), Sym(347), Sym(355), Sym(363))
                  x169_buff += x374
                  val x161 = ()
                  x372 += 1
                }
                val x46 = x42.files
                val x47 = x46.length
                var x48 = 0
                while (x48 < x47) {
                  val x50 = x46.apply(x48)
                  val x51 = x50.path
                  val x52 = x50.name
                  val x53 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x51, "'>", x52, "</a><br/>")
                  val x389 = x53.length
                  var x62 = 0
                  while (x62 < x389) {
                    val x390 = x53.apply(x62)
                    // prev yields ArrayBuffer(Sym(144), Sym(161), Sym(182), Sym(197), Sym(205), Sym(213), Sym(232), Sym(247), Sym(255), Sym(263), Sym(282), Sym(297), Sym(305), Sym(313), Sym(332), Sym(347), Sym(355), Sym(363), Sym(382), Sym(397), Sym(405))
                    x169_buff += x390
                    val x161 = ()
                    x62 += 1
                  }
                  x48 += 1
                }
                val x420 = () // x377 ++ x419
                val x367 = x420
                x40 += 1
              }
              val x370 = () // x327 ++ x369
              val x317 = x370
              x32 += 1
            }
            val x320 = () // x277 ++ x319
            val x267 = x320
            x24 += 1
          }
          val x270 = () // x227 ++ x269
          val x217 = x270
          x16 += 1
        }
        val x220 = () // x177 ++ x219
        val x163 = x220
        x8 += 1
      }
      val x169 = x169_buff.result
      val x170 = x169 //println(x169)
      val x153 = x170
      x153
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
      val x146 = x145 //println(x145)
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
      val x122 = x121 //println(x121)
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
      val x98 = x97 //println(x97)
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
      val x74 = x73 //println(x73)
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
      val x50 = x49 //println(x49)
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
  class timeL10origC extends ((Unit) => (Any)) {
    def apply(x0: Unit): Any = {
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x6 = x1.files
      val x7 = x6.length
      val x157_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x8 = 0
      while (x8 < x7) {
        val x10 = x6.apply(x8)
        val x11 = x10.path
        val x12 = x10.name
        val x13 = Array("<a href='", x11, "'>", x12, "</a></br>")
        val x14 = x10.files
        val x15 = x14.length
        val x148_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x16 = 0
        while (x16 < x15) {
          val x18 = x14.apply(x16)
          val x19 = x18.path
          val x20 = x18.name
          val x21 = Array("<a href='", x19, "'>", x20, "</a></br>")
          val x22 = x18.files
          val x23 = x22.length
          val x139_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x24 = 0
          while (x24 < x23) {
            val x26 = x22.apply(x24)
            val x27 = x26.path
            val x28 = x26.name
            val x29 = Array("<a href='", x27, "'>", x28, "</a></br>")
            val x30 = x26.files
            val x31 = x30.length
            val x130_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x32 = 0
            while (x32 < x31) {
              val x34 = x30.apply(x32)
              val x35 = x34.path
              val x36 = x34.name
              val x37 = Array("<a href='", x35, "'>", x36, "</a><br/>")
              val x38 = x34.files
              val x39 = x38.length
              val x121_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x40 = 0
              while (x40 < x39) {
                val x42 = x38.apply(x40)
                val x43 = x42.path
                val x44 = x42.name
                val x45 = Array("-&nbsp;<a href='", x43, "'>", x44, "</a><br/>")
                val x46 = x42.files
                val x47 = x46.length
                val x112_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                var x48 = 0
                while (x48 < x47) {
                  val x50 = x46.apply(x48)
                  val x51 = x50.path
                  val x52 = x50.name
                  val x53 = Array("-&nbsp;-&nbsp;<a href='", x51, "'>", x52, "</a><br/>")
                  val x54 = x50.files
                  val x55 = x54.length
                  val x103_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                  var x56 = 0
                  while (x56 < x55) {
                    val x58 = x54.apply(x56)
                    val x59 = x58.path
                    val x60 = x58.name
                    val x61 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x59, "'>", x60, "</a><br/>")
                    val x62 = x58.files
                    val x63 = x62.length
                    val x94_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                    var x64 = 0
                    while (x64 < x63) {
                      val x66 = x62.apply(x64)
                      val x67 = x66.path
                      val x68 = x66.name
                      val x69 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x67, "'>", x68, "</a><br/>")
                      val x70 = x66.files
                      val x71 = x70.length
                      val x85_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                      var x72 = 0
                      while (x72 < x71) {
                        val x74 = x70.apply(x72)
                        val x75 = x74.path
                        val x76 = x74.name
                        val x77 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x75, "'>", x76, "</a><br/>")
                        val x78 = x77.length
                        var x79 = 0
                        while (x79 < x78) {
                          val x80 = x77.apply(x79)
                          // Sym(81)yield Map(Sym(81) -> <function1>, Sym(144) -> <function1>, Sym(126) -> <function1>, Sym(99) -> <function1>, Sym(153) -> <function1>, Sym(117) -> <function1>, Sym(108) -> <function1>, Sym(135) -> <function1>, Sym(90) -> <function1>)previous 
                          x85_buff += x80
                          val x81 = ()
                          x79 += 1
                        }
                        x72 += 1
                      }
                      val x85 = x85_buff.toArray
                      val x86 = x69 ++ x85
                      val x87 = x86.length
                      var x88 = 0
                      while (x88 < x87) {
                        val x89 = x86.apply(x88)
                        // Sym(90)yield Map(Sym(144) -> <function1>, Sym(126) -> <function1>, Sym(99) -> <function1>, Sym(153) -> <function1>, Sym(117) -> <function1>, Sym(108) -> <function1>, Sym(135) -> <function1>, Sym(90) -> <function1>)previous 
                        x94_buff += x89
                        val x90 = ()
                        x88 += 1
                      }
                      x64 += 1
                    }
                    val x94 = x94_buff.toArray
                    val x95 = x61 ++ x94
                    val x96 = x95.length
                    var x97 = 0
                    while (x97 < x96) {
                      val x98 = x95.apply(x97)
                      // Sym(99)yield Map(Sym(144) -> <function1>, Sym(126) -> <function1>, Sym(99) -> <function1>, Sym(153) -> <function1>, Sym(117) -> <function1>, Sym(108) -> <function1>, Sym(135) -> <function1>)previous 
                      x103_buff += x98
                      val x99 = ()
                      x97 += 1
                    }
                    x56 += 1
                  }
                  val x103 = x103_buff.toArray
                  val x104 = x53 ++ x103
                  val x105 = x104.length
                  var x106 = 0
                  while (x106 < x105) {
                    val x107 = x104.apply(x106)
                    // Sym(108)yield Map(Sym(144) -> <function1>, Sym(126) -> <function1>, Sym(153) -> <function1>, Sym(117) -> <function1>, Sym(108) -> <function1>, Sym(135) -> <function1>)previous 
                    x112_buff += x107
                    val x108 = ()
                    x106 += 1
                  }
                  x48 += 1
                }
                val x112 = x112_buff.toArray
                val x113 = x45 ++ x112
                val x114 = x113.length
                var x115 = 0
                while (x115 < x114) {
                  val x116 = x113.apply(x115)
                  // Sym(117)yield Map(Sym(144) -> <function1>, Sym(126) -> <function1>, Sym(153) -> <function1>, Sym(117) -> <function1>, Sym(135) -> <function1>)previous 
                  x121_buff += x116
                  val x117 = ()
                  x115 += 1
                }
                x40 += 1
              }
              val x121 = x121_buff.toArray
              val x122 = x37 ++ x121
              val x123 = x122.length
              var x124 = 0
              while (x124 < x123) {
                val x125 = x122.apply(x124)
                // Sym(126)yield Map(Sym(153) -> <function1>, Sym(144) -> <function1>, Sym(135) -> <function1>, Sym(126) -> <function1>)previous 
                x130_buff += x125
                val x126 = ()
                x124 += 1
              }
              x32 += 1
            }
            val x130 = x130_buff.toArray
            val x131 = x29 ++ x130
            val x132 = x131.length
            var x133 = 0
            while (x133 < x132) {
              val x134 = x131.apply(x133)
              // Sym(135)yield Map(Sym(153) -> <function1>, Sym(144) -> <function1>, Sym(135) -> <function1>)previous 
              x139_buff += x134
              val x135 = ()
              x133 += 1
            }
            x24 += 1
          }
          val x139 = x139_buff.toArray
          val x140 = x21 ++ x139
          val x141 = x140.length
          var x142 = 0
          while (x142 < x141) {
            val x143 = x140.apply(x142)
            // Sym(144)yield Map(Sym(153) -> <function1>, Sym(144) -> <function1>)previous 
            x148_buff += x143
            val x144 = ()
            x142 += 1
          }
          x16 += 1
        }
        val x148 = x148_buff.toArray
        val x149 = x13 ++ x148
        val x150 = x149.length
        var x151 = 0
        while (x151 < x150) {
          val x152 = x149.apply(x151)
          // Sym(153)yield Map(Sym(153) -> <function1>)previous 
          x157_buff += x152
          val x153 = ()
          x151 += 1
        }
        x8 += 1
      }
      val x157 = x157_buff.toArray
      val x158 = x5 ++ x157
      val x159 = x2 ++ x158
      val x160 = Array("</body></html>")
      val x161 = x159 ++ x160
      val x162 = x161 //println(x161)
      x162
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
  class timeL9origC extends ((Unit) => (Any)) {
    def apply(x164: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x6 = x1.files
      val x7 = x6.length
      val x297_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x165 = 0
      while (x165 < x7) {
        val x167 = x6.apply(x165)
        val x168 = x167.path
        val x169 = x167.name
        val x170 = Array("<a href='", x168, "'>", x169, "</a></br>")
        val x171 = x167.files
        val x172 = x171.length
        val x288_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x173 = 0
        while (x173 < x172) {
          val x175 = x171.apply(x173)
          val x176 = x175.path
          val x177 = x175.name
          val x178 = Array("<a href='", x176, "'>", x177, "</a></br>")
          val x179 = x175.files
          val x180 = x179.length
          val x279_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x181 = 0
          while (x181 < x180) {
            val x183 = x179.apply(x181)
            val x184 = x183.path
            val x185 = x183.name
            val x186 = Array("<a href='", x184, "'>", x185, "</a><br/>")
            val x187 = x183.files
            val x188 = x187.length
            val x270_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x189 = 0
            while (x189 < x188) {
              val x191 = x187.apply(x189)
              val x192 = x191.path
              val x193 = x191.name
              val x194 = Array("-&nbsp;<a href='", x192, "'>", x193, "</a><br/>")
              val x195 = x191.files
              val x196 = x195.length
              val x261_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x197 = 0
              while (x197 < x196) {
                val x199 = x195.apply(x197)
                val x200 = x199.path
                val x201 = x199.name
                val x202 = Array("-&nbsp;-&nbsp;<a href='", x200, "'>", x201, "</a><br/>")
                val x203 = x199.files
                val x204 = x203.length
                val x252_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                var x205 = 0
                while (x205 < x204) {
                  val x207 = x203.apply(x205)
                  val x208 = x207.path
                  val x209 = x207.name
                  val x210 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x208, "'>", x209, "</a><br/>")
                  val x211 = x207.files
                  val x212 = x211.length
                  val x243_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                  var x213 = 0
                  while (x213 < x212) {
                    val x215 = x211.apply(x213)
                    val x216 = x215.path
                    val x217 = x215.name
                    val x218 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x216, "'>", x217, "</a><br/>")
                    val x219 = x215.files
                    val x220 = x219.length
                    val x234_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                    var x221 = 0
                    while (x221 < x220) {
                      val x223 = x219.apply(x221)
                      val x224 = x223.path
                      val x225 = x223.name
                      val x226 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x224, "'>", x225, "</a><br/>")
                      val x227 = x226.length
                      var x228 = 0
                      while (x228 < x227) {
                        val x229 = x226.apply(x228)
                        // Sym(230)yield Map(Sym(239) -> <function1>, Sym(257) -> <function1>, Sym(230) -> <function1>, Sym(266) -> <function1>, Sym(284) -> <function1>, Sym(248) -> <function1>, Sym(293) -> <function1>, Sym(275) -> <function1>)previous 
                        x234_buff += x229
                        val x230 = ()
                        x228 += 1
                      }
                      x221 += 1
                    }
                    val x234 = x234_buff.toArray
                    val x235 = x218 ++ x234
                    val x236 = x235.length
                    var x237 = 0
                    while (x237 < x236) {
                      val x238 = x235.apply(x237)
                      // Sym(239)yield Map(Sym(239) -> <function1>, Sym(257) -> <function1>, Sym(266) -> <function1>, Sym(284) -> <function1>, Sym(248) -> <function1>, Sym(293) -> <function1>, Sym(275) -> <function1>)previous 
                      x243_buff += x238
                      val x239 = ()
                      x237 += 1
                    }
                    x213 += 1
                  }
                  val x243 = x243_buff.toArray
                  val x244 = x210 ++ x243
                  val x245 = x244.length
                  var x246 = 0
                  while (x246 < x245) {
                    val x247 = x244.apply(x246)
                    // Sym(248)yield Map(Sym(257) -> <function1>, Sym(266) -> <function1>, Sym(284) -> <function1>, Sym(248) -> <function1>, Sym(293) -> <function1>, Sym(275) -> <function1>)previous 
                    x252_buff += x247
                    val x248 = ()
                    x246 += 1
                  }
                  x205 += 1
                }
                val x252 = x252_buff.toArray
                val x253 = x202 ++ x252
                val x254 = x253.length
                var x255 = 0
                while (x255 < x254) {
                  val x256 = x253.apply(x255)
                  // Sym(257)yield Map(Sym(257) -> <function1>, Sym(266) -> <function1>, Sym(284) -> <function1>, Sym(293) -> <function1>, Sym(275) -> <function1>)previous 
                  x261_buff += x256
                  val x257 = ()
                  x255 += 1
                }
                x197 += 1
              }
              val x261 = x261_buff.toArray
              val x262 = x194 ++ x261
              val x263 = x262.length
              var x264 = 0
              while (x264 < x263) {
                val x265 = x262.apply(x264)
                // Sym(266)yield Map(Sym(293) -> <function1>, Sym(284) -> <function1>, Sym(275) -> <function1>, Sym(266) -> <function1>)previous 
                x270_buff += x265
                val x266 = ()
                x264 += 1
              }
              x189 += 1
            }
            val x270 = x270_buff.toArray
            val x271 = x186 ++ x270
            val x272 = x271.length
            var x273 = 0
            while (x273 < x272) {
              val x274 = x271.apply(x273)
              // Sym(275)yield Map(Sym(293) -> <function1>, Sym(284) -> <function1>, Sym(275) -> <function1>)previous 
              x279_buff += x274
              val x275 = ()
              x273 += 1
            }
            x181 += 1
          }
          val x279 = x279_buff.toArray
          val x280 = x178 ++ x279
          val x281 = x280.length
          var x282 = 0
          while (x282 < x281) {
            val x283 = x280.apply(x282)
            // Sym(284)yield Map(Sym(293) -> <function1>, Sym(284) -> <function1>)previous 
            x288_buff += x283
            val x284 = ()
            x282 += 1
          }
          x173 += 1
        }
        val x288 = x288_buff.toArray
        val x289 = x170 ++ x288
        val x290 = x289.length
        var x291 = 0
        while (x291 < x290) {
          val x292 = x289.apply(x291)
          // Sym(293)yield Map(Sym(293) -> <function1>)previous 
          x297_buff += x292
          val x293 = ()
          x291 += 1
        }
        x165 += 1
      }
      val x297 = x297_buff.toArray
      val x298 = x5 ++ x297
      val x299 = x2 ++ x298
      val x300 = x299 ++ x160
      val x301 = x300 //println(x300)
      x301
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
  class timeL8origC extends ((Unit) => (Any)) {
    def apply(x303: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x6 = x1.files
      val x7 = x6.length
      val x419_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x304 = 0
      while (x304 < x7) {
        val x306 = x6.apply(x304)
        val x307 = x306.path
        val x308 = x306.name
        val x309 = Array("<a href='", x307, "'>", x308, "</a></br>")
        val x310 = x306.files
        val x311 = x310.length
        val x410_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x312 = 0
        while (x312 < x311) {
          val x314 = x310.apply(x312)
          val x315 = x314.path
          val x316 = x314.name
          val x317 = Array("<a href='", x315, "'>", x316, "</a><br/>")
          val x318 = x314.files
          val x319 = x318.length
          val x401_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x320 = 0
          while (x320 < x319) {
            val x322 = x318.apply(x320)
            val x323 = x322.path
            val x324 = x322.name
            val x325 = Array("-&nbsp;<a href='", x323, "'>", x324, "</a><br/>")
            val x326 = x322.files
            val x327 = x326.length
            val x392_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x328 = 0
            while (x328 < x327) {
              val x330 = x326.apply(x328)
              val x331 = x330.path
              val x332 = x330.name
              val x333 = Array("-&nbsp;-&nbsp;<a href='", x331, "'>", x332, "</a><br/>")
              val x334 = x330.files
              val x335 = x334.length
              val x383_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x336 = 0
              while (x336 < x335) {
                val x338 = x334.apply(x336)
                val x339 = x338.path
                val x340 = x338.name
                val x341 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x339, "'>", x340, "</a><br/>")
                val x342 = x338.files
                val x343 = x342.length
                val x374_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                var x344 = 0
                while (x344 < x343) {
                  val x346 = x342.apply(x344)
                  val x347 = x346.path
                  val x348 = x346.name
                  val x349 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x347, "'>", x348, "</a><br/>")
                  val x350 = x346.files
                  val x351 = x350.length
                  val x365_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                  var x352 = 0
                  while (x352 < x351) {
                    val x354 = x350.apply(x352)
                    val x355 = x354.path
                    val x356 = x354.name
                    val x357 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x355, "'>", x356, "</a><br/>")
                    val x358 = x357.length
                    var x359 = 0
                    while (x359 < x358) {
                      val x360 = x357.apply(x359)
                      // Sym(361)yield Map(Sym(379) -> <function1>, Sym(397) -> <function1>, Sym(406) -> <function1>, Sym(370) -> <function1>, Sym(361) -> <function1>, Sym(388) -> <function1>, Sym(415) -> <function1>)previous 
                      x365_buff += x360
                      val x361 = ()
                      x359 += 1
                    }
                    x352 += 1
                  }
                  val x365 = x365_buff.toArray
                  val x366 = x349 ++ x365
                  val x367 = x366.length
                  var x368 = 0
                  while (x368 < x367) {
                    val x369 = x366.apply(x368)
                    // Sym(370)yield Map(Sym(379) -> <function1>, Sym(397) -> <function1>, Sym(406) -> <function1>, Sym(370) -> <function1>, Sym(388) -> <function1>, Sym(415) -> <function1>)previous 
                    x374_buff += x369
                    val x370 = ()
                    x368 += 1
                  }
                  x344 += 1
                }
                val x374 = x374_buff.toArray
                val x375 = x341 ++ x374
                val x376 = x375.length
                var x377 = 0
                while (x377 < x376) {
                  val x378 = x375.apply(x377)
                  // Sym(379)yield Map(Sym(379) -> <function1>, Sym(397) -> <function1>, Sym(406) -> <function1>, Sym(388) -> <function1>, Sym(415) -> <function1>)previous 
                  x383_buff += x378
                  val x379 = ()
                  x377 += 1
                }
                x336 += 1
              }
              val x383 = x383_buff.toArray
              val x384 = x333 ++ x383
              val x385 = x384.length
              var x386 = 0
              while (x386 < x385) {
                val x387 = x384.apply(x386)
                // Sym(388)yield Map(Sym(415) -> <function1>, Sym(406) -> <function1>, Sym(397) -> <function1>, Sym(388) -> <function1>)previous 
                x392_buff += x387
                val x388 = ()
                x386 += 1
              }
              x328 += 1
            }
            val x392 = x392_buff.toArray
            val x393 = x325 ++ x392
            val x394 = x393.length
            var x395 = 0
            while (x395 < x394) {
              val x396 = x393.apply(x395)
              // Sym(397)yield Map(Sym(415) -> <function1>, Sym(406) -> <function1>, Sym(397) -> <function1>)previous 
              x401_buff += x396
              val x397 = ()
              x395 += 1
            }
            x320 += 1
          }
          val x401 = x401_buff.toArray
          val x402 = x317 ++ x401
          val x403 = x402.length
          var x404 = 0
          while (x404 < x403) {
            val x405 = x402.apply(x404)
            // Sym(406)yield Map(Sym(415) -> <function1>, Sym(406) -> <function1>)previous 
            x410_buff += x405
            val x406 = ()
            x404 += 1
          }
          x312 += 1
        }
        val x410 = x410_buff.toArray
        val x411 = x309 ++ x410
        val x412 = x411.length
        var x413 = 0
        while (x413 < x412) {
          val x414 = x411.apply(x413)
          // Sym(415)yield Map(Sym(415) -> <function1>)previous 
          x419_buff += x414
          val x415 = ()
          x413 += 1
        }
        x304 += 1
      }
      val x419 = x419_buff.toArray
      val x420 = x5 ++ x419
      val x421 = x2 ++ x420
      val x422 = x421 ++ x160
      val x423 = x422 //println(x422)
      x423
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
  class timeL7origC extends ((Unit) => (Any)) {
    def apply(x425: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x5 = Array("<a href='", x3, "'>", x4, "</a></br>")
      val x6 = x1.files
      val x7 = x6.length
      val x524_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x426 = 0
      while (x426 < x7) {
        val x428 = x6.apply(x426)
        val x429 = x428.path
        val x430 = x428.name
        val x431 = Array("<a href='", x429, "'>", x430, "</a><br/>")
        val x432 = x428.files
        val x433 = x432.length
        val x515_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x434 = 0
        while (x434 < x433) {
          val x436 = x432.apply(x434)
          val x437 = x436.path
          val x438 = x436.name
          val x439 = Array("-&nbsp;<a href='", x437, "'>", x438, "</a><br/>")
          val x440 = x436.files
          val x441 = x440.length
          val x506_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x442 = 0
          while (x442 < x441) {
            val x444 = x440.apply(x442)
            val x445 = x444.path
            val x446 = x444.name
            val x447 = Array("-&nbsp;-&nbsp;<a href='", x445, "'>", x446, "</a><br/>")
            val x448 = x444.files
            val x449 = x448.length
            val x497_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x450 = 0
            while (x450 < x449) {
              val x452 = x448.apply(x450)
              val x453 = x452.path
              val x454 = x452.name
              val x455 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x453, "'>", x454, "</a><br/>")
              val x456 = x452.files
              val x457 = x456.length
              val x488_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x458 = 0
              while (x458 < x457) {
                val x460 = x456.apply(x458)
                val x461 = x460.path
                val x462 = x460.name
                val x463 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x461, "'>", x462, "</a><br/>")
                val x464 = x460.files
                val x465 = x464.length
                val x479_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
                var x466 = 0
                while (x466 < x465) {
                  val x468 = x464.apply(x466)
                  val x469 = x468.path
                  val x470 = x468.name
                  val x471 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x469, "'>", x470, "</a><br/>")
                  val x472 = x471.length
                  var x473 = 0
                  while (x473 < x472) {
                    val x474 = x471.apply(x473)
                    // Sym(475)yield Map(Sym(520) -> <function1>, Sym(511) -> <function1>, Sym(484) -> <function1>, Sym(493) -> <function1>, Sym(475) -> <function1>, Sym(502) -> <function1>)previous 
                    x479_buff += x474
                    val x475 = ()
                    x473 += 1
                  }
                  x466 += 1
                }
                val x479 = x479_buff.toArray
                val x480 = x463 ++ x479
                val x481 = x480.length
                var x482 = 0
                while (x482 < x481) {
                  val x483 = x480.apply(x482)
                  // Sym(484)yield Map(Sym(520) -> <function1>, Sym(511) -> <function1>, Sym(484) -> <function1>, Sym(493) -> <function1>, Sym(502) -> <function1>)previous 
                  x488_buff += x483
                  val x484 = ()
                  x482 += 1
                }
                x458 += 1
              }
              val x488 = x488_buff.toArray
              val x489 = x455 ++ x488
              val x490 = x489.length
              var x491 = 0
              while (x491 < x490) {
                val x492 = x489.apply(x491)
                // Sym(493)yield Map(Sym(520) -> <function1>, Sym(511) -> <function1>, Sym(502) -> <function1>, Sym(493) -> <function1>)previous 
                x497_buff += x492
                val x493 = ()
                x491 += 1
              }
              x450 += 1
            }
            val x497 = x497_buff.toArray
            val x498 = x447 ++ x497
            val x499 = x498.length
            var x500 = 0
            while (x500 < x499) {
              val x501 = x498.apply(x500)
              // Sym(502)yield Map(Sym(520) -> <function1>, Sym(511) -> <function1>, Sym(502) -> <function1>)previous 
              x506_buff += x501
              val x502 = ()
              x500 += 1
            }
            x442 += 1
          }
          val x506 = x506_buff.toArray
          val x507 = x439 ++ x506
          val x508 = x507.length
          var x509 = 0
          while (x509 < x508) {
            val x510 = x507.apply(x509)
            // Sym(511)yield Map(Sym(520) -> <function1>, Sym(511) -> <function1>)previous 
            x515_buff += x510
            val x511 = ()
            x509 += 1
          }
          x434 += 1
        }
        val x515 = x515_buff.toArray
        val x516 = x431 ++ x515
        val x517 = x516.length
        var x518 = 0
        while (x518 < x517) {
          val x519 = x516.apply(x518)
          // Sym(520)yield Map(Sym(520) -> <function1>)previous 
          x524_buff += x519
          val x520 = ()
          x518 += 1
        }
        x426 += 1
      }
      val x524 = x524_buff.toArray
      val x525 = x5 ++ x524
      val x526 = x2 ++ x525
      val x527 = x526 ++ x160
      val x528 = x527 //println(x527)
      x528
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
    def apply(x530: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x531 = Array("<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x613_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x532 = 0
      while (x532 < x7) {
        val x534 = x6.apply(x532)
        val x535 = x534.path
        val x536 = x534.name
        val x537 = Array("-&nbsp;<a href='", x535, "'>", x536, "</a><br/>")
        val x538 = x534.files
        val x539 = x538.length
        val x604_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x540 = 0
        while (x540 < x539) {
          val x542 = x538.apply(x540)
          val x543 = x542.path
          val x544 = x542.name
          val x545 = Array("-&nbsp;-&nbsp;<a href='", x543, "'>", x544, "</a><br/>")
          val x546 = x542.files
          val x547 = x546.length
          val x595_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x548 = 0
          while (x548 < x547) {
            val x550 = x546.apply(x548)
            val x551 = x550.path
            val x552 = x550.name
            val x553 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x551, "'>", x552, "</a><br/>")
            val x554 = x550.files
            val x555 = x554.length
            val x586_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x556 = 0
            while (x556 < x555) {
              val x558 = x554.apply(x556)
              val x559 = x558.path
              val x560 = x558.name
              val x561 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x559, "'>", x560, "</a><br/>")
              val x562 = x558.files
              val x563 = x562.length
              val x577_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
              var x564 = 0
              while (x564 < x563) {
                val x566 = x562.apply(x564)
                val x567 = x566.path
                val x568 = x566.name
                val x569 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x567, "'>", x568, "</a><br/>")
                val x570 = x569.length
                var x571 = 0
                while (x571 < x570) {
                  val x572 = x569.apply(x571)
                  // Sym(573)yield Map(Sym(591) -> <function1>, Sym(582) -> <function1>, Sym(600) -> <function1>, Sym(609) -> <function1>, Sym(573) -> <function1>)previous 
                  x577_buff += x572
                  val x573 = ()
                  x571 += 1
                }
                x564 += 1
              }
              val x577 = x577_buff.toArray
              val x578 = x561 ++ x577
              val x579 = x578.length
              var x580 = 0
              while (x580 < x579) {
                val x581 = x578.apply(x580)
                // Sym(582)yield Map(Sym(609) -> <function1>, Sym(600) -> <function1>, Sym(591) -> <function1>, Sym(582) -> <function1>)previous 
                x586_buff += x581
                val x582 = ()
                x580 += 1
              }
              x556 += 1
            }
            val x586 = x586_buff.toArray
            val x587 = x553 ++ x586
            val x588 = x587.length
            var x589 = 0
            while (x589 < x588) {
              val x590 = x587.apply(x589)
              // Sym(591)yield Map(Sym(609) -> <function1>, Sym(600) -> <function1>, Sym(591) -> <function1>)previous 
              x595_buff += x590
              val x591 = ()
              x589 += 1
            }
            x548 += 1
          }
          val x595 = x595_buff.toArray
          val x596 = x545 ++ x595
          val x597 = x596.length
          var x598 = 0
          while (x598 < x597) {
            val x599 = x596.apply(x598)
            // Sym(600)yield Map(Sym(609) -> <function1>, Sym(600) -> <function1>)previous 
            x604_buff += x599
            val x600 = ()
            x598 += 1
          }
          x540 += 1
        }
        val x604 = x604_buff.toArray
        val x605 = x537 ++ x604
        val x606 = x605.length
        var x607 = 0
        while (x607 < x606) {
          val x608 = x605.apply(x607)
          // Sym(609)yield Map(Sym(609) -> <function1>)previous 
          x613_buff += x608
          val x609 = ()
          x607 += 1
        }
        x532 += 1
      }
      val x613 = x613_buff.toArray
      val x614 = x531 ++ x613
      val x615 = x2 ++ x614
      val x616 = x615 ++ x160
      val x617 = x616 //println(x616)
      x617
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
    def apply(x619: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x620 = Array("-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x685_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x621 = 0
      while (x621 < x7) {
        val x623 = x6.apply(x621)
        val x624 = x623.path
        val x625 = x623.name
        val x626 = Array("-&nbsp;-&nbsp;<a href='", x624, "'>", x625, "</a><br/>")
        val x627 = x623.files
        val x628 = x627.length
        val x676_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x629 = 0
        while (x629 < x628) {
          val x631 = x627.apply(x629)
          val x632 = x631.path
          val x633 = x631.name
          val x634 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x632, "'>", x633, "</a><br/>")
          val x635 = x631.files
          val x636 = x635.length
          val x667_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x637 = 0
          while (x637 < x636) {
            val x639 = x635.apply(x637)
            val x640 = x639.path
            val x641 = x639.name
            val x642 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x640, "'>", x641, "</a><br/>")
            val x643 = x639.files
            val x644 = x643.length
            val x658_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
            var x645 = 0
            while (x645 < x644) {
              val x647 = x643.apply(x645)
              val x648 = x647.path
              val x649 = x647.name
              val x650 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x648, "'>", x649, "</a><br/>")
              val x651 = x650.length
              var x652 = 0
              while (x652 < x651) {
                val x653 = x650.apply(x652)
                // Sym(654)yield Map(Sym(681) -> <function1>, Sym(672) -> <function1>, Sym(663) -> <function1>, Sym(654) -> <function1>)previous 
                x658_buff += x653
                val x654 = ()
                x652 += 1
              }
              x645 += 1
            }
            val x658 = x658_buff.toArray
            val x659 = x642 ++ x658
            val x660 = x659.length
            var x661 = 0
            while (x661 < x660) {
              val x662 = x659.apply(x661)
              // Sym(663)yield Map(Sym(681) -> <function1>, Sym(672) -> <function1>, Sym(663) -> <function1>)previous 
              x667_buff += x662
              val x663 = ()
              x661 += 1
            }
            x637 += 1
          }
          val x667 = x667_buff.toArray
          val x668 = x634 ++ x667
          val x669 = x668.length
          var x670 = 0
          while (x670 < x669) {
            val x671 = x668.apply(x670)
            // Sym(672)yield Map(Sym(681) -> <function1>, Sym(672) -> <function1>)previous 
            x676_buff += x671
            val x672 = ()
            x670 += 1
          }
          x629 += 1
        }
        val x676 = x676_buff.toArray
        val x677 = x626 ++ x676
        val x678 = x677.length
        var x679 = 0
        while (x679 < x678) {
          val x680 = x677.apply(x679)
          // Sym(681)yield Map(Sym(681) -> <function1>)previous 
          x685_buff += x680
          val x681 = ()
          x679 += 1
        }
        x621 += 1
      }
      val x685 = x685_buff.toArray
      val x686 = x620 ++ x685
      val x687 = x2 ++ x686
      val x688 = x687 ++ x160
      val x689 = x688 //println(x688)
      x689
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
    def apply(x691: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x692 = Array("-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x740_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x693 = 0
      while (x693 < x7) {
        val x695 = x6.apply(x693)
        val x696 = x695.path
        val x697 = x695.name
        val x698 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x696, "'>", x697, "</a><br/>")
        val x699 = x695.files
        val x700 = x699.length
        val x731_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x701 = 0
        while (x701 < x700) {
          val x703 = x699.apply(x701)
          val x704 = x703.path
          val x705 = x703.name
          val x706 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x704, "'>", x705, "</a><br/>")
          val x707 = x703.files
          val x708 = x707.length
          val x722_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
          var x709 = 0
          while (x709 < x708) {
            val x711 = x707.apply(x709)
            val x712 = x711.path
            val x713 = x711.name
            val x714 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x712, "'>", x713, "</a><br/>")
            val x715 = x714.length
            var x716 = 0
            while (x716 < x715) {
              val x717 = x714.apply(x716)
              // Sym(718)yield Map(Sym(736) -> <function1>, Sym(727) -> <function1>, Sym(718) -> <function1>)previous 
              x722_buff += x717
              val x718 = ()
              x716 += 1
            }
            x709 += 1
          }
          val x722 = x722_buff.toArray
          val x723 = x706 ++ x722
          val x724 = x723.length
          var x725 = 0
          while (x725 < x724) {
            val x726 = x723.apply(x725)
            // Sym(727)yield Map(Sym(736) -> <function1>, Sym(727) -> <function1>)previous 
            x731_buff += x726
            val x727 = ()
            x725 += 1
          }
          x701 += 1
        }
        val x731 = x731_buff.toArray
        val x732 = x698 ++ x731
        val x733 = x732.length
        var x734 = 0
        while (x734 < x733) {
          val x735 = x732.apply(x734)
          // Sym(736)yield Map(Sym(736) -> <function1>)previous 
          x740_buff += x735
          val x736 = ()
          x734 += 1
        }
        x693 += 1
      }
      val x740 = x740_buff.toArray
      val x741 = x692 ++ x740
      val x742 = x2 ++ x741
      val x743 = x742 ++ x160
      val x744 = x743 //println(x743)
      x744
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
    def apply(x746: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x747 = Array("-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x778_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x748 = 0
      while (x748 < x7) {
        val x750 = x6.apply(x748)
        val x751 = x750.path
        val x752 = x750.name
        val x753 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x751, "'>", x752, "</a><br/>")
        val x754 = x750.files
        val x755 = x754.length
        val x769_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
        var x756 = 0
        while (x756 < x755) {
          val x758 = x754.apply(x756)
          val x759 = x758.path
          val x760 = x758.name
          val x761 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x759, "'>", x760, "</a><br/>")
          val x762 = x761.length
          var x763 = 0
          while (x763 < x762) {
            val x764 = x761.apply(x763)
            // Sym(765)yield Map(Sym(774) -> <function1>, Sym(765) -> <function1>)previous 
            x769_buff += x764
            val x765 = ()
            x763 += 1
          }
          x756 += 1
        }
        val x769 = x769_buff.toArray
        val x770 = x753 ++ x769
        val x771 = x770.length
        var x772 = 0
        while (x772 < x771) {
          val x773 = x770.apply(x772)
          // Sym(774)yield Map(Sym(774) -> <function1>)previous 
          x778_buff += x773
          val x774 = ()
          x772 += 1
        }
        x748 += 1
      }
      val x778 = x778_buff.toArray
      val x779 = x747 ++ x778
      val x780 = x2 ++ x779
      val x781 = x780 ++ x160
      val x782 = x781 //println(x781)
      x782
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
    def apply(x784: Unit): Any = {
      val x160 = Array("</body></html>")
      val x2 = Array("<html><body>")
      val x1 = file
      val x3 = x1.path
      val x4 = x1.name
      val x785 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x3, "'>", x4, "</a><br/>")
      val x6 = x1.files
      val x7 = x6.length
      val x799_buff = new scala.collection.mutable.ArrayBuffer[java.lang.String]
      var x786 = 0
      while (x786 < x7) {
        val x788 = x6.apply(x786)
        val x789 = x788.path
        val x790 = x788.name
        val x791 = Array("-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href='", x789, "'>", x790, "</a><br/>")
        val x792 = x791.length
        var x793 = 0
        while (x793 < x792) {
          val x794 = x791.apply(x793)
          // Sym(795)yield Map(Sym(795) -> <function1>)previous 
          x799_buff += x794
          val x795 = ()
          x793 += 1
        }
        x786 += 1
      }
      val x799 = x799_buff.toArray
      val x800 = x785 ++ x799
      val x801 = x2 ++ x800
      val x802 = x801 ++ x160
      val x803 = x802 //println(x802)
      x803
    }
  }
  /**
   * ***************************************
   * End of Generated Code
   * *****************************************
   */
}