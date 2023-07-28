import java.util.Scanner;

public class VehicleTest {
  public static void main(String[] args) {
	
}
}


class SelectCar{
	void askAboutCar() {
		System.out.println("Which car do you want ac or non ac ?");
		Scanner sca=new Scanner(System.in);
		sca.nextLine();
		
		
	}
	
	Car gettingCar()
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

class doPayment implements Payment{

	@Override
	public void DoAdvancedPayment(int amt) {
		System.out.println("Do advanced Payment of "+(amt/3));
		
	}

	@Override
	public void DoAfterPayment(int amt) {
		System.out.println("Do payment of remaining "+(amt-amt/3));
		System.out.println("Payment Done....");
		// TODO Auto-generated method stub
		
	}
	
}







 class Car implements Vehicle{

	

	@Override
	public void runOnRoad() {
		
		System.out.println("Car running on road....");
	}

	@Override
	public void canBook() {
		System.out.println("Can book car....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booked() {
		System.out.println("Booked Car....");
		// TODO Auto-generated method stub
		
	}
	 void bookingCar() {
		 System.out.println("Booking car....");
		 
	 }
	
}
  class AcCar extends Car{
    void comfortable() {
    	System.out.println("AC cars are comfortable.....");
    }
	
		
}
 class NonAcCar extends Car {
      
	 void quiteUncomfortable() {
		 System.out.println("Non Ac Cars are quite uncomfortable.....");
	 }
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
		System.out.println("Can book Santro...");
		
	}

	@Override
	public void booked() {
		System.out.println("Santro booked...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void quiteUncomfortable() {
		System.out.println("Santro is quite uncomfortable....");
		// TODO Auto-generated method stub
		
	}

	@Override
	void bookingCar() {
		System.out.println("booking santro..rate..");
		// TODO Auto-generated method stub
		
	}
	void rateOfSantro() {
		System.out.println("Rate of Santro is "+ rate);
	}
}
