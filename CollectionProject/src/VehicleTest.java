
public class VehicleTest {
  public static void main(String[] args) {
	
}
}

interface Vehicle{
	void runOnRoad();
	void canBook();
	void booked();
	
}

interface Payment{
	void DoAdvancedPayment(int amt);
	void DoAfterPayment(int amt);
}

abstract class Car implements Vehicle{

	abstract void bookingCar();
	
}
abstract class AcCar extends Car{
   
	abstract void comfortable();
		
}
abstract class NonAcCar extends Car {
      
	abstract void quiteUncomfortable();
}

class Ennova extends AcCar{
     float rate;
	@Override
	public void runOnRoad() {
		System.out.println("Ennova runs on the road smoothly.....");
		
	}

	@Override
	public void canBook() {
		System.out.println("You can book Ennova .............");
		
	}

	@Override
	public void booked() {
		System.out.println("Wohooo....You have booked Ennova for your ride ");
		// TODO Auto-generated method stub
		
	}

	@Override
	void comfortable() {
		System.out.println("Ennova is comfortable for road trip....");
		
	}

	@Override
	void bookingCar() {
		System.out.println("Booking Ennova......");
		// TODO Auto-generated method stub
		
	}
	
	void rateOfEnnova() {
		System.out.println("You Have To Pay : "+rate);
	}

}

class Altroz extends AcCar{
    int rate;
	@Override
	public void runOnRoad() {
		System.out.println("Altroz runs on the smoothly");
		
	}

	@Override
	public void canBook() {
		System.out.println("You can book Altroz....");
		
	}

	@Override
	public void booked() {
		System.out.println("Altroz is booked....");
		
	}

	@Override
	void comfortable() {
		System.out.println("Altroz is comfortable....");
		// TODO Auto-generated method stub
		
	}

	@Override
	void bookingCar() {
		System.out.println("Bokking Altroz....");
		// TODO Auto-generated method stub
		
	}
	
	void rateOfAltroz() {
		System.out.println("Rate of Altroz is "+ rate);
	}
	
}

class Swift extends AcCar{
    int rate;
	@Override
	public void runOnRoad() {
		System.out.println("Swift runs on the road smoothly....");
		
	}

	@Override
	public void canBook() {
		System.out.println("You can book Swift....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booked() {
		System.out.println("Wohoo you have booked swift....");
		// TODO Auto-generated method stub
		
	}

	@Override
	void comfortable() {
		// TODO Auto-generated method stub
		System.out.println("Swift is Comfortable...");
		
	}

	@Override
	void bookingCar() {
		// TODO Auto-generated method stub
		System.out.println("Booking Swift....");
	}
	
	void rateOfSwift() {
		System.out.println("Rate of Swift is "+ rate);
	}
}


class Alto800 extends NonAcCar{
    int rate;
	@Override
	public void runOnRoad() {
		System.out.println("Alto 800 runs on road....");
		
	}

	@Override
	public void canBook() {
		System.out.println("you can book Alto 800....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booked() {
		System.out.println("Alto 800 is booked...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void quiteUncomfortable() {
		System.out.println("Oops..Alto 800 maybe quite uncomfortable....");
		// TODO Auto-generated method stub
		
	}
	
	void rateOfAlto() {
		System.out.println("Rate of Alto 800 is "+ rate);
	}

	@Override
	void bookingCar() {
		System.out.println("Booking Alto 800....");
		
	}
	
	
}

class SantroXing extends NonAcCar{
    int rate;
	@Override
	public void runOnRoad() {
		System.out.println("Santro Running on road....");
		
	}

	@Override
	public void canBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booked() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void quiteUncomfortable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bookingCar() {
		// TODO Auto-generated method stub
		
	}
	void rateOfAltroz() {
		System.out.println("Rate of Altroz is "+ rate);
	}
}