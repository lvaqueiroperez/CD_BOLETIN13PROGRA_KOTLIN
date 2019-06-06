class Entrenador(var idFederacion:String, nombre:String, apellido:String, id:Int, edad:Int)
    : Seleccion(nombre,apellido,id,edad){


    fun dirigirPartido() {
        println("Entrenador dirige el partido")
    }

    fun dirigirEntrenamiento() {
        println("Entrenador dirige el entrenamiento")
    }

    override fun viajar() {
        println("viaja el entrenador")
    }
}