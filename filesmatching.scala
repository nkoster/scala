object FileMatcher1 {

  private def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(q: String,
                    matcher: (String, String) => Boolean) = {
    for (
      file <- filesHere
      if matcher(file.getName, q)
    ) yield file
  }

  def filesEnding(q: String) = filesMatching(q, _.endsWith(_))
  def filesContaining(q: String) = filesMatching(q, _.contains(_))
  def filesRegex(q: String) = filesMatching(q, _.matches(_))

}

object FileMatcher2 {

  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: (String) => Boolean) = {
    for (
      file <- filesHere
      if matcher(file.getName)
    ) yield file
  }

  def filesEnding(q: String) = filesMatching(_.endsWith(q))
  def filesContaining(q: String) = filesMatching(_.contains(q))
  def filesRegex(q: String) = filesMatching(_.matches(q))

}

val f = FileMatcher2

f.filesEnding(".scala").foreach(println)
println("-----------")
f.filesContaining("chap").foreach(println)
println("-----------")
f.filesRegex("^[c].*$").foreach(println)
