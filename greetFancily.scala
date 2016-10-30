class FancyGreeter(greeter: String) {
  def greet() = println(greeter)
}
val g = new FancyGreeter("Hello, World!")
g.greet()
