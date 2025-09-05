package Semana03

object Example02 {
  // Ejemplo de una función que recibe dos parámetros y retorna un valor
  def main(args: Array[String]): Unit = {
    println("la suma Total: " + suma(5,7));
  }

  //Funcion de Suma
  def suma(a: Int, b: Int): Int = {
    var sumaTotal: Int = 0
    sumaTotal = a + b
    return sumaTotal
  }
}
