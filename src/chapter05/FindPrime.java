package chapter05;

/**
 * p95 for循环测试素数
 * 素数 大于1的自然数中，除了1和它本身以外不再有其他因数的数
 * @author marsamoeba
 *
 */
// Test for primes.
public class FindPrime {
	public static void main(String[] args) {
		int num;
		boolean isPrime;
		
		num = 14;
		if (num < 2)
			isPrime = false;
		else
			isPrime = true;
		
		for (int i = 2; i <= num / i; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) 
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");
	}
}
