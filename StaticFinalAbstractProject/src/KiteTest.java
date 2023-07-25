
public class KiteTest {
   public static void main(String[] args) {

	Kite kiteObj1=new Kite("Maithili", "Red", 50, true);
	kiteObj1.showKite();
	Kite kiteObj2=new Kite("Varad", "yellow", 60, true);
	kiteObj2.showKite();
	Kite kiteObj3=new Kite("sayali", "Pink", 30, true);
	kiteObj3.showKite();
	Kite kiteObj4=new Kite("Sakshi", "Blue", 70, true);
	kiteObj4.showKite();
	Kite kiteObj5=new Kite("Shruti", "Black", 80, true);
	kiteObj5.showKite();
	
	kiteObj4.kiteFight(kiteObj2);
	Kite.showKiteCount();
	
}
}

class Kite{
	private String owner;
	private String colour;
	private int lenth;
	private static int kiteCount;
	private boolean flying;
	public static void showKiteCount() {
		System.out.println("Total Kites in the sky : "+kiteCount);
	}
	public Kite(String owner, String colour, int lenth,boolean flying) {
		super();
		this.owner = owner;
		this.colour = colour;
		this.lenth = lenth;
		this.flying=flying;
		Kite.kiteCount++;
	}
	
	void showKite() {
		System.out.println("Ownwer of Kite   : "+owner);
		System.out.println("Length of Kite   : "+lenth);
		System.out.println("Colour of Kite   : "+colour);
//		System.out.println("Kite is flying");
		System.out.println("Total count of Kites : " + Kite.kiteCount);
		System.out.println("----------------------------------");
		
	}
	void kiteFight(Kite kite2) {
		System.out.println(this.colour+ " Kite initiated fight with "+kite2.colour+" kite");
		for(int i=1;i<=20;i++) {
			double value=Math.random()%10;
			
			System.out.println(this.colour+" and "+kite2.colour+" Kites are fighting......."+value);
			
			if(value>0.85) {
				kiteCount--;
				this.flying=false;
				
				System.out.println(this.colour +" lost the kite fight with "+kite2.colour+" kite");
				break;
			}
			else if(value<0.10) {
				kiteCount--;
				kite2.flying=false;
				System.out.println(kite2.colour +" kite lost the fight with "+this.colour+" kite");
				break;
			}else if(value>=0.30 && value<=0.40){
				kiteCount--;
				kiteCount--;
				System.out.println("Both the kites lost the fight");
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", colour=" + colour + ", lenth=" + lenth + "]";
	}
	
	
}