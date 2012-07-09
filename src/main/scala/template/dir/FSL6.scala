package template.dir
import org.example.SimpleScalaBenchmark
import com.google.caliper.SimpleBenchmark

import com.google.caliper.{ Runner => CaliperRunner }

object FSL6 {
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
    CaliperRunner.main(classOf[FSL6], args: _*)

    assert(L6F == L6)
    assert(L5F == L5)
    assert(L4F == L4)
    assert(L3F == L3)
    assert(L2F == L2)
    assert(L1F == L1)
    println(L1F)
  }

}

class FSL6 extends SimpleScalaBenchmark with FileTemplates with Input {
  var file: SimpleFile = _
  import FSL6._

  override def setUp() {
    if (file == null)
          file = parse("/home/vojin/fs")
      //file = parseIdealTree(2)
    println(file)
  }

  def timeL6(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f1(file) ++ Array("""</body></html>""")
    println(res.length)
  }

  def timeL6Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""
    f1Pre(b, file)
    var i1 = 0
    val f1size = file.files.size
    while (i1 < f1size) {
      val f1 = file.files(i1)
      var i2 = 0
      val f2size = f1.files.length
      f2Pre(b, f1)
      while (i2 < f2size) {
        val f2 = f1.files(i2)
        var i3 = 0
        val f3size = f2.files.length
        f3Pre(b, f2)
        while (i3 < f3size) {
          val f3 = f2.files(i3)
          var i4 = 0
          val f4size = f3.files.length
          f4Pre(b, f3)
          while (i4 < f4size) {
            val f4 = f3.files(i4)
            var i5 = 0
            val f5size = f4.files.length
            f5Pre(b, f4)
            while (i5 < f5size) {
              f6Pre(b, f4.files(i5))
              i5 += 1
            }
            i4 += 1
          }
          i3 += 1
        }
        i2 += 1
      }
      i1 += 1
    }

    b += """</body></html>"""
    L6F = b.toArray
    b.toArray
  }

  def timeL5(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f2(file) ++ Array("""</body></html>""")
    L6 = res
  }

  def timeL5Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""
    val f1 = file
    var i2 = 0
    val f2size = f1.files.length
    f2Pre(b, f1)
    while (i2 < f2size) {
      val f2 = f1.files(i2)
      var i3 = 0
      val f3size = f2.files.length
      f3Pre(b, f2)
      while (i3 < f3size) {
        val f3 = f2.files(i3)
        var i4 = 0
        val f4size = f3.files.length
        f4Pre(b, f3)
        while (i4 < f4size) {
          val f4 = f3.files(i4)
          var i5 = 0
          val f5size = f4.files.length
          f5Pre(b, f4)
          while (i5 < f5size) {
            f6Pre(b, f4.files(i5))
            i5 += 1
          }
          i4 += 1
        }
        i3 += 1
      }
      i2 += 1
    }
    b += """</body></html>"""
    L5F = b.toArray
    b
  }

  def timeL4(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f3(file) ++ Array("""</body></html>""")
    L4 = res
  }

  def timeL4Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""
    val f2 = file
    var i3 = 0
    val f3size = f2.files.length
    f3Pre(b, f2)
    while (i3 < f3size) {
      val f3 = f2.files(i3)
      var i4 = 0
      val f4size = f3.files.length
      f4Pre(b, f3)
      while (i4 < f4size) {
        val f4 = f3.files(i4)
        var i5 = 0
        val f5size = f4.files.length
        f5Pre(b, f4)
        while (i5 < f5size) {
          f6Pre(b, f4.files(i5))
          i5 += 1
        }
        i4 += 1
      }
      i3 += 1
    }
    L4F = b.toArray
    b
  }

  def timeL3(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f4(file) ++ Array("""</body></html>""")
    L3 = res
  }

  def timeL3Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""
    val f3 = file
    var i4 = 0
    val f4size = f3.files.length
    while (i4 < f4size) {
      val f4 = f3.files(i4)
      var i5 = 0
      val f5size = f4.files.length
      f5Pre(b, f4)
      while (i5 < f5size) {
        f6Pre(b, f4.files(i5))
        i5 += 1
      }
      i4 += 1
    }
    b += """</body></html>"""
    L3F = b.toArray
    b
  }

  def timeL2(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f5(file) ++ Array("""</body></html>""")
    L2 = res
  }

  def timeL2Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""
    val f4 = file
    var i5 = 0
    val f5size = f4.files.length
    f5Pre(b, f4)
    while (i5 < f5size) {
      f6Pre(b, f4.files(i5))
      i5 += 1
    }
    b += """</body></html>"""
    L2F = b.toArray
    b
  }

  def timeL1(reps: Int) = repeat(reps) {
    val res = Array("""<html><body>""") ++ f6(file) ++ Array("""</body></html>""")
    L1 = res.toArray
  }

  def timeL1Fused(reps: Int) = repeat(reps) {
    val b = new scala.collection.mutable.ArrayBuffer[String]
    b += """<html><body>"""

    val f5 = file
    f6Pre(b, f5)
    L1F = b.toArray
    b += """</body></html>"""
    b
  }

}
