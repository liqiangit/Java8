package chapter08;

/**
 * p187 使用抽象类  简单的抽象类例子
 * 抽象类不能声明抽象的静态方法 ，也不能使用new运算符直接实例化抽象类
 * 抽象类的所有子类，要么实现超类中所有的抽象方法，要么自己也声明为抽象的。
 * @author marsamoeba
 *
 */
// A Simple demonstration of abstract.
abstract class A7 {
	abstract void callme();
	
	// 在抽象类中允许使用具体的方法
	void callmetoo() {
		System.out.println("This is a concrete method.");
	}
}

class B7 extends A7 {

	void callme() {
		System.out.println("B7's implementation of callme.");
	}
	
}
class AbstractDemo {
	public static void main(String[] args) {
		B7 b = new B7();
		
		b.callme();
		b.callmetoo();
	}
}
