

object A10_DiamondProb extends App {
  
  
  println("strat")
  
  trait traitA{
    def name = println("This is grandparent trait")
  }
  
  trait traitB extends traitA{
    override def name = {
      println("B is a child of A")
      super.name
    }
    
  }
  
  trait traitC extends traitA{
    override def name = {
      println("C is a child of A")
      super.name
    }
  }
  
  class grandChild extends traitB with traitC{
    
  }
  
  new grandChild().name
  
  //object grandChild extends traitB with traitC
  //grandChild.name
  
  println("enddd")
  
}