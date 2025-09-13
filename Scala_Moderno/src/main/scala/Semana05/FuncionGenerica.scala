package Semana05

import scala.reflect.ClassTag

/*
Ejercicio 4
Crear una función que filtre elementos de una lista según su tipo.
*/

object FuncionGenerica {
  def main(args: Array[String]): Unit = {
    def filtrarPorTipo[T: ClassTag](lista: List[Any]): List[T] = {
      lista.collect { case x: T => x }
    }

    val datos = List(1, "hola", 2.5, "mundo", 3)
    val soloStrings = filtrarPorTipo[String](datos)
    val soloInts = filtrarPorTipo[Int](datos)

    println("Tipo de Dato String: " + soloStrings) // List(hola, mundo)
    println("Tipos de Dato Int: " + soloInts) // List(1, 3)
  }
}
