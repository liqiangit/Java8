package chapter08;

/**
 * p166 继承的基础知识
 * @author marsamoeba
 *
 */
// A simple example of inheritance.
class A {
	int i, j;
	
	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	
	void showk() {
		System.out.println("k: " + k);
	}
	
	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
}

class SimpleInheritance {
	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		
		// 父类可以单独使用
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		
		// 子类可以访问超类的成员
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println();
		
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
		
	}
}
