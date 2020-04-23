package com.sapient.shapes;

public class Shapes {
	int numberOfSides;
	double calculateShapeArea(int numberOfSides,double len) {
		if(numberOfSides == 1) {
			Circle c = new Circle();
			System.out.print("the Area of the Circle is ");
			System.out.println(c.calculatearea(len));
			return c.calculatearea(len);
		}
		else if(numberOfSides == 3) {
			Triangle c = new Triangle();
			System.out.print("the Area of the Triangle is ");
			System.out.println(c.calculatearea(len));
			return c.calculatearea(len);
		}
		else if(numberOfSides == 4) {
			Square c = new Square();
			System.out.print("the Area of the Square is ");
			System.out.println(c.calculatearea(len));
			return c.calculatearea(len);
		}
		else {
			System.out.println("No shapes Present");
			return -1;
		}
	}
	
	
	public class Circle{
		double calculatearea(double r) {return 3.14*r*r;}
	}
	public class Square{
		double calculatearea(double s) {return s*s;}
	}
	public class Triangle{
		double calculatearea(double s) {return 0.433*s*s;}
	}
}
