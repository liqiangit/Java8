package chapter08;

/**
 * 在继承中使用final关键字
 * 关键字final有三个用途
 * 1.创建已命名常量的等价物
 * 另外两个用途是用于继承
 * 2.使用final关键字阻止重写
 * 3.使用final关键字阻止继承
 * @author marsamoeba
 *
 */
class A8 {
	final void meth() {
		System.out.println("This is a final method.");
	}
}
class B8 extends A8 {
	// 使用final声明的方法不能被重写
//	void meth() { // ERROR! Can't subclass A
//		System.out.println("Illegal!");
//	}
}

// 声明为final的方法就隐式的将类的所有方法声明为final。
// 将类同时生命为abstract和final是违法的。
final class A9 {
	
}
// 声明为final的类无法被继承
// The following class is illegal.
// class B9 extends A9 { // ERROR! Can't subclass A
//	
//}

class FinalDemo {

}
