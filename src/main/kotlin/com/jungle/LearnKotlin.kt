fun main() {
    println("Hello Kotlin")
    var a = 10
    a *= 10
    println("a = $a")

    for (i in 0..10){
        print(i)
    }
    println()
    for (i in 0..10 step 2){
        print(i)
    }
    println()

    for ( i in 0 until 10){
        print(i)
    }
for ( i in 10 downTo  1){
    println(i)
}


}