
public class DivisionTest {

    public static void main(String[] args) {
    	System.out.println("BEGIN OF MAIN");
    	try {
    		Calculator.divide(100, 20);
    	}catch(Exception e1){
    		System.out.println("Exception  : "+e1);
    	}finally {
    		System.out.println("Finally : 1 runs regardless of exception");
    	}
    	
    	try {
    		Calculator.divide(200, 11);
    	}catch(Exception e2) {
    		System.out.println("Exception  : "+e2);
    	}finally {
    		System.out.println("Finally : 2 runs regardless of exception");
    	}
    	
    	try {
    		Calculator.divide(122, 0);
    	}catch(Exception e3) {
    		System.out.println("Exception  : "+e3);
    	}finally {
    		System.out.println("Finally : 3 runs regardless of exception");
    	}
    	
    	
    	
    	
    	
		
		System.out.println("End OF MAIN");
	}
	
}

class Calculator{
//	static void divide(int num,int deno) {
//		System.out.println("Dividing.....");
//		System.out.println("Numerator    : "+num);
//		System.out.println("Denominator  : "+deno);
//		
//		System.out.println("Trying to divide "+num+" by "+deno);
//		if(deno!=0) {
//			int division=num/deno;
//			System.out.println("Division      : "+division);
//		}else {
//			System.out.println("CANNOT DIVIDE BY ZERO...");
//		}
//		
//		
//		System.out.println("End of divide....");
//	}
	
	
	static void divide(int num, int deno) throws Exception
	{
		System.out.println("\nBEGIN of divide");
		System.out.println("Numerator   : "+num);
		System.out.println("Denominator :"+deno);
		System.out.println("Trying to divide "+num+ " by "+deno);
		 
		int division  = num / deno ;
		System.out.println("Division    : "+division);
		if(10>50) {
			throw new Exception("some problem....");
		}
		
		System.out.println("END of divide\n");
	}
}