package Semana05

/*
Ejercicio 1
Componer tres funciones:
una que convierta texto a mayúsculas,
otra que lo recorte a 5 caracteres,
y otra que agregue un prefijo
*/

object ComposicionFuncional_MultiplesFunciones {

  def main(args: Array [String]): Unit = {
    // Definimos las funciones
    val mayus = (s: String) => s.toUpperCase
    val recorte = (s: String) => s.take(21)
    val prefijo = (s: String) => "Prefijo: " + s

    val compuesta = mayus andThen recorte andThen prefijo

    // Imprimimos el resultado
    println(compuesta("composicion funcional"))
  }
}
