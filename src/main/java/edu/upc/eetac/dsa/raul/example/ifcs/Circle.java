package edu.upc.eetac.dsa.raul.example.ifcs;

public class Circle extends ShapeWithName {
	public final static String NAME = "Circle";
	private double radio;

	public Circle(double radio) {
		super(NAME);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double computeArea() {
		return area();
	}
}
