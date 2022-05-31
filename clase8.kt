fun main(args: Array<String>) {
    var listaMeses = mutableListOf("enero", "marzo", "febrero")
    listaMeses.add("Junio")
    listaMeses.add(2, "Noviembre")
    println(listaMeses)
    for(i in 1..10) {
        if(i !== 5) {
            println(i)
        } else if(i === 5) {
            println("pasaste por el 5")
        }
    }

    for(i in 1..10 step 2) println(i)

    for (letra in 'A'..'Z') print(letra)

}