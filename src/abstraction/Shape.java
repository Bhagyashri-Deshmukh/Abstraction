package abstraction;

abstract class Shape {
	
	private String colour;
	private String shapeName;
	
	public Shape(String colour, String shapeName) {
		super();
		this.colour = colour;
		this.shapeName = shapeName;
	}

	abstract double area();
	
	public String retrievColour() {		
		return colour;
	}
	
	public String retriveShapeName() {		
		return shapeName;
	}
}
