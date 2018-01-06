package chapter08;

/**
 * p170 ColorBox继承Box类并添加颜色
 * @author marsamoeba
 *
 */
class ColorBox extends Box {
	int color;
	
	public ColorBox(double w, double h, double d, int c) {
		width = w;
		height = h;
		depth = d;
		color = c;
	}
}
