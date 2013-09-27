package edu.upc.eetac.dsa.raul.abstractclasses;

public abstract class Shape {
	private String shapeName;

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	public String getShapeName() {
		return shapeName;
	}
	
	public abstract double computeArea();

}
