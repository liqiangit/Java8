package chapter07;

/**
 * p160 重载varargs方法
 * @author marsamoeba
 *
 */
// Varargs and overloading. 
class VarArgs3 {
	
	// 如果有vaTest(int v)此方法  vaTest(1)调用此方法  没有vaTest(int v)方法 调用vaTest(int ... v)
//	static void vaTest(int v) {
//		System.out.println(v);
//	}
	
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " + "Number of args: " + v.length + " Contents: ");
		
		for (int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...): " + "Number of args: " + v.length + " Contents: ");
		
		for (boolean x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	static void vaTest(String msg, int ... v) {
		System.out.print("vaTest(String, int ...): " + msg + v.length + " Contents: ");
		
		for (int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		vaTest(1, 2, 3);
		vaTest("Testing: ", 10, 20); 
	    vaTest(true, false, false);
	}
}
