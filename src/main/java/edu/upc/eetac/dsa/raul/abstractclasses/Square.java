package edu.upc.eetac.dsa.raul.abstractclasses;

public class Square extends Rectangle {
	public final static String NAME = "Circle";
	public Square(double side) {
		super(side, side, NAME);
	}

	public double getSide() {
		return getSidex();
	}

	public void setSide(double side) {
		setSidex(side);
		setSidey(side);
	}

	@Override
	public double getArea() {
		System.out.println("Calculo el área");
		return super.getArea();
	}

}
