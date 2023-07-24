
public class HasATest {

	public static void main(String[] args) {
		
    Human humanObj=new Human();
    humanObj.breathing();
    humanObj.thinking();
    humanObj.doingPranayam();
    humanObj.drinkingLemonJuice();
	}

}
class Kidneys{
	void filtering() {
		System.out.println("Kidney is filtering");
	}
}
class Heart{
	void pumping() {
		System.out.println("Heart is Pumping");
	}
}
class Brain{
	void analysing() {
		System.out.println("Heart is analysing");
	}
}
class Lungs{
	void oxygenatedBlood() {
		System.out.println("Oxegenating blood");
	}
}
class Human{
	private Heart myHeart=new Heart();
	private Brain myBrain=new Brain();
	private Kidneys rightKidney=new Kidneys();
	private Kidneys leftKidney=new Kidneys();
	private Lungs leftLung=new Lungs();
	private Lungs rightLung=new Lungs();
//	myHeart.pumping();
	void breathing() {
		System.out.println("Human is breathing");
		myHeart.pumping();
	}
	
	void thinking() {
		System.out.println("Human is thinking");
		myBrain.analysing();
	}
	void drinkingLemonJuice() {
		System.out.println("Drinking cocacola");
		rightKidney.filtering();
		leftKidney.filtering();
	}
	void doingPranayam() {
		System.out.println("Doing Pranayam");
		leftLung.oxygenatedBlood();
		rightLung.oxygenatedBlood();
		
	}
	
	
}
