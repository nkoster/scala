import scala.collection.mutable.HashMap

val treasureMap = new HashMap[Int, String]

treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find X on the ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
