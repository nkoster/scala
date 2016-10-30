import scala.collection.mutable.HashSet

val jetSet = new HashSet[String]

jetSet += "Lear"
jetSet.+=("Boeing", "Airbus")

println(jetSet.contains("cessna"))
println(jetSet.contains("Airbus"))

val movieSet = ("Hitch", "Poltergeist", "Shrek")
println(movieSet)
println(movieSet.zipped)
