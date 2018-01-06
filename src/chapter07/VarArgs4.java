package chapter07;

/**
 * p161 varargs方法与模糊性
 * @author marsamoeba
 *
 */
public class VarArgs4 {
	
	static void vaTest(int ... v) {
		System.out.print("vaTest(Integer ...): " +  "Number of args: " + v.length + " Contents: ");
		
		for (int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...): " +  "Number of args: " + v.length + " Contents: ");
		
		for (boolean x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest(1, 2, 3);
		vaTest(true, false, false);
		
		// 理论上合法 因为可变度参数可以为空
		//vaTest(); //Error
	}
	
}
