package Semana03

object Practica02 {
  // Función que calcula el sueldo bruto
  def sueldoBruto(horas: Double, tarifa: Double): Double = horas * tarifa

  // Función que calcula el descuento de Essalud
  def descuentoEssalud(bruto: Double): Double = bruto * 0.09

  // Función que calcula el descuento de AFP
  def descuentoAFP(bruto: Double): Double = bruto * 0.10

  // Función que calcula el descuento total
  def descuentoTotal(bruto: Double): Double = descuentoEssalud(bruto) + descuentoAFP(bruto)

  // Función que calcula el sueldo neto
  def sueldoNeto(horas: Double, tarifa: Double): Double = {
    val bruto = sueldoBruto(horas, tarifa)
    bruto - descuentoTotal(bruto)
  }

  // Función principal para probar las funciones
  def main(args: Array[String]): Unit = {
    val horasTrabajadas = 160
    val tarifaHoraria = 25
    val neto = sueldoNeto(horasTrabajadas, tarifaHoraria)
    
    println(f"Sueldo neto: S/ $neto%.2f") // Salida esperada: Sueldo neto: S/ 3240.00
  }
}
