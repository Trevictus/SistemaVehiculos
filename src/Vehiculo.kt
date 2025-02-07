open class Vehiculo(private val marca : String, private val modelo: String, val capacidadCombustible: Int) {

    fun mostrarInformacion(){
        println("Marca = $marca. Modelo = $modelo. Capacidad de combustible = $capacidadCombustible.")
    }

    open fun calcularAutonomia(): Int{
        return capacidadCombustible * 10
    }
}