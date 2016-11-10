val someNumbers = List(-11,-10,-5,0,5,10)

println("verbose")
someNumbers.filter((x:Int) => x > 1).foreach((x:Int) => println(x))

println("shorter...")
someNumbers.filter((x) => x > 1).foreach((x:Int) => println(x))

println("shorter...")
someNumbers.filter((x) => x > 1).foreach((x) => println(x))

println("shorter...")
someNumbers.filter(x => x > 1).foreach(x => println(x))

println("shorter...")
someNumbers.filter(_ > 1).foreach(println _)

println("shortest.")
someNumbers.filter(_ > 1).foreach(println)

val f = (_: Int) + (_: Int)
f(5, 10)

def sum (a: Int, b: Int, c: Int) = a + b +c
val a = sum _

println(a(1,2,3))
println(a.apply(1,2,3))

val b = a(1, _:Int, 3)
println(b(3) + " " + b(5))

println("------------------")
def echo (args: String*) = args.foreach(println)
echo ("Hi!", "Dude")
