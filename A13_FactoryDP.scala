

object A13_FactoryDP extends App {
  trait Computer {
    def ram:String
    def hdd:String
    def cpu:String
    def machinetype:String
  }
  
  case class PC(ram:String,hdd:String,cpu:String,machinetype:String) extends Computer
  case class LAPTOP(ram:String,hdd:String,cpu:String,machinetype:String) extends Computer
  
  object ComputerFactory{
    def apply(compType:String,ram:String,hdd:String,cpu:String) = compType match {
      case "PC" => PC(ram,hdd,cpu,"Flexible")
      case "LAPTOP" => LAPTOP(ram,hdd,cpu,"Not Flexible")
    }
  }
  
  val l1 = ComputerFactory("PC","8","1TB","1.6")
  println(l1)
  
  val l2 = ComputerFactory("LAPTOP","8","1TB","1.6")
  println(l2)
  
  
  
  //How to remove duplicates from an array or list
  val a = Array(1,2,2,3,4,4)
  //case1
  println(a.toSet.toArray.mkString(","))
  //case2
  println(a.distinct.mkString(","))
  
  val b = List(1,2,2,3,4,4)
  //case1
  println(b.toSet.toList)
  //case2
  println(b.distinct)
  
}