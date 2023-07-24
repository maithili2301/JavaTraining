package jungle.cave;

class Cat{
	void meow() {
		Tiger tiger = new Tiger();
		tiger.roar();
		tiger.walk();
		tiger.hunt();
//		tiger.sleep();
	}
}

public class Tiger {
	public Tiger() {
		
	}
    void roar() {
	   System.out.println("Hey tiger is roaring");
   }
   public void walk() {
	   System.out.println("Tiger is walking");
   }
   protected void hunt() {
	   System.out.println("Tiger is hunting");
   }
   private void sleep() {
	   System.out.println("Tiger is sleeping");
   }
   
}

class WhiteTiger extends Tiger{
	void roaming() {
		super.roar();
//		super.sleep(); // as it is private
		super.hunt();
		super.walk();
		
	}
}
