package Semana03

object Funciones {
  // Funcion principal
  def main(args: Array[String]): Unit = {
    println("Valor Original: " + (25))
    println("Valor Modificado: " + Operacion(25))
  }
  
  // Funcion de tipo Int que recibe un parametro x de tipo Int y retorna un Int
  def Operacion(x: Int): Int = x + 1
}
