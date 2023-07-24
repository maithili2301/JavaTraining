
public class ClassExtensionTest {

	public static void main(String[] args) {
//		Doctor x=new Doctor();
		Doctor x=new Surgeon();
		x.diagnose();
//		HeartSurgeon x=new HeartSurgeon();
		if(x instanceof Doctor) {
			System.out.println("It's doctors object");
		}else {
			System.out.println("It's not Doctors object");
		}
		
		System.out.println("-------------------");
		
		if(x instanceof Surgeon) {
			System.out.println("It's Surgeons object");
		}else {
			System.out.println("It's not Surgeons object");
		}
		
        System.out.println("-------------------");
		
		if(x instanceof HeartSurgeon) {
			System.out.println("It's HeartSurgeons object");
		}else {
			System.out.println("It's not HeartSurgeons object");
		}
		
//		Mobile m=new Mobile();
////		Samsung m=new Samsung();
////		SamsungGalaxy m=new SamsungGalaxy();
//		
//        System.out.println("-------------------");
		
//		if(m instanceof Mobile) {
//			System.out.println("It's Mobiles object");
//		}else {
//			System.out.println("It's not Mobiles object");
//		}
//
//        System.out.println("-------------------");
//		
//		if(m instanceof Samsung) {
//			System.out.println("It's Samsungs object");
//		}else {
//			System.out.println("It's not Samsungs object");
//		}
//
//		
//        System.out.println("-------------------");
//		
//		if(m instanceof SamsungGalaxy) {
//			System.out.println("It's SamsungGalaxy object");
//		}else {
//			System.out.println("It's not SamsungGalaxy object");
//		}

	}

}

class Doctor{
	
	void diagnose() { //1.exclusive to Doctor
		System.out.println("Doctor: is diagnosing...ENT checkup....");
	}
	void prescrine() {
		System.out.println();
	}
	
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is diagnosing ");
	}
	void prescribe() {
		System.out.println("Surgeon is prescribing pills");
	}
	void chargeFees() {
		System.out.println("Surgeon is charging 2000 rs ");
	}
	void cut() {
		System.out.println("Surgeon is cutting");
	}
	
}

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon is diagnosing reports");

	}
	void prescribe() {
		System.out.println("HeartSurgeon is prescibing pills and some exersice");
	}
	void chargeFees() {
		System.out.println("HeartSurgeon is charging 4000 rs");
	}

}


class Mobile {
	
}
class Samsung extends Mobile{
	
}
class SamsungGalaxy extends Samsung{
	
}