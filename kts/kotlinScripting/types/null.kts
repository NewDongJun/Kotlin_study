// fun nickName(name: String?): String {
//     if (name== "William") {
//         return "Bill"
//     }

//     return name?.reversed()?.uppercase() ?: "Joker"
// }

fun nickName(name: String?) = when (name) {
    "William" -> "Bill"
    null -> "Joker"
    else -> name.reversed().uppercase()
}


println(nickName("William"))
println(nickName("A my"))
println(nickName(null))