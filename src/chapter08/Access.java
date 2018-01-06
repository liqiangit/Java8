package chapter08;

/**
 * p167 成员访问与继承
 * @author marsamoeba
 *
 */
class A1 {
	int i;
	private int j; 
	
	void setij(int x, int y) {
	   i = x;
	   j = y;
	   System.out.println("j = " + j);
	 }
}

class B1 extends A1 {
	int total;
	
	void sum() {
		//total = i + j;   ERROR   j无法访问
	}
}
class Access {
	public static void main(String[] args) {
		B1 subOb = new B1();
		subOb.setij(10, 12);
		
		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}

}
