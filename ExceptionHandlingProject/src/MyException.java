
public class MyException {
    public static void main(String[] args) {
		int num1=2147483646;
		int num2=2147483647;
//		Add addObj1=new Add();
//		System.out.println(Integer.MAX_VALUE);
		Add.add(num1,num2);
		
	}
}

 class Add{
	private static int ans;
	
	static void add(int a,int b) {
		ans=a+b;
		System.out.println(" Addition : "+ans);
		
	}
	
	 
}