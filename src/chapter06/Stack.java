package chapter06;

/**
 * p129 堆栈类 
 * 堆栈以先进后出的顺序存储数据。
 * @author marsamoeba
 *
 */
// This class defines an integer stack that can hold 10 values. 
public class Stack {
	int stck[] = new int[10];
	int tos;
	
	Stack() {
		tos = -1;
	}
	
	// 入栈
	void push (int item) {
		if (tos == 9)
			System.out.println("Stack is full.");
		else 
			stck[++tos] = item;
	}
	
	// 出栈
	int pop () {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}
