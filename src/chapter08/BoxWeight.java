package chapter08;

/**
 * p172 使用super调用超类的构造函数
 * @author marsamoeba
 *
 */
class BoxWeight extends Box {
	double weight;
	
	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}
	
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	
	BoxWeight() {
		super();
		weight = -1;
	}
	
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}
