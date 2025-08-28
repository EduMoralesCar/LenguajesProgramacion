package Semana01

object Operaciones {
  def main(args: Array[String]): Unit = {
    // Llamada a la función cuadrado
    val resu : Int = cuadrado(5);
    println(s"El cuadrado de 5 es: $resu")

    // Llamada a la función potencia
    val potenciaResu: Int = potencia(2, 3)
    println(s"2 elevado a la 3 es: $potenciaResu")
  }

  def cuadrado(x: Int): Int = {
    x * x
  }
  def potencia(base: Int, exponente: Int): Int = {
    if (exponente == 0) 1
    else base * potencia(base, exponente - 1)
  }
}
