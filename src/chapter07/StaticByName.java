package chapter07;

/**
 * p148 在类的外部使用静态变量和静态方法
 * @author marsamoeba
 *
 */
class StaticDemo {
	static int a = 42;
	static int b = 99;
	
	static void callme() {
		System.out.println("a = " + a);
	}
}

class StaticByName {
	public static void main(String[] args) {
		StaticDemo.callme();
		System.out.println("b = " + StaticDemo.b);
	}
}
