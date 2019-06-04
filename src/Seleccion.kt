/*
Pasamos el Boletin 13 de progra (Java) a Kotlin
 */
/*
Si inicializamos un parámetro de la siguiente manera, será como el valor por defecto y no haría falta ponerlo
en el constructor, como un builder. Los parámetros por defecto se suelen poner al final
Poniéndolos de esta forma, lo que esté entre paréntesis será los parámetros que recibe el constructor y el constructor
en sí, además de los atributos de la clase
 */
open class Seleccion ( var nombre:String, var apellido:String, var id:Int=0, var edad:Int=0 ) {



}