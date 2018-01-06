package chapter05;

/**
 * p90 while循环体可以是空的。
 * @author marsamoeba
 *
 */
// The target of a loop can be empty.
public class NoBody {
	public static void main(String[] args) {
		int i, j;
		
		i = 100;
		j = 200;
		
		// 循环体为空
		while (++i < --j);
			
		System.out.println("Midpoint is " + i);
	}
	
}
