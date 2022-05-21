fun main(args: Array<String>) {
    val list : Array<String> = arrayOf("auto", "camion", "moto", "avion", "bicicleta")
    println("---- MAPPING DE ELEMENTOS ----")
    for ((index, value) in list.withIndex()) {
        println("The value is ${value.uppercase()} on the index $index")
    }
    println("---- AHORA CON NUMEROS ----")
    val numbersList : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for(num in numbersList[0]..numbersList.last()) {
        println("$num")
    }
    val result = numbersList.sum()
    println("---- SUMA DEL ARRAY ----")
    println("$result")
}