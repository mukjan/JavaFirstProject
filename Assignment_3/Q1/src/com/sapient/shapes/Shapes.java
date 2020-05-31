package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {
	static int numberOfSides;
	private static Scanner scanner;
	private static void calculateShapeArea(int numberOfSides, int Side ) {
		if(Side==1) {
			Circle circle = new Circle();
			double area = circle.calculateArea(Side);
			System.out.printf("The Area of the Circle is %f", area);
		}
		if(Side==2) {
			Triangle tri = new Triangle();
			double area = tri.calculateArea(Side);
			System.out.printf("The Area of the Triangle is %f", area);
		}
		if(Side==3) {
			Square square = new Square();
			double area = square.calculateArea(Side);
			System.out.printf("The Area of the Square is %f", area);
		}
	}
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the no of Side");
		numberOfSides = Integer.parseInt(scanner.next());
		System.out.println("Enter the Size of Side");
		int Side = Integer.parseInt(scanner.next());
		calculateShapeArea(numberOfSides,Side);
	}

}
