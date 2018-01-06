package chapter06;

/**
 * p119 为Box类添加方法。 
 * @author marsamoeba
 *
 */
public class BoxDemo3 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// mybox2指定不同的实例变量
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		mybox1.volume();
		
		mybox2.volume();
	}
}
