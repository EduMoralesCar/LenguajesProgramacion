package Semana05

/*
Ejercicio 2
Crear una función que reciba una lista y una lista de funciones,
y aplique todas las funciones a cada elemento.
*/

object FuncionesOrdenSuperior_MultiplesTransformaciones {
  def main(args: Array[String]): Unit = {

    // Definimos la lista y las funciones
    def aplicarTodo(lista: List[Int], funciones: List[Int => Int]): List[List[Int]] = {
      lista.map(x => funciones.map(f => f(x)))
    }

    val funciones = List(
      (x: Int) => x + 1,
      (x: Int) => x * 2,
      (x: Int) => x * x
    )
    val resultado = aplicarTodo(List(1, 2, 3), funciones)
    println(resultado)
  }

}
