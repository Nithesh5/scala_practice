

object Trait5 extends App {
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

  val d = new Dog
  d.eat
  
  trait Carnivals {
    def preferedMeal
    //def multiTrait = print("Carnivals")
  }
  trait ColdBlooded {
    //def multiTrait = print("ColdBlooded")
  }
  
  //class Crocodile inherits conflicting members:method multiTrait in trait Carnivals of type ⇒ Unit andmethod multiTrait in trait ColdBlooded of type ⇒ Unit (Note: this can be resolved by declaring an override in class Crocodile.)
  class Crocodile extends Animal with Carnivals with ColdBlooded {
    val creature = "Crocodile"
    def eat = println("Eat crocodile") //override def eat = println("Eat crocodile")
    def preferedMeal = print("Meat prefered")
  }
  
  val crocodile = new Crocodile
  crocodile.eat
  crocodile.preferedMeal
  
}