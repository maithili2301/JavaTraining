//
public class SingleLevelTest {

	public static void main(String[] args) {
		Square x=new Square(10, 90);
		x.showDetails();
		
  
	}

}
//
//class Point2D{
//	private int x;
//	private int y;
//	
//	
//	
//	 Point2D(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
//	 void showPoint() {
//		 System.out.println("x : "+x);
//		 System.out.println("y : "+y);
//	 }
//}
//
//class Point3D extends Point2D{
//
//	private int z;
//	Point3D(int x, int y,int z) {
//		super(x, y);
//		this.z=z;
//	}
//	void showPint() {
//		super.showPoint();
//		System.out.println("z : "+z);
//	}
//	
//}


class Quadrilateral{
//	int NoOfSides;
	 int LengthOfSides;
	Quadrilateral(int side){
		this.LengthOfSides=side;
	}
	void showDetails() {
		System.out.println("Shape has "+ LengthOfSides);
	}
}
class Rectangle extends Quadrilateral{

	int AngleOfRectangle;
	Rectangle(int side,int angle) {
		super(side);
		this.AngleOfRectangle=angle;
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Rectangle has "+AngleOfRectangle+" angles");
	}

	
	
}
class Square extends Rectangle{

	float diagonal;
	Square(int side,int angle) {
		super(side, angle);
//		this.diagonal=diagonalLength;
		
		// TODO Auto-generated constructor stub
	}
	void showDetails() {
		super.showDetails();
		System.out.println("Length of diagonals of Square is "+(1.414*LengthOfSides));
	}
	
}




