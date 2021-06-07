

object A11_ExceptionHand extends App {
  try{
    5/0
  }
  catch{
    case e : Exception => println("please give a deno other than 0")
    println(e)
  }
  finally {
    println("I will run always")
  }
}