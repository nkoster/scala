class WorldlyGreeter(greeting: String) {
  def greet() = {
    val worldlyGreeting = WorldlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}

object WorldlyGreeter {
  def worldify(s: String) = s + ", world!"
}
