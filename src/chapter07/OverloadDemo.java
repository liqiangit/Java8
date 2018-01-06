package chapter07;

/**
 * p132 重载方法
 * @author marsamoeba
 *
 */
// Demonstrate method overloading.
public class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}
	
//	void test(int a) {
//		System.out.println("a: " + a);
//	}
	
	void test (int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
//	double test (double a) {
//		System.out.println("double a: " + a);
//		return a * a;
//	}
	
	// p133
	void test (double a) {
		System.out.println("Inside test(double) a: " + a);
	}
}
