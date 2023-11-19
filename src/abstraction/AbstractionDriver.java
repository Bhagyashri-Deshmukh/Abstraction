package abstraction;

public class AbstractionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle shapeCircle = new Circle("Red","Circle",5);
		double areaCircle = shapeCircle.area();
		System.out.println("Area of circle is : "+areaCircle);
		
		System.out.println("\n");
		
		Rectangle shapeRectangle = new Rectangle("Yellow", "Rectangle", 6, 4);
		double areaRectangle = shapeRectangle.area();
		System.out.println("Area of Rectangle is : "+areaRectangle);
	}

}
