package chapter08;

/**
 * p190 Object类
 * Object是所有其他了类的超类。
 * Object类型的变量可以引用任何其它类的对象，因为数组也是作为对象实现的。
 * 所以Object类型的变量可以引用任何数组
 * 
 * 当使用println()输出对象会自动调用toString()方法。
 * @author marsamoeba
 *
 */
class Object {
	
	// getClass()、notify()、notifyAll()和wait()被声明为final
	
	// Object clone() 创建一个和将要复制的对象完全相同的新对象
	// boolean equals(Object object) 判断一个对象是否和另一个对象相等
	// void finalize() 在回收不在使用的对象之前调用
	// Class<?> getClass() 在运行时获取对象所属的类
	// int hashCode() 返回与调用对象相关联的散列值
	// void notify() 恢复执行在调用对象上等待的某个线程
	// void notifyAll() 恢复执行在调用对象上等待的所有线程
	// String toString() 返回一个描述对象的字符串
	
	// 等待另一个线程的执行
	// void wait()
	// void wait(long milliseconds)
	// void wait(long milliseconds, int nanoseconds)
}
