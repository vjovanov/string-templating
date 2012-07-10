package template.dir

import scala.collection.mutable.ArrayBuffer

case class SimpleFile(name: String, path: String, files: Array[SimpleFile])

trait Input {
  def parse(file: String) = {
    val fr = new java.io.BufferedReader(new java.io.FileReader(file))

    def parseLine(line: String): SimpleFile = {
      val parts = line.split(" ")
      SimpleFile(parts(0), parts(1), (0 until parts(2).toInt).map(x => parseLine(fr.readLine)).toArray)
    }
    val line = fr.readLine
    println(line.length)
    parseLine(line)
  }

  def parseIdealTree(branching: Int, level: Int) = {

    def parseLine(branching: Int, level: Int): SimpleFile = {
      SimpleFile("fname",
          "/fname",
          if (level != 0) (0 until branching).map(x => parseLine(branching, level - 1)).toArray else new Array[SimpleFile](0)
      )
    }
    parseLine(branching, level)
  }
}

trait FileTemplates {
  @inline
  final def f01(f: SimpleFile) = Array("""<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f02(_))
  
  @inline
  final def f02(f: SimpleFile) = Array("""<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f03(_))
  
  @inline
  final def f03(f: SimpleFile) = Array("""<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f04(_))
  
  @inline
  final def f04(f: SimpleFile) = Array("""<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f1(_))
  
  @inline
  final def f1(f: SimpleFile) = Array("""<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f2(_))

  @inline
  final def f2(f: SimpleFile) = Array("""-&nbsp;<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f3(_)) 

  @inline
  final def f3(f: SimpleFile) = Array("""-&nbsp;-&nbsp;<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f4(_))

  @inline
  final def f4(f: SimpleFile) = Array("""-&nbsp;-&nbsp;-&nbsp;<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f5(_))

  @inline
  final def f5(f: SimpleFile) = Array("""-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href="""", f.path, "\">", f.name, "</a></br>") ++ f.files.flatMap(f6(_))

  @inline
  final def f6(f: SimpleFile) = Array("""-&nbsp;-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href="""", f.path, "\">", f.name, "</a></br>")

  @inline
  final def f1Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """<a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }

  @inline
  final def f2Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """-&nbsp;<a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }

  @inline
  final def f3Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """-&nbsp;-&nbsp;<a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }

  @inline
  final def f4Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """-&nbsp;-&nbsp;-&nbsp;<a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }

  @inline
  final def f5Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """-&nbsp;-&nbsp;-&nbsp;-&nbsp;<a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }

  @inline
  final def f6Pre(b: ArrayBuffer[String], f: SimpleFile) = {
    b += """-&nbsp;-&nbsp;-&nbsp;-&nbsp;-<br><a href=""""
    b += f.path
    b += "\">"
    b += f.name 
    b += "</a>"
  }
}