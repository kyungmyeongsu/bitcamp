// 메서드 - 파라미터 I
package ex3

plus = { a, b ->
    a + b
}



sum = plus(100, 200)
println sum

sum = plus 101, 201
println sum

println plus([100, 200])
