fun main(args: Array<String>) {
    // while bucle con contadores (i)
    var i = 1;
    while(i <= 10) {
        println(i)
        println("hello world")
        i++;
    }
    // while bucle con con acumuladores (acum) y contadores (i)
    var acum = 0
    var z = 1
    while(z <= 10) {
        acum += z
        z++
    }
    println("Resultado de acum: $acum")
    // do-while bucle
    var h = 9
    do {
        println(h)
        h++;
    } while(h < 3)
}