package chapter05;

/**
 * P98 for循环的for-each版本
 * @author marsamoeba
 *
 */
// Use a for-each style for loop.
public class ForEach {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		// 使用for-each循环
		for (int x : nums) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		
		System.out.println("Summation: " + sum);
	}
}
