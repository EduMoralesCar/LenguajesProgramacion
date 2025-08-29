/*
Implementar map desde cero: crear una versión simple que aplique
una función a cada elemento de una lista.
*/

object Ejemplo01 {
  def cuadrado(x: Int): Int = {
    x * x
  }

  def main(args: Array[String]): Unit = {
    // Lista de enteros
    val lista = List(1, 2, 3, 4, 5)
    // Usamos map para invocar a cuadrado
    val resultado = lista.map(x => cuadrado(x))
    // Imprimimos el Resultado
    println(resultado)
  }
}
