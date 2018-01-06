package chapter04;

/**
 * p69 使用位逻辑运算符
 * @author marsamoeba
 *
 */
// Demonstrate the bitwise logical operators.
public class BitLogic {
	public static void main(String[] args) {
		String binary[] = {
			"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
			"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary
		int c = a | b; // 按位或
		int d = a & b; // 按位与
		int e = a ^ b; // 按位异或
		int f = (~a & b) | (a & ~b); // 按位取反  ~ 一元非运算符  
		int g = ~a & 0x0f;
		
		System.out.println("        a = " + binary[a]);
		System.out.println("        b = " + binary[b]);
		System.out.println("      a|b = " + binary[c]);
		System.out.println("      a&b = " + binary[d]);
		System.out.println("      a^b = " + binary[e]);
		System.out.println("~a&b|a&~b = " + binary[f]);
		System.out.println("       ~a = " + binary[g]);
		
	}
}
