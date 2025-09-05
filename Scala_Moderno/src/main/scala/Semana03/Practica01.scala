package Semana03

object Practica01 {
  // Función que convierte un texto a mayúsculas
  def toUpper(text: String): String = text.toUpperCase()

  // Función que elimina los espacios en blanco al inicio y al final del texto
  def trimText(text: String): String = text.trim()

  // Función que combina las dos funciones anteriores
  def composedFunction(text: String): String = trimText(toUpper(text))

  // Función principal para probar las funciones
  def main(args: Array[String]): Unit = {
    val original = "   semana 4 - funciones de orden superior   "
    val resultado = composedFunction(original)
    
    println(resultado) // Salida esperada: "HOLA MUNDO DESDE SCALA"
  }
}
