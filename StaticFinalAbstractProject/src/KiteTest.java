
public class KiteTest {
   public static void main(String[] args) {

	Kite kiteObj1=new Kite("Maithili", "Red", 50);
	kiteObj1.showKite();
	Kite kiteObj2=new Kite("Varad", "yellow", 60);
	kiteObj2.showKite();
	Kite kiteObj3=new Kite("sayali", "Pink", 30);
	kiteObj3.showKite();
	Kite kiteObj4=new Kite("Sakshi", "Blue", 70);
	kiteObj4.showKite();
	Kite.showKiteCount();
	
}
}

class Kite{
	private String owner;
	private String colour;
	private int lenth;
	private static int kiteCount;
	public static void showKiteCount() {
		System.out.println("Total Kites in the sky : "+kiteCount);
	}
	public Kite(String owner, String colour, int lenth) {
		super();
		this.owner = owner;
		this.colour = colour;
		this.lenth = lenth;
		Kite.kiteCount++;
	}
	
	void showKite() {
		System.out.println("Ownwer of Kite   : "+owner);
		System.out.println("Length of Kite   : "+lenth);
		System.out.println("Colour of Kite   : "+colour);
		System.out.println("Total count of Kites : " + Kite.kiteCount);
		System.out.println("----------------------------------");
		
	}
	
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", colour=" + colour + ", lenth=" + lenth + "]";
	}
	
	
}