package abstraction;

public class Circle extends Shape {

	private double radius;

	public Circle(String colour, String shapeName) {
		super(colour, shapeName);
		// TODO Auto-generated constructor stub
	}

	public Circle(String colour, String shapeName, double radius) {
		super(colour, shapeName);
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("Shape is : "+super.retriveShapeName()+" And Colour is : "+super.retrievColour());
		return 3.14*this.radius*this.radius;
	}
	
}
