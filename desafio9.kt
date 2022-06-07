class Dog {
    var raza : String = "";
    var nombre : String = "";
    var colorDeOjos : String = "";

    fun IrAlBanio() {
        println("¡Soy un perro y estoy tirando la cadena!")
    }

    fun mostrarDatos() {
        println("Raza del perro: ${raza}")
        println("Nombre del perro: ${nombre}")
        println("Color de ojos: ${colorDeOjos}")
        // println("Mi nombre es $nombre, soy un $raza y mi color de ojos es $colorDeOjos")
    }
}

fun main(args: Array<String>) {
    var perro = Dog()
    perro.raza = "Collie"
    // println("Raza del perro: ${perro.raza}")
    perro.nombre = "Procer"
    // println("Nombre del perro: ${perro.nombre}")
    perro.colorDeOjos = "negro"
    // println("Color de ojos: ${perro.colorDeOjos}")
    perro.mostrarDatos()
    perro.IrAlBanio()
}