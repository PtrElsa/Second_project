fun String.hello() : String = "Assalamualaikum $this"
fun String.printHello() : Unit = println("Assalamualaikum $this")

fun String.hai() : String = "Hai $this"
fun String.printHai() : Unit = println("Hai $this")

fun main() {
    val name = "Elsa"
    println(name.hello())

    name.printHello()
    "Widiastuti".printHello()

    val friend = "Sofi"
    println(name.hai())

    friend.printHai()
    "Ummu Salamah".printHai()

}