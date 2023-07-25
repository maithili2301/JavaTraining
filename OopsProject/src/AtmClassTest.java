
public class AtmClassTest {
	public static void main(String[] args) {

		DetailsByUser detailsUserObj1 = new DetailsByUser();
		DetailsByUser detailsUserObj2 = new DetailsByUser();
		DetailsByUser detailsUserObj3 = new DetailsByUser();

		detailsUserObj1.setAccountType("Saving");
		detailsUserObj1.setAmountToBeWithdraw(1000);
		detailsUserObj1.setCardType("Visa");
		detailsUserObj1.setAtmPin(1085);
		detailsUserObj1.cardAccepted(true);

		detailsUserObj2.setAccountType("Saving");
		detailsUserObj2.setAmountToBeWithdraw(7000);
		detailsUserObj2.setCardType("Rupay");
		detailsUserObj2.setAtmPin(2085);
		detailsUserObj2.cardAccepted(true);

		detailsUserObj1.printDetailsOfUser();
		detailsUserObj2.printDetailsOfUser();

		Cash cashObj1 = new Cash(detailsUserObj1);
		Cash cashObj2 = new Cash(detailsUserObj2);
		cashObj1.setCashAtStartOfDay(100000);
		cashObj2.setCashAtStartOfDay(100000);

		cashObj1.cashWithdrawByUser(detailsUserObj1);
		cashObj2.cashWithdrawByUser(detailsUserObj2);
//       ATM atm=new ATM();

	}
}

class ATM {
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
		System.out.println("-----ATM Details-------");
		{
           
		}
	}

}

class Cash {
	private double cashAtStartOfDay;
	private double cashAvailable;
//  cashAvailable=cashAtStartOfDay;

	Cash(DetailsByUser detailsUser) {

	}

//	DetailsByUser detailsByUserObj1=new DetailsByUser();
	public double getCashAtStartOfDay() {
		return cashAtStartOfDay;
	}

	public void setCashAtStartOfDay(double cashAtDay) {
		this.cashAtStartOfDay = cashAtDay;
	}

	public double getCashAvailable() {

		return cashAvailable;
	}

	public void setCashAvailable(double cashAvailable) {
		cashAvailable = cashAtStartOfDay;
//		this.cashAvailable = cashAvailable;
	}

	void printCashDetails() {
		System.out.println("------------CASH DEATAILS----------");
		System.out.println("Cash at start of the day : " + 10000);
		System.out.println("Cash Available           : " + cashAvailable);
	}

	Cash cashWithdrawByUser(DetailsByUser detailsByUserRef) {
		System.out.println("Received cash withdraw request...... By " + detailsByUserRef.getAtmPin());
		System.out.println("Processing........");
//		cashAvailable=getCashAtStartOfDay();
		Cash cashObj1 = new Cash(detailsByUserRef);

		System.out.println("Cash withdraw   : " + detailsByUserRef.amountToBeWithdraw);
		double cashSet = cashAvailable - detailsByUserRef.amountToBeWithdraw;
		cashObj1.setCashAvailable(cashSet);

		System.out.println("--------Cash Details-----");
		System.out.println("Cash Start of the day " + this.cashAtStartOfDay);
		System.out.println("You withdraw : " + detailsByUserRef.getAmountToBeWithdraw());

		this.cashAvailable = this.cashAtStartOfDay - detailsByUserRef.getAmountToBeWithdraw();
		System.out.println("Cash Available after withdraw : " + cashAvailable);

		return cashObj1;

	}

	public DetailsByUser getDetailsByUserObj1() {
		return getDetailsByUserObj1();
	}
//	public void setDetailsByUserObj1(DetailsByUser detailsByUserObj1) {
//		this.detailsByUserObj1 = detailsByUserObj1;
//	}

}

class DetailsByUser {
	private String accountType;
	private boolean cardInsert;
	private int atmPin;
	double amountToBeWithdraw;
	private String cardType;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

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
		System.out.println("Account type          : " + accountType);
		System.out.println("Card Type             : " + cardType);
		System.out.println("Card Accepted         : " + cardInsert);
		System.out.println("ATM Pin               : " + atmPin);
		System.out.println("Amount to be withdraw : " + amountToBeWithdraw);
	}

}
