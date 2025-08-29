case class Nombres(nombre: String)

object Ejemplo03 {
  val nombres = List(
    Nombres("ana"),
    Nombres("pedro"),
    Nombres("alberto"),
    Nombres("sofia"),
    Nombres("antonio")
  )

  def main(args: Array[String]): Unit = {
    val NombreMayusculaConA = nombres
      .filter(p => p.nombre.toLowerCase.startsWith("a"))
      .map(p => p.nombre.toUpperCase)

    println(NombreMayusculaConA) // List("ANA", "ALBERTO", "ANTONIO")
  }
}
