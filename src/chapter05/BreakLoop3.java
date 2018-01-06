package chapter05;

/**
 * p104 使用break退出嵌套循环的最内层
 * @author marsamoeba
 *
 */
// Using break with nested loops.
public class BreakLoop3 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ": ");
			for (int j = 0; j < 100; j++) {
				if (j == 10) 
					break;  // break 只能跳出当前循环, 外层循环不影响。
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Loops complete.");
	}
}
