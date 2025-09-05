package Semana03

object FuncionesFilter {
  def main(args: Array[String]): Unit = {
    val listas = List(5,12,3,13)
    val resultado = listas.filter(_ < 10)
    println(resultado)
  }
}
