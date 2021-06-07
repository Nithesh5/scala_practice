

object Null_7 extends App {
  
  //1. Null,null
  def tryIt(thing:Null){
    println("It acceps only nulls")
  }
  tryIt(null) //type mismatch;found : Int(6)required: Null
  
  //2. Nil
  val c = Nil
  println(c)
  
  //3. Nothing
  def nothing = {
    throw new Exception
  }
  //nothing

  //4. None
  def none() = {
    println("returning None")
    None
  }
  
  println(none)
  
  //4. Option
  def getStringMaybe(num:Int) : Option[String] = {
    if(num>0) Some("A Positive Number")
    else None
  }
  
  def printResult(num:Int) = {
    getStringMaybe(num) match {
      case Some(str) => println(str)
      case None => println("No string")
    }
  }
  printResult(2)
  printResult(-2)
  
  //5. Unit
  def sideEffect(){
    println("println returns unit")
  }
  sideEffect
  
}