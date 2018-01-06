package chapter08;

/**
 * p179 构造函数的调用时机
 * 从超类到子类按照继承的顺序调用构造函数
 * 如果没有super，那么执行每个超类默认的构造参数或者无参构造参数
 * @author marsamoeba
 *
 */
// Demonstrate when constructors are called.
class A3 {
	A3() {
		System.out.println("Inside A3's constructor.");
	}
}
class B3 extends A3 {
	B3() {
		System.out.println("Inside B3's constructor.");
	}
}
class C extends B3 {
	C() {
		System.out.println("Inside C's constructor.");
	}
}

class CallingCons {
	public static void main(String[] args) {
		//C c = new C();
	}
}
