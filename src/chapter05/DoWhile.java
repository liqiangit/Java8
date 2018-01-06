package chapter05;

/**
 * p91 do-while语句
 * @author marsamoeba
 *
 */
// Demonstrate the do-while loop.
public class DoWhile {
	public static void main(String[] args) {
		int n = 10;
		
		do {
			System.out.println("tick " + n);
		} while (--n > 0);
	}
}
