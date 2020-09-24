package ControlFlow

fun main() {
    //doWhile Looping
    var angka = 0
    do {
        println("Succes")
        angka++
    }while (angka < 5)

    //While looping
    var number = 7
    while (number <= 10){
        println("Sukses")
        number++
    }
    //For Loop
    //Type 1
    for (data in 1..10)
        println("Sukses")

    //Type 2
    for (number in 1..10)
        print(number)


}
