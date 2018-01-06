package chapter07;

/**
 * p141 返回对象
 * 所有的对象都是使用new运算符动态创建的。
 * 只要程序中存在对某个对象的引用，该对象就一直存在。
 * 如果某个对象没有任何引用指向它，那么下一次垃圾回收时，对象被回收。
 * @author marsamoeba
 */
// Returning an object.
class Test3 {
	int a;
	
	Test3(int i) {
		a = i;
	}
	
	Test3 incrByTen() {
		Test3 temp = new Test3(a+10);
		// 返回对象的引用
		return temp;
	}
}

class RetOb {
	public static void main(String[] args) {
		Test3 ob1 = new Test3(2);
		Test3 ob2;
		
		ob2 = ob1.incrByTen();
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);
		
		ob2 = ob2.incrByTen();
		System.out.println("ob2.a after second increase: " + ob2.a);
	}
}
