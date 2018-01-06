package chapter05;

/**
 * p100 for-each风格的for循环，迭代变量是“只读的”。
 * @author marsamoeba
 *
 */
// The for-each loop is essentially read-only.
public class NoChange {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int x : nums) {
			System.out.print(x + " ");
			x = x * 10;  // 不影响循环迭代次数  x还是从头到结尾遍历
		}
		
		System.out.println();
		
		// 第二次for和第一次for 输出结果一样
		for (int x : nums) {
			System.out.print(x + " ");
		}
		
		System.out.println();
	}
}
