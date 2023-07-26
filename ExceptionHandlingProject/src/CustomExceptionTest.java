

public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		} catch (NotHavingPetrol e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotHavingLicence e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class TrafficException extends RuntimeException{
	TrafficException(String msg){
		super(msg);
	}
}
class HeavyRainException extends RuntimeException{
	HeavyRainException(String msg){
		super(msg);
	}
}

class NotHavingLicence extends Exception{ 
	NotHavingLicence(String msg){
		super(msg);
	}
}

class NotHavingPetrol extends Exception{
	NotHavingPetrol(String msg){
		super(msg);
	}
}
class Car

{
	boolean keyFound=false;
	
	Car() throws CarKeyNotFoundException,NotHavingPetrol,NotHavingLicence
	{
		boolean havingPetrol=true;
		boolean haveLicence=true;
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		if(value<=0.15) {
			havingPetrol=false;
		}
		else {
			System.out.println("Having petrol");
		}
		
		if(havingPetrol==false) {
			throw new CarKeyNotFoundException("Hey...Where is the petrol? im not getting it...");
		}
		
		if(value>0.15&& value<0.2) {
			haveLicence=false;
		}else {
			System.out.println("Having licence");
		}
		
		if(haveLicence==false) {
			throw new CarKeyNotFoundException("Hey...Where is the Licence? im not getting it...");
		}
		
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		if(value>=0.90) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Licence? im not getting it...");
			
		}
		if(value>=0.60) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Petrol? im not getting it...");
			
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			else if(value>0.75 && value <0.82) {
				TrafficException ex2=new TrafficException("Traffic Exception............");
			}
			else if(value>0.71 && value<=0.75) {
				HeavyRainException ex3=new HeavyRainException("Heavy rain exception.....");
			}
		}
	}
}

