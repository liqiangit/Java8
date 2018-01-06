package chapter08;

/**
 * p188 Figure类抽象版本的实现
 * @author marsamoeba
 *
 */
abstract class Figure1 {
	double dim1;
	double dim2;
	
	Figure1(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	// area现在是个抽象方法
	abstract double area();
}

class Rectangle1 extends Figure1 {

	Rectangle1(double a, double b) {
		super(a, b);
	}
	
	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}

class Triangle1 extends Figure1 {

	Triangle1(double a, double b) {
		super(a, b);
	}
	
	// override area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class AbstractAreas {
	public static void main(String[] args) {
		// Figure1 f = new Figure1(10, 10); illegal now 抽象类无法创建对象
		Rectangle1 r = new Rectangle1(9, 5);
		Triangle1 t = new Triangle1(10, 8);
		Figure1 figure; // this is OK, no object is created;
		
		figure = r;
		System.out.println("Area is " + figure.area());
		
		figure = t;
		System.out.println("Area is " + figure.area());
		
	}
}
