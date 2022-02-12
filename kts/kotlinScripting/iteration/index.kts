val names = listOf("tom", "jerry", "spike")
for (index in names.indices) {
    println("${names.get(index)} is $index")
}

for ((index, name) in names.withIndex()) {
    println("$index, $name")
}