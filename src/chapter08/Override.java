package chapter08;

/**
 * p180 方法的重写
 * @author marsamoeba
 *
 */
class A4 {
	int i, j;
	
	A4(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
	
}

class B4 extends A4 {
	int k;
	
	B4(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	void show() {
		// 调用超类的show方法
		super.show();
		System.out.println("k= " + k);
	}
	
	// overload show 重载
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override {
	public static void main(String[] args) {
		B4 subOb = new B4(1, 2, 3);
		
		// 如果没有super 执行子类的show方法，超类的show方法被隐藏不会被执行。
		subOb.show();
		
	}
}
