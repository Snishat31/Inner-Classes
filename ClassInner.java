package InnerClasses;

public class ClassInner {

	private String msg="Welcome to Java"; //can be accessed by Inner class
	 
	 class Inner{  
	  void hello()
	  {
		  System.out.println(msg+", Let us start learning Inner Classes");
	  }  
	 }  


	public static void main(String[] args) {

		ClassInner obj=new ClassInner();
		ClassInner.Inner in=obj.new Inner();  

		in.hello();  
	}


}
