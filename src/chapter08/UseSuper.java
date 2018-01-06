package chapter08;

/**
 * p175 super的另一种用法
 * @author marsamoeba
 *
 */
class A2 {
	int i;
}

class B2 extends A2 {
	int i;
	
	B2(int a, int b) {
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		B2 subOb = new B2(1, 2);
		subOb.show();
	}
	
}
