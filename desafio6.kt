fun main(args: Array<String>) {
    fun intervalo(numero: Int, max: Int, min: Int){
        if(numero in min..max) {
            print("El numero $numero esta entre $min y $max")
        } else {
            print("El numero $numero no se halla en el intervalo $min y $max")
        }
    }

    intervalo(4, 7, 1)

}