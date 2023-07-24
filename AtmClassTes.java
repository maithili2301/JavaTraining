
public class AtmClassTest {
   public static void main(String[] args) {
	
	   DetailsByUser detailsUserObj1=new DetailsByUser();
	   DetailsByUser detailsUserObj2=new DetailsByUser();
	   DetailsByUser detailsUserObj3=new DetailsByUser();
	   
	   detailsUserObj1.setAccountType("Saving");
	   detailsUserObj1.setAmountToBeWithdraw(1000);
	   detailsUserObj1.setAtmPin(1085);
	   detailsUserObj1.cardAccepted(true);
	   
       detailsUserObj1.printDetailsOfUser();
       
       ATM atm=new ATM();
       
	   
}
}

class ATM{
	double availableCash;
	int numberOfTransaction;
	double totalCashWithdraw;
	
	public double getAvailableCash() {
		return availableCash;
	}
	public void setAvailableCash(double availableCash) {
		this.availableCash = availableCash;
	}
	public int getNumberOfTransaction() {
		return numberOfTransaction;
	}
	public void setNumberOfTransaction(int numberOfTransaction) {
		this.numberOfTransaction = numberOfTransaction;
	}
	public double getTotalCashWithdraw() {
		return totalCashWithdraw;
	}
	public void setTotalCashWithdraw(double totalCashWithdraw) {
		this.totalCashWithdraw = totalCashWithdraw;
	}
	
	void printATMDetails() {
		System.out.println("-----ATM Details-------");{
			
		}
	}
	
	
}

class Cash{
	private double cashAtStartOfDay;
	private double cashAvailable;
//  cashAvailable=cashAtStartOfDay;
	
	
	
	DetailsByUser detailsByUserObj1=new DetailsByUser();
	public double getCashAtStartOfDay() {
		return cashAtStartOfDay;
	}
	public void setCashAtStartOfDay(double cashAtStartOfDay) {
		this.cashAtStartOfDay = cashAtStartOfDay;
	}
	public double getCashAvailable() {
		
		return cashAvailable;
	}
	public void setCashAvailable(double cashAvailable) {
		cashAvailable=cashAtStartOfDay;
//		this.cashAvailable = cashAvailable;
	}
	
	void printCashDetails() {
		System.out.println("------------CASH DEATAILS----------");
		System.out.println("Cash at start of the day : "+cashAtStartOfDay);
		System.out.println("Cash Available           : "+cashAvailable);
	}
	
	Cash cashWithdrawByUser(DetailsByUser detailsByUserRef) {
		System.out.println("Received cash withdraw request......");
		System.out.println("Processing........");
		
		Cash cashObj1=new Cash();
		
		cashObj1.setCashAtStartOfDay(cashAtStartOfDay);
		System.out.println("Cash withdraw   : "+detailsByUserRef.amountToBeWithdraw);
//		cashAvailable=
		cashObj1.setCashAvailable(cashAvailable - detailsByUserRef.amountToBeWithdraw);
		
		
		
		return cashObj1;
		
	}
	public DetailsByUser getDetailsByUserObj1() {
		return detailsByUserObj1;
	}
	public void setDetailsByUserObj1(DetailsByUser detailsByUserObj1) {
		this.detailsByUserObj1 = detailsByUserObj1;
	}
	
}

class DetailsByUser{
	private String accountType;
	private boolean cardInsert;
	private int atmPin;
	 double amountToBeWithdraw;
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public boolean isCardInsert() {
		return cardInsert;
	}
	public void cardAccepted(boolean cardInsert) {
		this.cardInsert = cardInsert;
	}
	public int getAtmPin() {
		return atmPin;
	}
	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	public double getAmountToBeWithdraw() {
		return amountToBeWithdraw;
	}
	public void setAmountToBeWithdraw(double amountToBeWithdraw) {
		this.amountToBeWithdraw = amountToBeWithdraw;
	}
	
	void printDetailsOfUser() {
		System.out.println("----------DETAILS OF USER----------");
		System.out.println("Account type          : "+accountType);
		System.out.println("Card Accepted         : "+cardInsert);
		System.out.println("ATM Pin               : "+atmPin);
		System.out.println("Amount to be withdraw : "+amountToBeWithdraw);
	}
	
	
	
	
}

