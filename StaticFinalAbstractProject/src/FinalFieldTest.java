
public class FinalFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final float PI=3.14f;
      System.out.println("PI : "+PI );
      
      Circle circle1=new Circle(32.1f);
      Circle circle2=new Circle(7.0f);
      Circle circle3=new Circle(13.1f);
      Circle circle4=new Circle(30.0f);
      Circle circle5=new Circle(16f);
      
      circle1.toString();
      circle1.calArea();
      
      circle2.toString();
      circle2.calArea();
      
      circle3.toString();
      circle3.calArea();
      
      circle4.toString();
      circle4.calArea();
      
      circle5.toString();
      circle5.calArea();
      
     Car car1=new Car("White","MH221082");
     car1.showCar();
     
      
      
	}

}

class Circle{
	private float radius;
    private static final float PI=3.14f;
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	void calArea() {
		float area=PI*radius*radius;
		System.out.println("Area of circle is : "+area);
	}
	
}

class Car{
	private String colour;
	private final String numberPlate ;
	public Car(String colour, String numberPlate) {
	
		super();
		this.colour = colour;
		this.numberPlate = numberPlate;
	}
	
	void showCar() {
		System.out.println("Car           : "+colour);
		System.out.println("Number Plate  : "+numberPlate);
	}
}
