fun main(args: Array<String>) {

    // 1st example

    val color = "rojo"

    if (color == "verde") {
        println("verde")
    } else if (color == "rojo") {
        println("rojo")
    } else if (color == "azul") (
        println("azul")
    ) else {
        println("ninguno de los de arriba")
    }

    // another example

    val n1 = 9;
    val n2 = 5;

    when {
        n1 > n2 -> print("$n1 es mayor que $n2")
        n1 < n2 -> println("$n2 es mayor que $n1")
        else -> print("Son iguales $n1 y $n2")
    }


    // another example

    fun testColor (colorSelected: String) {
        when(colorSelected.lowercase().trim()) {
            "rojo" -> print("es rojo")
            "verde" -> println("es verde")
            "azul" -> println("es azul")
            else -> print("ninguno de los anteriores")
        }
    }

    when(color) {
        "rojo" -> print("es rojo")
        "verde" -> println("es verde")
        "azul" -> println("es azul")
        else -> print("ninguno de los anteriores")
    }

    testColor("VERDE")

    /*fun testAprobado(nota: Number) {
        when {
            nota !in 1..10 -> print("La nota debe estar entre 1 y 10")
            nota >= 7 -> print("estas aprobado")
            nota in 4..6 -> print("recuperatorio")
            else -> print("Desaprobado")
        }
    }

    testAprobado(7)
    */
    val nota = 6

    when {
        nota !in 1..10 -> print("La nota debe estar entre 1 y 10")
        nota >= 7 -> print("estas aprobado")
        nota in 4..6 -> print("recuperatorio")
        else -> print("Desaprobado")
    }
}