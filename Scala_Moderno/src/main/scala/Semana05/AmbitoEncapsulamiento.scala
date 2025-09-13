package Semana05

/*
Ejercicio 5
Crear una función que defina una variable local y otra global,
y mostrar cómo se accede a cada una.
*/

object AmbitoEncapsulamiento {
  def main(args: Array[String]): Unit = {
    val global = "Soy global"

    def mostrar(): Unit = {
      val local = "Soy local"
      println(global)
      println(local)
    }

    mostrar()
    // println(local) // Error: fuera de ámbito

  }
}
