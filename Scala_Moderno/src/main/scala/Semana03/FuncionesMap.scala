package Semana03

object FuncionesMap {
  val lista1 = Map(1 -> "Tom", 2 -> "Max", 3 -> "Jhon");
  val lista2 = Map(4 -> "Sam", 5 -> "Will", 6 -> "Aldo");
  def main(args: Array[String]): Unit = {
    println("Primera Lista: " + lista1.map(x => x));
    println("Segunda Lista: " + lista1.map{case (key, value) => (key, value * 2)});
  }
}
