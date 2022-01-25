fun main() {
    var low = 97.5
    var high = 99.5
    println("Enter a temperature, in Fahrenheit, between 92.0 and 104.0")

    var tempInput = readLine()!!.toFloat()
    while(92.0 > tempInput || tempInput > 104.0){
        println("That is a very dangerous temperature! Try again!, between 92.0 and 104.0")
        tempInput = readLine()!!.toFloat()
    }
    if(tempInput <= low) {
        println("That body temperature is low!")
    }
    else if(tempInput >= high){
            println("That body temperature is high!")
    }
    else{
        println("That body temperature is normal!")
    }
}