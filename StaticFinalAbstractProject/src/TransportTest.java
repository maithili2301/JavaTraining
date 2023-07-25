
public class TransportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InternationalAirline obj1=new InternationalAirline();
		obj1.travel();
		obj1.useAirForTransport();
		obj1.carryPassengerGoods();
		obj1.transportPassengerAndLuggage();
		obj1.operateInternationally();
	}

}

interface Transport{
	void travel();
}

abstract class RoadWays implements Transport{
	abstract void useRoadForTransport();
}

abstract class PublicTransport extends RoadWays{
	abstract void PublicallyAvailable();
}
class Bus extends PublicTransport{

	@Override
	public void travel() {
		System.out.println("Travelling using bus......");
		
	}

	@Override
	void useRoadForTransport() {
		// TODO Auto-generated method stub
		System.out.println("Bus is Road Transport......");
		
	}
	@Override
	void PublicallyAvailable() {
		System.out.println("Bus is publically available vehicle......");
		
		// TODO Auto-generated method stub
		
	}
	
	void manyPeopleTravel() {
		System.out.println("Many people can travel through bus at a timee........");
	}

}

class ElectricBus extends Bus{
	void ElectricityBasedBus() {
		System.out.println("Electric buses uses electricity.......");
	}
}


abstract class PrivateTransport extends RoadWays{
	abstract void getPrivately();
}

class Cars extends PrivateTransport{

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Travelling By Car...............");
	}

	@Override
	void getPrivately() {
		System.out.println("Cars are private vehicles...........");
		// TODO Auto-generated method stub
		
	}

	@Override
	void useRoadForTransport() {
		System.out.println("Car is road transport...........");
		// TODO Auto-generated method stub
		
	}
	
	void airConditioned() {
		System.out.println("Cars are air conditioned........");
	}
	
}

class ElectricCar extends Cars{
	void electricityBasedCar() {
		System.out.println("Electric cars are Electricity Based......");
	}
}


//-----------------------------------
//-------Road Transport done--------
//------------------------------------



abstract class Airways implements Transport{
	abstract void useAirForTransport();
}

abstract class Combi extends Airways{
	abstract void carryPassengerGoods();
}
class Airlines extends Combi{

	@Override
	public void travel() {
		System.out.println("Travelling by airlines.....");
		
	}

	@Override
	void carryPassengerGoods() {
		System.out.println("Carring Passengers and goods.......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void useAirForTransport() {
		System.out.println("Airlines uses Airways for transport..........");
		// TODO Auto-generated method stub
		
	}
	
	void transportPassengerAndLuggage() {
		System.out.println("Airlines transporting passengers and luggage...........");
	}
	
}

class InternationalAirline extends Airlines{
	void operateInternationally() {
		System.out.println("International Airlines are operated internationally.........");
	}
}

abstract class Cargo extends Airways{
	abstract void carryGood();
}

class TimeTempSensitiveCargo extends Cargo{

	@Override
	public void travel() {
		System.out.println("Goods travelling through Time and temperature sensitive cargo......");
		
	}

	@Override
	void carryGood() {
		System.out.println("Time and temperature sensitive Cargo carries goods......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void useAirForTransport() {
		System.out.println("Time and Temperature sensitive cargo uses Airways for transport....");
		// TODO Auto-generated method stub
		
	}
	
	void timeAndTempSensitive() {
		System.out.println("This is Time and temperature sensitive cargo........... ");
	}
}

class PharmaHealthCareCargo extends TimeTempSensitiveCargo{
	void handlePharmaProduct() {
		System.out.println("Pharma and Health Care cargo handles phara and health care products.......");
	}
}
