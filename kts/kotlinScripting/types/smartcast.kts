class Animal(val age: Int){
    // override operator fun equals(other: Any?): Boolean{
    //     // if 에서 앞부분에 먼저 type 체크를 해서 age를 그냥 쓸 수 있음
    //     return if (other is Animal) age == other.age else false
    // }
    override operator fun equals(other: Any?) = other is Animal && age == other.age
}

val a = Animal(2)
val b = Animal(2)
val c = Animal(3)
println(a == b)
println(c == b)