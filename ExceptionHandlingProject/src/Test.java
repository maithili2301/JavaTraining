
public class Test {
  public static void main(String[] args) {
	  
	 System.out.println("Begin main......");
	  
	try {
		System.out.println("Line1");
		System.out.println("Line2");
		if(50>5)
			throw new RuntimeException("Some problem 1");
		
		System.out.println("Line3");
		System.out.println("Line4");
		if(50>55)
			throw new RuntimeException("Some problem 2");
		
		System.out.println("Line5");
		System.out.println("Line6");
		
		if(50>55)
			throw new RuntimeException("Some problem 1");
		
		System.out.println("Line7");
		System.out.println("Line8");
		System.out.println("Line9");
	}catch(RuntimeException ex){
		System.out.println("Exception caught "+ex);
		
	}
	
	System.out.println("END MAIN");
}
}
