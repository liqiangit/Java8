package chapter04;

/**
 * p74 位运算符与赋值运算符的组合
 * @author marsamoeba
 *
 */
public class OpBitEquals {
	public static void main (String[] agrs) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		a |= 4;  // a=5 0101
		b >>= 1; // b=1
		c <<= 1; // c=6 0110
		a ^= c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
