/*
Implementar filter desde cero: retener solo los elementos mayores que un umbral dado.
*/

object Ejemplo02 {
  def miFilter(lista: List[Int], condi: Int): List[Int] = {
    val resultado = lista.filter(x => x > condi)
    resultado
  }

  def main(args: Array[String]): Unit = {
    val lista = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val x = miFilter(lista, 7)
    println(x)
  }
}
