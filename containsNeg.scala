def containsNegLong(nums: List[Int]): Boolean = {
  var exists = false
  for (
    num <- nums
  ) if (num < 0)
    exists = true
  exists
}

def containsNegShort(nums: List[Int]) = nums.exists(_ < 0)

println(containsNegShort(List(1, 2, 3, 4)))
println(containsNegShort(List(1, 2, -3, 4)))
