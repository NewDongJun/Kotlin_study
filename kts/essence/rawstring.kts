val name = "Eve"

val memo = """Dear $name, a quick reminder
qmfkqmffk
tiffktiffk"""
println(memo)

fun createMemoFor(name: String): String{
    if (name == "Eve"){
        val memo = """Dear $name, a quick reminder
        qmfkqmffk
        tiffktiffk"""
        return memo
    }
    return ""
}
println(createMemoFor(name))

fun createMemoFor2(name: String): String{
    if (name == "Eve"){
        val memo = """Dear $name, a quick reminder
        |qmfkqmffk
        |tiffktiffk"""
        return memo.trimMargin()
    }
    return ""
}
println(createMemoFor2(name))