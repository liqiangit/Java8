package chapter03;

/**
 * p54 二维数组 
 * @author marsamoeba
 *
 */
// Demonstrate a two-dimensional array.
public class TwoDArray {
	public static void main(String[] args) {
		int twoD[][] = new int[4][5];
		int i, j, k = 0;
		
		// 给每个元素赋值
		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}
		
		// 输出
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		
	}
}
