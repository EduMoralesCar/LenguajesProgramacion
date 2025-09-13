package Semana05

/*
Ejercicio 3
Dado una lista de números, generar pares (x, x+1).
*/

object FlatMap_GenerarCombinaciones {
  def main(args: Array[String]): Unit = {
    val lista = List(1, 2, 3)
    val resultado = lista.flatMap(x => List(x, x + 1))
    println(resultado) // List(1, 2, 2, 3, 3, 4)

  }
}
