
public class AssignmentClass {
  public static void main(String[] args) {
	DetergentPowder detPow=new DetergentPowder(120, "wheel", 2022, 2024);
	detPow.printDetergentPowder();
	detPow.orderPowder();
	detPow.orderPowder(6);
	detPow.orderPowder(6,"xyz" );
	detPow.orderPowder(6, "xyz", 8, null);
//	detPow.changeManYear(2023);
//	int quantityNeeded=6;
//	System.out.print("buying "+ quantityNeeded +" detergent ");
//	System.out.println(detPow.getQuantity(quantityNeeded));
//	
//	System.out.print("returning expiry year of ");
//	System.out.println(detPow.getExpriryYear());
	
//	DetergentPowder detPow2=new DetergentPowder(130, "surf-exel", 2023, 2025);
//	detPow2.printDetergentPowder();
//	
//	DetergentPowder detPow3=new DetergentPowder(100, "Rin", 2023, 2026);
//	detPow3.printDetergentPowder();
}
}

class DetergentPowder{
	private int pricePowder;
	private String brandName;
	private int manYear;
	private int expiryYear;
	
   DetergentPowder(int pricePowder,String brandName,int manYear,int expiryYear) {
		this.pricePowder=pricePowder;
		this.brandName=brandName;
		this.manYear=manYear;
		this.expiryYear=expiryYear;
	}
	 //without argument without return type
	public void printDetergentPowder() {
		System.out.println();
		System.out.println("This information is for "+ brandName);
		System.out.println();
		System.out.println("Brand of detergent powder is "+brandName);
		System.out.println("Price of detergent powder is "+pricePowder);
		System.out.println("Manufacturing year of detergent powder is "+manYear);
		System.out.println("Expiry year of detergent powder is "+expiryYear);
	}
	// with argument without return type
	 void changeManYear(int newManYear) {
		System.out.println("we are changing the manufacturing year of the powder");
		manYear=newManYear;
		System.out.println("New Manufacturing year of detergent powder is "+manYear);
	}
	//with arguments with return type
	int getQuantity(int quantity) {
		
		return (quantity*pricePowder);
	}
	
	//without arguments with return type
	int getExpriryYear() {
		
		return expiryYear;
	}
	
	void orderPowder() {
		System.out.println("OrderPowder : orderPowder() |  Ordering Detergent ");
	}
	void orderPowder(int quantity) {
		System.out.println("OrderPowder : orderPowder(int) |  Ordering "+quantity+" Detergent ");
	}
	void orderPowder(int quantity,String brand) {
		System.out.println("OrderPowder : orderPowder(int,String) |  Ordering "+quantity+" from "+brand+" supplier ");
	}
	void orderPowder(int quantity1,String brand1,int quantity2,String brand2) {
		System.out.println("OrderPowder : orderPowder(int,String,int String) |  Ordering "+quantity1+" from "+brand1+" supplier and "+quantity2+" from "+brand2+" supplier");
	}
	
	
}