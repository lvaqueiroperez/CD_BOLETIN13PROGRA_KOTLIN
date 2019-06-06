class Xogador (  var dorsal:Int,  var emarcacion:String, nombre:String, apellido:String, id:Int, edad:Int)
    : Seleccion(nombre,apellido,id,edad){

     fun jugarPartido() {
        println("Juega el jugador")
    }


    fun entrenar() {
        println("Entrena el jugador")
    }

    override fun viajar() {
        println("viaja el jugador")
    }
}



