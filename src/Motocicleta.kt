class Motocicleta(val cilindrada: Int, marca: String, modelo: String, capacidadCombustible: Int): Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int{
        val litro:Int = 0
        return litro * 10 - 40
    }
}