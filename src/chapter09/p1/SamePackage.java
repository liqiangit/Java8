package chapter09.p1;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("same package constructor");
		System.out.println("n = " + p.n);
	
		//n_pri 访问修饰符是private的  只能在当前类内访问 ，其同包的类无法访问。
		//System.out.println("n_pri = " + p.n_pri);
	
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	 }
}
