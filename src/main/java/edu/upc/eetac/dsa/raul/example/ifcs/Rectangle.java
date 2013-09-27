package edu.upc.eetac.dsa.raul.example.ifcs;

public class Rectangle extends ShapeWithName {
	public final static String NAME = "Circle";
	private double sidex;

	private double sidey;

	public Rectangle(double sidex, double sidey) {
		super(NAME);
		this.sidex = sidex;
		this.sidey = sidey;
	}
	
	protected Rectangle(double sidex, double sidey, String name) {
		super(name);
		this.sidex = sidex;
		this.sidey = sidey;
	}

	public double getSidex() {
		return sidex;
	}

	public void setSidex(double sidex) {
		this.sidex = sidex;
	}

	public double getSidey() {
		return sidey;
	}

	public void setSidey(double sidey) {
		this.sidey = sidey;
	}

	public double getArea() {
		return sidex * sidey;
	}

	@Override
	public double computeArea() {
		return getArea();
	}
}
