package chapter07;

/**
 * p151 嵌套类和内部类
 * @author marsamoeba
 *
 */
// Demonstrate an inner class.
class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	// 内部类
	class Inner {
		void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
	
	
}

class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}
