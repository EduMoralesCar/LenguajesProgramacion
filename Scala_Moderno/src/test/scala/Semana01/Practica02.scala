package Semana01

object Practica02 {
  def main(args: Array[String]): Unit = {
    print("Ingrese un numero:")
    val input = scala.io.StdIn.readLine()
    val resultado: Int = cuadrado(input)
    println(s"El cuadrado de $input es: $resultado")
  }

  def cuadrado(x: String): Int = {
      val numero = x.toInt // Convertir el String a Int
      numero * numero // Calcular el cuadrado

  }
}