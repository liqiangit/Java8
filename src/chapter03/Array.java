package chapter03;

/**
 * p52 数组  数组的索引是从0开始的 
 * @author marsamoeba
 *
 */
// Demonstrate a one-dimensional array
// 展示一个一维数组
public class Array {
	public static void main(String[] args) {
		int month_days[];
		month_days = new int[12];
		month_days[0] = 31; // 1月
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		
		System.out.println("April has " + month_days[3] + " days.");
	}
}
