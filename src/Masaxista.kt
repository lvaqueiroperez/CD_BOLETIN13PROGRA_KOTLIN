class Masaxista(var titulacion:String, var anosExperiencia:Int,nombre:String,apellido:String,id:Int,edad:Int)
    : Seleccion(nombre,apellido,id,edad){

    fun darMasaje() {
        println("Masajista da masaje")
    }

    override fun viajar() {
        println("viaja masajista")
    }

    override fun toString(): String {
        return "Masaxista(titulacion='$titulacion', anosExperiencia=$anosExperiencia)"
    }


}