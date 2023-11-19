package abstraction;

public class Rectangle extends Shape{

	private int length;
	private int width;

	public Rectangle(String colour, String shapeName, int length, int width) {
		super(colour, shapeName);
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("Shape is : "+super.retriveShapeName()+" And Colour is : "+super.retrievColour());
		return length*width;
	}	
}
