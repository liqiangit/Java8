package chapter08;

/**
 * p183 动态方法调度
 * @author marsamoeba
 *
 */
// Dynamic Method Dispatch
class A6 {
	void callme() {
		System.out.println("Inside A6's callme method");
	}
}
class B6 extends A6 {
	void callme() {
		System.out.println("Inside B6's callme method");
	}
}
class C6 extends A6 {
	void callme() {
		System.out.println("Inside C6's callme method");
	}
}
class Dispatch {
	public static void main(String[] args) {
		A6 a = new A6();
		B6 b = new B6();
		C6 c = new C6();
		A6 r;
		
		r = a;
		r.callme();
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();
	}
}
