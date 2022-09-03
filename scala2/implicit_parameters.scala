object Demostracion{
  def funcion(implicit size: Int) = {
    def getMap(implicit size: Int): Map[String, Int] = Map("Alice" -> size)
    getMap(size)("Alice")
  };  
}


object Main{
 
  implicit var size: Int = 42 ;

  def main = {
    Demostracion.funcion
  }
}

object Main2{
 
  implicit var size: Int = 22 ;

  def main = {
    Demostracion.funcion
  }
  
  def nested = {
    Main.main
  }
}

Main.main
Main2.main
Main2.nested
