import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
  // use and close here
} catch {
  case ex: FileNotFoundException => println("is niet daar")
  case ex: IOException => // handle other I/O error
}
