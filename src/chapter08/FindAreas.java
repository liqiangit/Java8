package chapter08;

/**
 * p185 应用方法重写
 * @author marsamoeba
 *
 */
// 应用运行时多态。
// Using run-time polymorphism.
class Figure {
	double dim1;
	double dim2;
	
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	double area() {
		System.out.println("Area for Figure is undefined.");
		return 0;
	}
}

class Rectangle extends Figure {

	Rectangle(double a, double b) {
		super(a, b);
	}
	
	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}
class Triangle extends Figure {

	Triangle(double a, double b) {
		super(a, b);
	}
	
	// override area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class FindAreas {
	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figure;
		
		figure = r;
		System.out.println("Area is " + figure.area());
		
		figure = t;
		System.out.println("Area is " + figure.area());
		
		figure = f;
		System.out.println("Area is " + figure.area());
		
	}
}
