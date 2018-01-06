package chapter09.p1;

class Derived extends Protection {
	public Derived() {
		System.out.println("derived constructor");
	    System.out.println("n = " + n);

	//  n_pri 访问修饰符是private的  只能在当前类内访问 ，其同包子类无法访问。
	//  System.out.println("n_pri = " + n_pri);

	    System.out.println("n_pro = " + n_pro);
	    System.out.println("n_pub = " + n_pub);
	}
}
