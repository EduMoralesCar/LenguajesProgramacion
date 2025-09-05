package Semana03

object CombinacionOperaciones {
  def main(args: Array[String]): Unit = {
    // Definicion de Variables
    val a: Int = 5;
    val b: Int = 7;

    // Llamado de Funciones
    println("Suma: " + suma(a, b));
    println("Resta: " + resta(a, b));
  }

  // Funcion Suma
  def suma(a: Int, b: Int): Int = {
    var suma: Int = 0
    suma = a + b
    return suma
  }

  // Funcion Resta
  def resta(a: Int, b: Int): Int = {
    var resta: Int = 0
    resta = b - a
    return resta
  }

}
