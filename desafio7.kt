fun main(args: Array<String>) {
    val peopleName : Array<String> = arrayOf("Juan", "Laura", "Mateo", "Clara")
    fun getNames(names : Array<String>) {
        println("---- ALL NAMES ON THE ARRAY ----")
        for (name in names) {
            println("$name")
        }
    }
    getNames(peopleName)

    println("---- SPECIFIC NAMES ----")
    println(peopleName[0].uppercase());
    println(peopleName[1].lowercase());
    println("${peopleName[2]} y ${peopleName[3]}")

}