
public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar guitarObj=new Guitar();
		guitarObj.use();
		guitarObj.tuneStrings();
		guitarObj.play();
		guitarObj.pluck();
		
		Glucometer glucometerObj=new Glucometer();
		glucometerObj.use();
		glucometerObj.operate();
		glucometerObj.reader();
		glucometerObj.measureSugar();

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
		System.out.println("Breathing and Playing flute");
	}
	
}
class ConcertFulte extends Flute{
	void platedFlute() {
		System.out.println("Concert flute is 16 nichel plated");
	}
}


class Harmonium extends AirBasedMusicalInstruments{

	@Override
	public void use() {
		System.out.println("Using Harmonium...........");
		
	}

	@Override
	void blowAir() {
		// TODO Auto-generated method stub
		System.out.println("Blowing air in Harmonium using handle......");
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Harmonium.......");
		
		
	}
	void playUsingKey() {
		System.out.println("Harmonium is playing using keys....");
	}
}

class Suitcase extends Harmonium{
	void foledHarmonium() {
		System.out.println("Suitcase type harmonium is folded harmonium");
	}
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument{
	abstract void tuneSurface();
}
class Tabla extends DrumBasedMusicalInstrument{

	@Override
	public void use() {
		System.out.println("Using  drum based instrument.....");
		
	}
	@Override
	void play() {
		System.out.println("Playing Ta drum based instrument.....");
		
	}


	@Override
	void tuneSurface() {
		System.out.println("Tuning surface ......");
		// TODO Auto-generated method stub
		
	}
	void struck() {
		System.out.println("Strucking with hands........");
	}

		
}
class Dugga extends Tabla{
	void bayanDugga() {
		System.out.println("Bayan from tabla also known Dugga........ ");
	}
}

class Dhol extends DrumBasedMusicalInstrument{

	@Override
	public void use() {
		System.out.println("Using Dhol......");
		
	}

	@Override
	void tuneSurface() {
		System.out.println("Tunning surface of Dhol.......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		System.out.println("Playing Dhol........");
		// TODO Auto-generated method stub
		
	}
	void tap() {
		System.out.println("Tapping Dhol with hands......");
	}
	
}

class BassDrum extends Dhol{
	void playWithSticks() {
		System.out.println("Playing Bass drum using sticks.......");
	}
}



//-----------------------------------
//Musical instrument done
//-----------------------------------


abstract class MedicalInstruments implements Instrument{
	
	abstract void operate();
	
}

abstract class SurgicalInstrument extends MedicalInstruments{
	abstract void sterile();
}

class SurgicalCutter extends SurgicalInstrument{

	@Override
	public void use() {
	System.out.println("Using Surgical Cutter......");
		
	}

	@Override
	void sterile() {
		System.out.println("Sterling the surgical cutter......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void operate() {
		System.out.println("Operating the surgical Cutter......");
		// TODO Auto-generated method stub
		
	}
	
	void cutterForSurgery() {
		System.out.println("Surgical Cutter is used for surgery......");
	}
	
}

class Scissor extends SurgicalCutter{
	
	void cutSoftTissue() {
		System.out.println("Cutting soft tissues using Scissors.......");
	}
	
}


class SurgicalNeedle extends SurgicalInstrument{

	@Override
	public void use() {
		System.out.println("Using surgical needle......");
		
	}

	@Override
	void sterile() {
		System.out.println("Sterling the surgical needle.......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void operate() {
		System.out.println("Operating the surgical needle....");
		// TODO Auto-generated method stub
		
	}
	
	void stiches() {
		System.out.println("Stiching using surgical needle....");
	}
	
}

class StraightNeedle extends SurgicalNeedle{
	void collectBlood() {
		System.out.println("Collecting Blood using Straight Needle.......");
	}
}

abstract class PathologicalInstrument extends MedicalInstruments{
	abstract void reader();
}

class Glucometer extends PathologicalInstrument{

	@Override
	public void use() {
		System.out.println("Using Glucometer......");
		
	}

	@Override
	void reader() {
		System.out.println("Reading Glucometer......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void operate() {
		System.out.println("Operating Glucometer......");
		// TODO Auto-generated method stub
		
	}
	void measureSugar() {
		System.out.println("Glucometer Measuring Sugar level.....");
	}
	
}

class StandardGlucometer extends Glucometer{
       void checkSugarAtMoment() {	
    	   System.out.println("Standard glucometer is used to check sugar at given moment.......");
       }
}

class ECGMachine extends PathologicalInstrument{

	@Override
	public void use() {
		System.out.println("Using ECG machine......");
		
	}

	@Override
	void reader() {
		System.out.println("Reading ECG Machine......");
		// TODO Auto-generated method stub
		
	}

	@Override
	void operate() {
		System.out.println("Operating ECG Machine.............");
		// TODO Auto-generated method stub
		
	}
	void showHeartRhythm() {
		System.out.println("Showing Heart Rhythm using ECG Machine.......");
	}
	
}

class HolterMonitor extends ECGMachine{
	void smallHolterMonitor() {
		System.out.println("Holter Monitor is Small ECG machine.....");
	}
}


//-----------------------------------------------
//Medical Instruments Done
//-----------------------------------------------