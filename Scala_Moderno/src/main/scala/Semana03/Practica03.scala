package Semana03

object Practica03 {
  // Definición de una clase para representar a un empleado
  case class Empleado(nombre: String, horas: Double, tarifa: Double)

  // Definición de una clase para representar el resultado del cálculo
  case class Resultado(nombre: String, bruto: Double, essalud: Double, afp: Double, descuentoTotal: Double, neto: Double)

  // Función que calcula todos los valores para un empleado
  def calcularSueldo(e: Empleado): Resultado = {
    val bruto = e.horas * e.tarifa
    val essalud = bruto * 0.09
    val afp = bruto * 0.10
    val descuentoTotal = essalud + afp
    val neto = bruto - descuentoTotal
    Resultado(e.nombre, bruto, essalud, afp, descuentoTotal, neto)
  }

  // Función principal para probar las funciones
  def main(args: Array[String]): Unit = {
    val empleados = List(
      Empleado("Ana", 160, 25),
      Empleado("Luis", 180, 30),
      Empleado("Carlos", 150, 28)
    )

    // Usando map para aplicar la función a cada empleado
    val resultados = empleados.map(calcularSueldo)

    // Imprimir los resultados
    resultados.foreach { r =>
      println(s"Empleado: ${r.nombre}")
      println(f"  Sueldo Bruto: S/ ${r.bruto}%.2f")
      println(f"  Descuento ESSALUD: S/ ${r.essalud}%.2f")
      println(f"  Descuento AFP: S/ ${r.afp}%.2f")
      println(f"  Descuento Total: S/ ${r.descuentoTotal}%.2f")
      println(f"  Sueldo Neto: S/ ${r.neto}%.2f")
      println("------------------------------------------------")
    }
  }

}
