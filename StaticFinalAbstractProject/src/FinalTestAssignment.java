
public class FinalTestAssignment {

	public static void main(String[] args) {
		
		Area areaObj=new Area();
		areaObj.houseNo="106F";
		areaObj.SocietyName="Vignesh vertex";
		areaObj.setAreaName("wakad");
		areaObj.setPinCode("412111");
		areaObj.setCity("Pune");
		
		areaObj.showAddress();
		System.out.println("----------------------");
		areaObj.showArea();
		
		

	}

}

class Address{
	String houseNo;
	String SocietyName;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getSocietyName() {
		return SocietyName;
	}
	public void setSocietyName(String societyName) {
		SocietyName = societyName;
	}
	void showAddress() {
		System.out.println("House No : "+getHouseNo() );
		System.out.println("Society Name : "+getSocietyName());
	}
	
}
final class Area extends Address{
	private String areaName;
	private String pinCode;
	private String City;
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	void showArea() {
		System.out.println("Arrea : "+getAreaName());
		System.out.println("Pincode : "+getPinCode());
		System.out.println("City : "+getCity());
	}
	
	
}



