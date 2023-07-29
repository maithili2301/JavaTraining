import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MallClassTest {

	public static void main(String[] args) {
		
		Parking parkingObj=new Parking();
	
		ParkingAndReceipt parkingRceiptObjet=new ParkingAndReceipt();
		
		
		
		
////		parkingObj.thisIsSection();
//		parkingObj.welcome();
//		parkingObj.setVehicleType("Bike");
//		parkingObj.setVehicleNumber("MH22 1084");
//		parkingObj.setChargesPaid(true);
////		parkingObj.setDetails();
        
	}

}

interface Mall{
	void welcome();
}
abstract class Sections implements Mall{
	abstract void thisIsSection();
}

	
	
	
	
