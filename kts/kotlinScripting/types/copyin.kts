open class Fruit
class Banana: Fruit()
class Orange: Fruit()

val things = Array<Any>(3) {_-> Fruit()}
val bananaBasket = Array<Banana>(3) {_ -> Banana()}

fun copyFromTo(from: Array<out Fruit>, to: Array<in Fruit>) {
    for (i in 0 until from.size) {
        to[i] = from[i]
    }
}

copyFromTo(bananaBasket, things)