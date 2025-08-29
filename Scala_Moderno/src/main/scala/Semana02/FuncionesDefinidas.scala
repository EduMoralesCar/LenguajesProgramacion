object FuncionesDefinidas {
  def suma(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    val resultado = suma(5, 7)
    println(s"La suma de 5 y 7 es: $resultado")
  }
}
