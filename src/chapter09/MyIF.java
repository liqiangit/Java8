package chapter09;

/**
 * p213 接口的默认方法   (面试)
 * 1. 开发默认接口的主要动机是提供一种扩展接口的方法，而不破化现有代码
 * 2. 另一个动机是系统接口中指定本质上可选的方法，根据接口使用方式选择使用的方法，
 * 	     如remove方法(应该支持可修改和不可修改)，
 * 	     可以在接口中制定默认的实现 让remove什么也不做。
 * 	  如果实现接口的类没有实现remove方法 就调用接口中默认的方法。
 * 
 * @author marsamoeba
 *
 */
public interface MyIF {
	
	int getNumber();
	
	default String getString() {
		return "Default String";
	}

}
