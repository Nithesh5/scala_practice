

object ScalaPrac3_Inheritance extends App {
  
  
  class Animal{
    def eat = println("Animals eat a lot")
  }
  
  class Cat extends Animal{
    def preferedMeal = println("Milk")
  }
  
  val cat = new Cat()
  cat.eat
  cat.preferedMeal
  
}