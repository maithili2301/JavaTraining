
public class BankTest {
    public static void main(String[] args) {
//    	BankApplicationForm bankAppForm1 = new BankApplicationForm();
//		BankApplicationForm bankAppForm2 = new BankApplicationForm();
//		BankApplicationForm bankAppForm3 = new BankApplicationForm();
//		
//		bankAppForm1.setAccountType("Saving");
//		bankAppForm1.setAdhaarCard("121212232323");
//		bankAppForm1.setAdress("C709, West Avenue, Mumbai 16");
//		bankAppForm1.setApplicantName("Maithili Hattekar");
//		bankAppForm1.setEmailAddress("maithili@gmail.com");
//		bankAppForm1.setMobileNumber("9090121290");
//		bankAppForm1.setPanCard("BOH232MH");
//		
//		bankAppForm2.setAccountType("Current");
//		bankAppForm2.setAdhaarCard("121212238323");
//		bankAppForm2.setAdress("C709, East Avenue, Pune 26");
//		bankAppForm2.setApplicantName("Jack");
//		bankAppForm2.setEmailAddress("Jack@gmail.com");
//		bankAppForm2.setMobileNumber("9098121290");
//		bankAppForm2.setPanCard("BOH2772JD");
//		
//		bankAppForm3.setAccountType("Salary");
//		bankAppForm3.setAdhaarCard("12121132323");
//		bankAppForm3.setAdress("D809, West Avenue, Aurangabad 16");
//		bankAppForm3.setApplicantName("Sushil Kulkarni");
//		bankAppForm3.setEmailAddress("sushil@gmail.com");
//		bankAppForm3.setMobileNumber("9090091290");
//		bankAppForm3.setPanCard("BOH232SK");
//		
//		bankAppForm1.printApplicationForm();
//		bankAppForm2.printApplicationForm();
//
//		bankAppForm3.printApplicationForm();
//
//		
//		System.out.println("=============================");
//		
		Bank bank = new Bank();
//		BankAccount bankAcc1 = bank.applyForBankAccount(bankAppForm1); //passing object here 
//		BankAccount bankAcc2 = bank.applyForBankAccount(bankAppForm2); //passing object here 
//		BankAccount bankAcc3 = bank.applyForBankAccount(bankAppForm3); //passing object here 
//
//		bankAcc1.bankAccountDetails();	
//		bankAcc2.bankAccountDetails();	
//		bankAcc3.bankAccountDetails();
    	
    	
    	
    	BankApplicationForm bankForm1 = new BankApplicationForm();
		BankApplicationForm bankForm2 = new BankApplicationForm();
	
		bankForm1.setApplicantName("Dinesh Sawant");
		bankForm1.setAdhaarCard("125612451289");
		bankForm1.setPanCard("DINJD2233D");
		bankForm1.setEmailAddress("dinesh@gmail.com");
		bankForm1.setMobileNumber("6688443464");
		bankForm1.setAdress("D21, Sai Niwas, Pune 30");
		bankForm1.setAccountType("Savings");
		
		bankForm2.setApplicantName("Disha Sawant");
		bankForm2.setAdhaarCard("555589901289");
		bankForm2.setPanCard("DIAS1133E");
		bankForm2.setEmailAddress("disha@gmail.com");
		bankForm2.setMobileNumber("5588663464");
		bankForm2.setAdress(bankForm1.getAdress());
		bankForm2.setAccountType(bankForm1.getAccountType());
		
		BankAccount jointAcc = bank.applyForJointAccount(bankForm1, bankForm2);
		jointAcc.bankAccountDetails();
	}
}

class BankApplicationForm{
	private String applicantName;
	private String address;
	private String adhaarCard;
	private String panCard;
	private String mobileNumber;
	private String emailAddress;
	private String accountType;
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	void printApplicationForm() {
		System.out.println("-----------BANK APPLICATION FORM---------");
		System.out.println("Applicant's Name           : "+applicantName);
		System.out.println("Applicant's Address        : "+address);
		System.out.println("Applicant's Aadhar Card    : "+adhaarCard);
		System.out.println("Applicant's Pan Card       : "+panCard);
		System.out.println("Applicant's Mobile No      : "+mobileNumber);
		System.out.println("Applicant's email id       : "+emailAddress);
		System.out.println("Account Type               : "+accountType);
	}
}

class BankAccount{
	private long accountNumber;
	private String accountHolder;
	private long accountBalance;
	private String accountType;
	private String ifscCode;
	private String bankOperationType;
	public String getBankOperationType() {
		return bankOperationType;
	}
	public void setBnankOperationType(String bnankOperationType) {
		this.bankOperationType = bnankOperationType;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	void bankAccountDetails() {
		System.out.println("-------Bank Account Details -------");
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Type        : "+accountType);
		System.out.println("Account Holder      : "+accountHolder);
		System.out.println("Bank Account IFSC   : "+ifscCode);
		System.out.println("Account Balance     : "+accountBalance);
		
	}
	
}
class Bank{
	BankAccount applyForBankAccount(BankApplicationForm bankApplicationFormRef) {
		System.out.println("Recieved the application from  : "+bankApplicationFormRef.getApplicantName());
		System.out.println("Creating bank Account ");
		BankAccount bankAccObj=new BankAccount();
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj.setAccountHolder(bankApplicationFormRef.getApplicantName());
		bankAccObj.setAccountType(bankApplicationFormRef.getAccountType());
		bankAccObj.setIfscCode("BOB000000015");
		bankAccObj.setAccountBalance(3000);
		return bankAccObj;
		
	}
	
	BankAccount applyForJointAccount(BankApplicationForm form1,BankApplicationForm form2) {
		
		BankAccount bankAccObj2=new BankAccount();
		
		double value = Math.random() * 100;
		long accNum = (long) value;
		bankAccObj2.setAccountNumber(accNum);//real time, connect to the DB, and find out the last account number generated, and one 
		bankAccObj2.setAccountHolder(form1.getApplicantName()+" "+form2.getApplicantName());
		bankAccObj2.setAccountType(form1.getAccountType());
		bankAccObj2.setIfscCode("BOB000000015");
		bankAccObj2.setAccountBalance(5000);
		bankAccObj2.setBnankOperationType("Joint");
		
		return bankAccObj2;
	}
}