fun main(args: Array<String>) {
    // MAD-105 Control Structures Assignment due 24-Jan-2022

    var Temperature: Float = 98.toFloat()
    var Temp: Int

    println ("Will loop until Temperature is 999")
    Temp = Temperature.toInt();

    while ( Temp != 999) {
    print ("Enter a Temperature in Farenheit: ")
    Temperature = readLine()!!.toFloat();

        Temp = Temperature.toInt();
    if (Temperature < 97.5)
        println("Temperature is cold")
    else if (Temperature <= 99.5)
        println("Temperature is normal")
    else if (Temperature > 99.5)
        println("Temperature is hot")
    }
        println("Program arguments: ${args.joinToString()}")
}