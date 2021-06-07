

object A12_Monad_Stream_Dim extends App {

  
  //1. Monad
  val list1 = List(1,2,3,4)
  val list2 = List(5,6,7,8)
  
  val a = list1.flatMap{
    x=> list2.map{
      y =>x+y
    }
  }
  println(a)

  //2. Streams
  
  //normal list
  val l = List(1,2,3,4)
  println(l)
  val l1 = 1::2::3::4::Nil
  println(l1)
  
  //stream list
  val l2 = 1#::2#::3#::4#::Stream.empty
  println(l2)
  l2.take(2).print()
  
  println()
  
  l2.take(5).print()
  
  
  //another way stream list
  println("Another ways")
  val l3 = Stream(1,2,3,4)
  print(l3)
  l3.take(5).print()

  
  
  //3. ofDim
  println("my of Dim example")
  val myArr = Array.ofDim[Int](2,2)
  println(myArr)
  
  myArr(0)(0) = 2
  myArr(0)(1) = 3
  myArr(1)(0) = 5
  myArr(1)(1) = 6
  println(myArr(0)(1))
}