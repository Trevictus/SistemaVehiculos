open class Vehiculo(private val marca : String, private val modelo: String, private val capacidadCombustible: Int) {

    fun mostrarInformacion(){
        println("Marca = $marca. Modelo = $modelo. Capacidad de combustible = $capacidadCombustible.")
    }

    open fun calcularAutonomia(): Int{
        val litro:Int = 0
        return litro * 10
    }
}