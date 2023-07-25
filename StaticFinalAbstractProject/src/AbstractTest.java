
public class AbstractTest {
 public static void main(String[] args) {
	GeometricalShpae geoShap=new Square(20);
	geoShap.calArea();
	geoShap.calPerimeter();
	System.out.println("---------------------------");
	GeometricalShpae geoShape2=new Rectangle(20,10);
	geoShape2.calArea();
	geoShape2.calPerimeter();
}
}
abstract class GeometricalShpae{
	abstract void calArea();
	abstract void calPerimeter();
	void fillColor() {
		System.out.println("Filling colour");
	}
}
class Square extends GeometricalShpae{
    
	private float side;
	
	public float getSide() {
		return side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void calArea() {
		
		float area=side*side;
		System.out.println("Area   : "+area);
	}

	@Override
	void calPerimeter() {
		float perimeter=4*side;
		System.out.println("Perimeter  : "+perimeter);
		
	}
	
}

class Rectangle extends Square{

	float breadth;
	public Rectangle(float side,float breadth) {
		super(side);
		this.breadth=breadth;
		
	}
	
	void calArea() {
		float area=getSide()*breadth;
		System.out.println("Area of rectangle  : "+area);
	}
	
	void calPerimeter() {
		float perimeter=(2*getSide())+(2*breadth);
		System.out.println("Perimeter of rectangle : "+perimeter);
	}
	
}
