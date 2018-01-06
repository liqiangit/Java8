package chapter15;

/**
 * p393 lambad表达式  颠倒字符串中的字符
 * @author marsamoeba
 *
 */
interface StringFunc { 
	String func(String n); 
} 
class BlockLambdaDemo2 {
	public static void main(String[] args) {
		StringFunc reverse = (str) ->  { 
			String result = "";
			int i;
			
			for (i = str.length()-1; i >= 0; i--) {
				result += str.charAt(i);
			}
			
			return result;
		};
		
		
		System.out.println("Lambda reversed is " + reverse.func("Lambda")); 
		System.out.println("Expression reversed is " + reverse.func("Expression")); 
		
		
	}

}
