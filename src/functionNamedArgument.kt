fun fullName (firstName:String, midleName:String, lastName:String){
    println("Hai $firstName $midleName $lastName")
}
fun school (firstWord:String,midleWord:String,lastWord:String){
    println("Lets Go To $firstWord $midleWord $lastWord")
}

fun main() {
    fullName(
        firstName = "Putri",
        lastName = "Widiastuti",
        midleName = "Elsa"
    )
    school(
        firstWord = "SMAN",
        midleWord = "3",
        lastWord = "REMBANG"

    )

    fullName("Putri", "Elsa", "Widiastuti")
    school("SMAN", "3", "REMBANG")
}