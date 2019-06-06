fun main(){

    /*
    En esta creación de objetos, podríamos omitir los parámetros "id" y "edad" porque ya están inicializados en la
     clase "Seleccion" en el constructor con un valor por defecto (como si fuera un Builder en Java)
     */
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