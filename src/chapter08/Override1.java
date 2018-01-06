package chapter08;

/**
 * p182 方法的重写2
 * @author marsamoeba
 *
 */
class A5 {
	int i, j;
	
	A5(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
	
}

class B5 extends A5 {
	int k;
	
	B5(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// overload show 重载
	void show(String msg) {
		System.out.println(msg + k);
	}
}

class Override1 {
	public static void main(String[] args) {
		B5 subOb = new B5(1, 2, 3);
		
		// 子类重载父类show方法
		subOb.show("This is k:");
		
		subOb.show();
	}
}
