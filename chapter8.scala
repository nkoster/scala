val someNumbers = List(-11,-10,-5,0,5,10)

println("verbose")
someNumbers.filter((x:Int) => x > 1).foreach((x:Int) => println(x))

println("shorter...")
someNumbers.filter((x) => x > 1).foreach((x:Int) => println(x))

println("shorter...")
someNumbers.filter((x) => x > 1).foreach((x) => println(x))

println("shorter...")
someNumbers.filter(x => x > 1).foreach(x => println(x))

println("shortest.")
someNumbers.filter(_ > 1).foreach(x => println(x))
