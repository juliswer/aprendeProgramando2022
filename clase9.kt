class Animal {
    var raza: String = "";
    var colorOjos : String = "";
    var edad: Int = 0;
    var cantidadPatas : Int = 0;
    var peligroExtincion : Boolean = false;
    fun comer() {
        println("$raza esta comiendo");
    }
    fun dormir() {
        println("$raza esta durmiendo");
    }
}

class Lamp {

    // property (data member)
    public var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }
}

fun main(args: Array<String>) {
    var animal = Animal()
    animal.raza = "perro"
    val l1 = Lamp() // create l1 object of Lamp class
    if(2 > 1) {
        l1.turnOn();
    }
    println(l1.isOn);
    val l2 = Lamp() // create l2 object of Lamp class
}