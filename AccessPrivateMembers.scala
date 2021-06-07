

object AccessPrivateMembers extends App {
  private var accessEachOther1 :Int = 22
	print("Object=="+new AccessPrivateMembers().accessEachOther2)
  
}

class AccessPrivateMembers{
	private var accessEachOther2 :Int = 33
	print("Class=="+AccessPrivateMembers.accessEachOther1)
}
    
