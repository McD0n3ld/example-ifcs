package edu.upc.eetac.dsa.raul.example.ifcs;

public class TestShape {
	
	public void printAreas(Shape[] shapes){
		for(int i = 0; i< shapes.length;i++)
			System.out.println(shapes[i].computeArea());
	}
	
	public void printNames(ShapeWithName[] shapes){
		for(int i = 0; i< shapes.length;i++)
			System.out.println(shapes[i].getShapeName());
	}

	public static void main(String[] args) {
		Circle c = new Circle(2);
		Rectangle r = new Rectangle(2, 7);
		Square s = new Square(8);

		TestShape t = new TestShape();
		Shape[] shapes = {c,r,s};
		t.printAreas(shapes);
	}

}
