val oneToFive: IntRange = 1..5
val aToE: CharRange = 'a'..'e'
val seekHelp: ClosedRange<String> = "hell".."help"

println(oneToFive)
println(aToE)
println(seekHelp.contains("helm"))
println(seekHelp.contains("helq"))

for (i in 1..5) {print("$i, ")}
for (ch in aToE) {print(ch)}
// for (word in seekHelp) {print($word, )} //error ClosedRange에는 iterator() 가 없음