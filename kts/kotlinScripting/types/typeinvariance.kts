open class Fruit
class Banana: Fruit()
class Orange: Fruit()

fun receiveFruits(fruits: Array<Fruit>) {
    println(fruits.size)
}

fun receiveFruits2(fruits: List<Fruit>) {
    println(fruits.size)
}

// val bananas: Array<Banana> = arrayOf()
// receiveFruits(bananas)

val bananas: List<Banana> =listOf()
receiveFruits2(bananas)