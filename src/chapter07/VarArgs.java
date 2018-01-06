package chapter07;

/**
 * p158 varargs：可变长参数  从JDK1.5开始引入
 * PassArray.java改写版
 * @author marsamoeba
 *
 */
// Demonstrate variable-length arguments.
class VarArgs {
	
	// 可变长参数只能有1个
	// 如果是带有“常规”参数 可变长参数必须是方法中最后声明的数组  
	// int doIt(int a, int b, double c, int ... vals) {
	static void vaTest(int ... v) {
		System.out.print("Number of args: " + v.length + " Contents: ");
		
		for (int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
	
}
