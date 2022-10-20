package demo12;

public class StudentClsEx {
	
	//properties/variable
	//Actions/methods
	
	//Class variables
	
	int sid;
	
	String sname;
	
	static String principal;
	
	String saddress;
	
	
	//<Accessmodifier><returntype> <methodname>()
	//public, private, protected,default
	
	 public void show()
	{
		System.out.println("Stundent id :" + sid + " Student name: "+ sname + " Principal is --> "+ principal );
		
	}
	
		 
	public int Read()
	{
		System.out.println(sname + " is Reading");
		//local variables
		int local =20;
		//System.out.println(local);
		return local;
		
	}
	
	static public void Play()
	{
		System.out.println("Studnet is playing in ground");
		
			
	}
	
	

}
