package edu.upc.eetac.dsa.raul.example.ifcs;

public class ShapeWithName implements Shape {
	private String shapeName;

	public ShapeWithName(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	public String getShapeName() {
		return shapeName;
	}

	public double computeArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
