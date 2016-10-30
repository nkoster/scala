val oneTwo = List(1, 2)
val threeFour = List (3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated")
println("thus, " + oneTwoThreeFour + " is a new list")
val twoThree = List(2, 3)
//val oneTwoThree = 1 :: twoThree
val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)
val thrill = "Will" :: "fill" :: "until" :: Nil
println(thrill(2))
println(thrill.count(s => s.length == 4))
println(thrill.drop(2))
println(thrill.dropRight(2))
println(thrill.exists(s => s == "until"))
println(thrill.filter(s => s.length == 4))
println(thrill.forall(s => s.endsWith("l")))
println(thrill.foreach(s => print(s)))
println(thrill.foreach(print)) // short of prev
println(thrill.head) // first
println(thrill.init) // all but last
println(thrill.isEmpty)
println(thrill.last)
println(thrill.length)
println(thrill.map(s => s + "y"))
println(thrill.map(_ + "y")) // short of prev
println(thrill.remove(s => s.length == 4))
println(thrill.reverse)
println(thrill.sort((s, t) => s.charAt(0) < t.charAt(0))) // sort alfa
println(thrill.sort((s, t) => s.charAt(0).toLowerCase < t.charAt(0).toLowerCase)) // sort alfa
println(thrill.sort((s, t) => s.charAt(0) < t.charAt(0))) // sort alfa
println(thrill.tail)
