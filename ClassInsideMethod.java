package InnerClasses;

public class ClassInsideMethod {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg()
			 {
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  //end of display

	 
	public static void main(String[] args) {
		ClassInsideMethod  ob=new ClassInsideMethod ();  
		ob.display();  
		}


}
