def containsOddLong(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num % 2 == 1)
      exists = true
  exists
}

println(containsOddLong(List(2, 4, 8, 9)))

def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

println(containsOdd(List(2, 3, 4, 6)))
