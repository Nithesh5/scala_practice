


object YieldAndGuard extends App {
  
  //yield
  val a = for(i<- 1 to 10) yield {
    i*i
  }
  
  println(a)
  
  //yield
  val b = for(i<- 1 to 10) yield {
    if(i%2==0)
      i*i
  }
  println(b)
  
  //how to resolve 
  //by using if guard
  val c = for(i<- 1 to 10; if i%2==0) yield {
      i*i
  }
  println(c)
  
  //pattern guard ex1
  def checkSign(x:Int) :String = {
    x match {
      case a if a<0 => s"$a is a negative no"
      case b if b>0 => s"$b is a positive no"
      case c if c==0 => s"$c is neither a positive or negative no"
    }
  }
  
  println(checkSign(0))
  println(checkSign(22))
  println(checkSign(-22))
  
  //pattern guard ex2
  def checkSign1(x:Option[Int]) = {
    x match {
      case Some(i) if(i%2==0) => println("even no",i)
      case None => println("none")
      case _ => println("something else")
    }
  }
 
  checkSign1(Option(0))  
  checkSign1(Option(3))
  checkSign1(Option(-11))
  checkSign1(None)

  //for comprehension
  
  for(i<- 1 to 5)
    print(i*i)
  
  println()
  println("scala convert above loop to below loop internally")
  
  (1 to 5).foreach(i=>print(i*i))  
  
  //==
  println()
  val a1 = new String("nithesh")
  val b1 = new String("nithesh")
  println(a1==b1)
  
  
  
  //strict val vs lazy val
  println("strict val example")
  val r = 10
  val area = {
    println("calculating area of circle")
    3.14*r*r
  }
  println(area)
  
  println("lazy val example")
  lazy val area1 = {
    println("calculating area of circle")
    3.14*r*r
  }
  area1
  println(area1)
  
  //scala . apply
  
  println("scala . apply example")
  
  object Person {
    def apply(name : String, age : Int) = {
      println(s"$name is $age years old")
    }
  }
  Person.apply("nithesh",26)
  Person("pranay",27)
  
  
}