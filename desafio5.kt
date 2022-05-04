fun main(args: Array<String>) {
    var value1 = 0;
    while(value1 >= 0 && value1 < 5) {
        value1++;
        if(value1 % 2 == 0) {
            println("$value1 es par")
        } else {
            println("$value1 no es par")
        }
    }
}