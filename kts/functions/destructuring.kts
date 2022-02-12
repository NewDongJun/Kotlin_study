fun getFullName() = Triple("jhon", "quincy", "adams")

// val result = getFullName()
// val first = result.first
// val middle = result.second
// val last = result.third
// println("$first, $middle, $last")

val (first, _, last) = getFullName()
println("$first, $last")