package Semana05

/*
Ejercicio 6
Dado un array de personas, obtener los nombres de los mayores de 30 que viven en "Lima".
*/

case class Persona(nombre: String, edad: Int, ciudad: String)

object TransformacionEstructurasComplejas {
  def main(args: Array[String]): Unit = {
    val personas = List(
      Persona("Ana", 25, "Lima"),
      Persona("Luis", 32, "Lima"),
      Persona("Maria", 35, "Cusco"),
      Persona("Pedro", 28, "Lima")
    )

    val resultado = personas
      .filter(p => p.edad > 30 && p.ciudad == "Lima")
      .map(_.nombre)

    println(resultado) // List("Luis")

  }
}
