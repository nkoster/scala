trait Friendly {
  def greet() = "Hi!"
}

class Dog extends Friendly {
  override def greet() = "Woof"
}

trait ExclamentoryGreet extends Friendly {
  override def greet() = super.greet() + "!"
}

val pet = new Dog
println(pet.greet())

val pup = new Dog with ExclamentoryGreet
println(pup.greet())
