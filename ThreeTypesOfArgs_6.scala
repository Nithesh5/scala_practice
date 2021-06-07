
//extends App
object ThreeTypesOfArgs_6 {
  
  def main(args:Array[String]) {
    println("remove this boiler code with App")
    
    
    def add(num:Int , increamentBy : Int) = {
      println("add is=", num+increamentBy)
    }
    add(3,1)
    
    
    //default args
    def defaultAdd(num:Int = 3 , increamentBy : Int =4) = {
      println("defaultAdd is=", num+increamentBy)
    }
    defaultAdd(4)
    
    //named args
    def namedAdd(num:Int = 3 , increamentBy : Int =4) = {
      println("namedAdd is=", num+increamentBy)
    }
    namedAdd(increamentBy=90)
    
    //named args
    def variableLengthArg(name : String*) = {
      for(i<-name){
        println("variableLengthArg is=", i)        
      }
    }
    variableLengthArg("How","are","you")
    
    
    
  }  
}