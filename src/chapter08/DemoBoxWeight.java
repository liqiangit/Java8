package chapter08;

/**
 * p168 一个更实际的例子  Box类
 * @author marsamoeba
 *
 */

class Box {
	double width;
	double height;
	double depth;
	
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box (double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}

// Here, Box is extened to include weight.
class BoxWeight1 extends Box {
	double weight;
	
	BoxWeight1(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
		BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
	    double vol;
	    
	    vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
	    System.out.println("Volume of mybox2 is " + vol);
	    System.out.println("Weight of mybox2 is " + mybox2.weight);
	}
}
