val price = 12.25
val taxRate = 0.08
val ouput = "The amount $price after tax comes to $${price * (1+ taxRate)}"
val disclaimer = "The amount is in US$, that's right in \$only"
println(ouput)
println(disclaimer)