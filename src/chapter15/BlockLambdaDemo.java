package chapter15;

/**
 * p392 块lambda 求int类型的阶层
 * @author marsamoeba
 *
 */
interface NumericFunc { 
	int func(int n); 
} 

class BlockLambdaDemo {
	public static void main(String[] args) {
		NumericFunc factorial = (n) ->  { 
		    int result = 1; 
		 
		    for (int i=1; i <= n; i++) 
		        result = i * result; 
		 
		    return result; 
		}; 
		 
	    System.out.println("The factoral of 3 is " + factorial.func(3)); 
	    System.out.println("The factoral of 5 is " + factorial.func(5)); 
	}
}
