open class Fruit
class Banana: Fruit()
class Orange: Fruit()

fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
    for (i in 0 until from.size) {
        to[i] = from[i]
    }
}

val fruitsBasket1 = Array<Fruit>(3) {_ -> Fruit()}
val fruitsBasket2 = Array<Banana>(3) {_ -> Banana()}
copyFromTo(fruitsBasket2, fruitsBasket1)