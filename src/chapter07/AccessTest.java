package chapter07;

/**
 * p144访问控制
 * @author marsamoeba
 *
 */
class Test4 {
	int a;
	public int b;
	private int c;
	
	void setc(int i) {
		c = i;
	}
	int getc() {
		return c;
	}
}
class AccessTest {
	public static void main(String[] args) {
		Test4 ob = new Test4();
		
		ob.a = 10;
		ob.b = 20;
		
		// This is not OK and will cause an error
		//ob.c = 100; // Error!
		
		ob.setc(100); // OK
		System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
	}
}
