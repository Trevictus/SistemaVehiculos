class Automovil(val tipo: String, marca: String, modelo: String, capacidadCombustible:Int): Vehiculo(marca, modelo, capacidadCombustible){

    override fun calcularAutonomia(): Int{
        return capacidadCombustible * 10 + 100
    }
}