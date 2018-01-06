package chapter05;

/**
 * p107 使用continue语句
 * @author marsamoeba
 *
 */
// Demonstrate continue.
public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}
	}
}
