object Demostracion:
  def funcion(using size: Int) = 
    def getMap(using size: Int): Map[String, Int] = Map("Alice" -> size)
    getMap("Alice")


object Main:

  given size: Int = 42 ;

  def main = 
    Demostracion.funcion

object Main2:
 
  given size: Int = 22 ;

  def main = 
    Demostracion.funcion
  
  def nested = 
    Main.main

Main.main
Main2.main
Main2.nested
