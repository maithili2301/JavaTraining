
public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar guitarObj=new Guitar();
		guitarObj.use();
		guitarObj.tuneStrings();
		guitarObj.play();
		guitarObj.pluck();
		
		StringBasedMusicalInstruments sbmi=new Guitar();
		sbmi.use();
		sbmi.tuneStrings();
		sbmi.play();
//		sbmi.pluck();

	}

}

interface Instrument{
	void use();
}
abstract class MusicalInstrument implements Instrument{
	abstract void play();
}
abstract class StringBasedMusicalInstruments extends MusicalInstrument{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstruments{

	@Override
	public void use() {
		System.out.println("Using Guitar.....");
		
	}

	@Override
	void tuneStrings() {
		System.out.println("Tuning Strings Guitar.....");
		
	}

	@Override
	void play() {
		System.out.println("Playing Guitar.....");
		
	}
	void pluck() {
		System.out.println("Plucking Guitar.....");
	}
	
}

class ElectronicGuitar extends Guitar{
	void preset() {
		System.out.println("Preseting Electronic Guitar.....");
	}
}

class Violin extends StringBasedMusicalInstruments{

	@Override
	public void use() {
		System.out.println("Using Violin.....");
		
	}

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("Tuning strings of violin.....");
	}

	@Override
	void play() {
		System.out.println("Playing violin..............");
		// TODO Auto-generated method stub
		
	}
	
	void bow() {
		System.out.println("Bowing Violin.....");
	}
	
}
class Cello extends Violin{
	void longBow() {
		System.out.println("Long Bowing .....");
	}
}

abstract class AirBasedMusicalInstruments extends MusicalInstrument{
	abstract void blowAir();
}
class Flute extends AirBasedMusicalInstruments{

	@Override
	public void use() {
		System.out.println("Using Flute.....");
		
	}

	@Override
	void blowAir() {
		System.out.println("Blowing Air in  Flute.....");
		
	}

	@Override
	void play() {
		System.out.println("Playing Flute......");
		
	}
	void breathing() {
		
	}
	
}