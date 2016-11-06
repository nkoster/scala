import java.io.{FileReader, IOException}

val file = new FileReader("input.txt")

try {
  // use the file
} finally {
  file.close()
}
