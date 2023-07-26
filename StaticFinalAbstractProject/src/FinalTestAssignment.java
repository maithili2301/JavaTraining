
public class FinalTestAssignment {

	public static void main(String[] args) {

		Area areaObj = new Area();
		areaObj.houseNo = "106F";
		areaObj.SocietyName = "Vignesh vertex";

		areaObj.showAddress();
		System.out.println("----------------------");
		Area.showArea();
		System.out.println("-----------------------");

		StateCountry stateCountryObj = new StateCountry();

		stateCountryObj.showStateCountry();
		System.out.println("==================================================");

		Area areaObj1 = new Area();
		areaObj1.houseNo = "107F";
		areaObj1.SocietyName = "Vignesh Vertex 2";
		areaObj1.showAddress();
		System.out.println("------------------------------------");
		Area.showArea();
		System.out.println("---------------------------------------");
		StateCountry stateCountryObj1 = new StateCountry();
		stateCountryObj1.showStateCountry();
		System.out.println("==================================================");

	}

}

class Address {
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
		System.out.println("House No : " + getHouseNo());
		System.out.println("Society Name : " + getSocietyName());
	}

}

class Area extends Address {
	private static String areaName;
	private static String pinCode;
	private static String City;

	public static String getAreaName() {
		return areaName;
	}

	public static void setAreaName(String areaName) {
		Area.areaName = "Wakad";
	}

	public static String getPinCode() {
		return pinCode;
	}

	public static void setPinCode(String pinCode) {
		Area.pinCode = "412311";
	}

	public static String getCity() {
		return City;
	}

	public static void setCity(String city) {
		Area.City = "Pune";
	}

	static void showArea() {
		System.out.println("Arrea : " + Area.getAreaName());
		System.out.println("Pincode : " + Area.getPinCode());
		System.out.println("City : " + Area.getCity());
	}

}

final class StateCountry {
	private String state="Maharashtra";
	private String country="India";

//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = "Maharashtra";
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = "India";
//	}

	void showStateCountry() {
		System.out.println("State  : " +state );
		System.out.println("Country : " + country);
	}

}
