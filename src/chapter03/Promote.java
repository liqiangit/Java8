package chapter03;

/**
 * p51 类型提升规则 
 * @author marsamoeba
 *
 */
public class Promote {
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		
		/* 
		 * f*b中 b被提升为float类型，该子表达式的结果也是float类型
		 * i/c中 c被提升为int类型，并且结果也是int类型
		 * d*s中 s的值被提升doule类型，并且该子表达式的类型为double 
		 * 最后考虑三个中间值 float、int和double  
		 * float加上int的结果是float。作为结果的float减去最后的double，
		 * 会被提升为double，double为表达式最终类型。
		 */
		double result = (f * b) + (i / c) - (d * s);
		
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}
