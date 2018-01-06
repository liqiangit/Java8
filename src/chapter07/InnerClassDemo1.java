package chapter07;

/**
 * p153 在for循环中定义一个内部类
 * @author marsamoeba
 *
 */
// Define an inner class within a for loop.
class Outer1 {
	int outer_x = 100;

    void test() {
	    for(int i=0; i<10; i++) {
	        class Inner {
	            void display() {
	            	System.out.println("display: outer_x = " + outer_x);
	            }
	        }
	        Inner inner = new Inner();
	        inner.display();
	    }
    }
}
class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.test();
	}
}
