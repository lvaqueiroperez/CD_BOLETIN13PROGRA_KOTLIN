fun main(){

    val obxS= Seleccion("Pepe","Perez", 1, 20)
    val obxX= Xogador(1,"aaaa","Marta","Lopez",1,20)
    val obxE = Entrenador("sss","Pedro","Fernandez",3,21)
    val obxM= Masaxista("grado",2,"Paco","Val",4,19)

    obxS.concentrarse()
    obxS.viajar()

    obxX.entrenar()
    obxX.jugarPartido()
    obxX.viajar()

    obxE.dirigirEntrenamiento()
    obxE.dirigirPartido()
    obxE.viajar()

    obxM.darMasaje()
    obxM.viajar()





}