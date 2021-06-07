
object DealWithNull_8 extends App {
  case class Address(val city:String, state:String,Zip:String)
  
  class User(email:String, password:String) {
    var fistName : Option[String] = None
    var lastName : Option[String] = Some("Mittal")
    var address : Option[Address] = None
    //var cityFromAddress : Option[String] = Some(new Address().city)
  }
  
  val usr = new User("trendy@gmail.com","abc")
  
  println(usr.fistName) //None
  println(usr.fistName.getOrElse("<not assigned>")) //<not assigned>
  
  usr.fistName = Some("Sumit")
  //usr.lastName = "Mittal" //type mismatch; found : String("Mittal") required: Option[String]
  usr.lastName = Some("Mittal")
  usr.address = Some(Address("banglore","karnataka","506303"))
  
  println(usr.fistName.getOrElse("<not assigned>"))
  
  println(usr.address.getOrElse("<not assigned>"))

  //println(usr.address.city)
  
  
}