

object AssignmentAnswers extends App {
  
  //question1
  println("Enter Number Of digits")
  val num = readInt()
  println("Enter Numbers")
  val inputData = readLine()
  println("Entered Numbers are"+inputData)
  var arrayOfCust = inputData.split(" ")          //> arrayOfCust  : Array[String] = Array(10, 20, 16, 25, 30, 40, 36)
	val strArrayToIntList = arrayOfCust.map(_.toInt).toList
	
  def findPerfectSquares(list:List[Int]) = {
		
    var count : Int =0;
    for(i <- list){
      if(scala.math.sqrt(i) % 1 ==0)
  		{
  			count = count + 1
  		}
    }
    count
  }                                               //> findPerfectSquares: (number: Int)Int

	println("No of Perfect Squares Are " + findPerfectSquares(strArrayToIntList))
  
	//question 2
	
  println("Enter Number Of digits and threshold")
  val noAndThreshold = readLine()
  val threshold = noAndThreshold.split(" ")(1).toInt 
  
  println("Enter Numbers")
  val inputData2 = readLine()
  
  val inputDataArray2 = inputData2.split(" ")
                                                  //> inputDataArray2  : Array[String] = Array(10, 20, 30, 40, 50)
	val inputDataList2 = inputDataArray2.map(_.toInt).toList
                                                  //> inputDataList2  : List[Int] = List(10, 20, 30, 40, 50)
	 
	 
	def greaterthan(no : Int, threshold:Int) = {
		if(no < threshold)
			1
		else
			0
	}                                         //> greaterthan: (no: Int, threshold: Int)Int
	
	print("The Number is"+ inputDataList2.map(greaterthan(_, threshold)).sum)
	
	
	//assignment3
  println("Enter String")
	
	val inputString = readLine()     //> inputString  : String = hello how are you
	val inputStringArray = inputString.split(" ")
                                                  //> inputStringArray  : Array[String] = Array(hello, how, are, you	
	val inputStringList = inputStringArray.toList
                                                  //> inputStringList  : List[String] = List(hello, how, are, you)
	//1
	print(inputStringList.reverse)                   //> res3: List[String] = List(you, are, how, hello)
	//2
	print(inputStringList.map(_.reverse))            //> res4: List[String] = List(olleh, woh, era, uoy)
	//3
	print(inputStringList.reverse.map(_.reverse)) 
}