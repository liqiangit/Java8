package chapter08;

/**
 * p170 超类变量可以引用子类对象
 * 可以访问哪些成员时由引用变量的类型决定的，而不是由所引用对象的类型决定。
 * @author marsamoeba
 *
 */
public class RefDemo {
	public static void main(String[] args) {
		BoxWeight1 weightbox = new BoxWeight1(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();
		
		plainbox = weightbox;
		
		vol = plainbox.volume();
	    System.out.println("Volume of plainbox is " + vol);
	}
}
