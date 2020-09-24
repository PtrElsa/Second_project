package ControlFlow

//Control Flow Branching
fun main() {
    val nilaiUjian = 90
    if (nilaiUjian > 80) {
        println("Good Job")

        //Else Expression
    } else {
        println("Coba Lagi Tahun Depan")
    }

    //Else IF Expression
    val nilai = 90

    if (nilai > 90){
        println("MasyaAllah")
    }else if (nilai > 75){
        println("Good Job")
    }else if (nilai > 60){
        println("Tetap Semangat")
    }else{
        println("jangan sedih, tetap berusaha")
    }
    //When
    val sekolah = "SD"
    when(sekolah){
        "SD" -> print("Akreditasi A")
        "SMP" -> print("Akreditasi B")
        "SMA" -> print("Akreditasi c")

        else -> print("Tidak Ada Akreditasi")
    }

}