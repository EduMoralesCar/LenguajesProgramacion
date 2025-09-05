package Semana03

case object Example01 {
//  funcionalidad de LIST, MAP y FILTER
  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "Jhon");

  def main(args: Array[String]): Unit = {
    println(list.map(x => x / 0.2)); // Map: Aplica una funcion a cada elemento
    println()
    println(list.map(x => x * 2));
    println()
    println(list.map(x => "hi" * x)); // Repite la cadena x veces
    println(list.map(x => "hi" + x)); // Concatena la cadena con el numero
    println()
    println(mymap.view.mapValues(x => "hi " + x).toMap); // mapValues: Aplica una funcion a cada valor del mapa
    println()
    println("hello".map(_.toUpper)); // Convertimos a Mayuscula
    println()
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten); // flatten: combina las listas
    println()
    println(list.flatMap(x => List(x, x + 1))) // flatMap: aplica una funcion que devuelve una lista y luego combina las listas
    println()
    println(list.filter(x => x%2==0)) // Obtener valores Pares
    println(list.filter(x => x%2!=0)) // Obtener valores Impares
  }

}
