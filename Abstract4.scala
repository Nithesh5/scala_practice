

object Abstract4 extends App {
  abstract class Animal{
    def eat 
    def oldMethod = println("Old Method")
  }
  
  //new Animal = class Animal is abstract; cannot be instantiated
   
  class Dog extends Animal{
    val creatureType = "Canine"
    def eat = println("Eat Flush")
    override def oldMethod = println("New Method")
  }
  
  val cat = new Dog()
  cat.eat
  print(cat.creatureType)
  
}