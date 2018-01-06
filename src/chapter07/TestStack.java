package chapter07;

/**
 * p146 Stack改进版测试类
 * @author marsamoeba
 *
 */
public class TestStack {
	public static void main(String[] args) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		for (int i = 0; i < 10; i++) 
			mystack1.push(i);
		for (int i = 0; i < 10; i++) 
			mystack2.push(i);
		
		System.out.println("Stack in mystack1:");
		for (int i = 0; i < 10; i++) 
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for (int i = 0; i < 10; i++) 
			System.out.println(mystack2.pop());
		
		
		//mystack1.tos = -2;
		//mystack2.stck[3] = 100;
	}

}
