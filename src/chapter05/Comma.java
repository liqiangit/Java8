package chapter05;

/**
 * p96 使用逗号
 * @author marsamoeba
 *
 */
public class Comma {
	public static void main(String[] args) {
		int a, b;
		
		for (a = 1, b = 4; a < b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}
}
