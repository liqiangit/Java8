package chapter07;

/**
 * p146 Stack改进版
 * @author marsamoeba
 *
 */
// This class defines an integer stack that can hold 10 values. 
public class Stack {
	private int stck[] = new int[10];
	private int tos;
	
	Stack() {
		tos = -1;
	}
	
	void push(int item) {
		if (tos == 9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
	
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}
