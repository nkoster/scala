object FileMatcher {

  private def filesHere = (new java.io.File(".")).listFiles

  def filesEnding(q: String) =
    for (
      file <-filesHere
      if (file.getName.endsWith(q))
    ) yield file

  def filesContaining(q: String) =
    for (
      file <- filesHere
      if (file.getName.contains(q))
    ) yield file

}

val f = FileMatcher

f.filesEnding(".scala").foreach(println)
println("-----------")
f.filesContaining("chap").foreach(println)