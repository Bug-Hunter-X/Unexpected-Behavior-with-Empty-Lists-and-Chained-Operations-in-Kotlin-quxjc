fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val list2 = emptyList<Int>()
    val result2 = list2.map { it * 2 }.filter { it > 5 } 
    println(result2) //Output: []

    val list3 = listOf(1,2,3)
    val result3 = list3.map{it*2}.filter {it >10}
    println(result3) // Output: []
}