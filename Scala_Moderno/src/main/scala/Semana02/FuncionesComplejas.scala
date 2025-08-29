case class Persona(nombre: String, edad: Int, ciudad: String)

object FuncionesComplejas {
  val personas = List(
    Persona("Ana", 34, "Barcelona"),
    Persona("Luis", 28, "Lima"),
    Persona("Carlos", 40, "Madrid")
  )

  def main(args: Array[String]): Unit = {
    val resultado = personas
      .filter(p => p.edad > 30 && p.ciudad == "Madrid")
      .map(_.nombre)

    println(resultado) // List("Carlos")
  }
}
