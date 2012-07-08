package parsing

import java.io.File

case class SimpleFile(val name: String, val path: String, children: Array[SimpleFile]) {
  def export(b: StringBuilder): Unit = {
    b.append(name.replaceAll(" ", "!|!") + " " + path.replaceAll(" ", "!|!") + " " + children.length + "\n")
    children.foreach(_.export(b))
  }
}

object DirectoryStructure extends App {
  val res = new scala.collection.mutable.ArrayBuffer[SimpleFile]
  def parseFile(f: File): SimpleFile = {
    import scala.collection.JavaConversions._
    SimpleFile(f.getName, f.getAbsolutePath, if (f.isDirectory && f.listFiles() != null) f.listFiles.map(parseFile) else Array[SimpleFile]())
  }
  // root file
  val x = new File("/home/vjovanov/work")
  val b = new StringBuilder
  parseFile(x).export(b)
  val fstream = new java.io.FileWriter("/tmp/fs")
  fstream.write(b.toArray)
  fstream.flush()
  fstream.close()
}