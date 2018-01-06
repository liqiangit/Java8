package chapter07;

/**
 * p139 参数传递的深入分析 第一种 值传递 call-by-value
 * 对方法外部没影响
 * @author marsamoeba
 *
 */
class Test1 {
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
}
class CallByValue {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
		int a = 15, b = 20;
		
		System.out.println("a and b before call: " + a + " " + b);
		
		ob.meth(a, b);
		
		// 输出  15 20 值传递 对外部方法无影响
		System.out.println("a and b before call: " + a + " " + b);
	}
}
