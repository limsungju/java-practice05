package prob6;

public class RectTriangle extends Shape {
	double result;
	
	public RectTriangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		this.result = (width * height) / 2;
		return this.result;
	}

	@Override
	public double getPerimeter() {
		this.result = width + height + Math.sqrt(((width*width)+(height*height)));
		return this.result;
	}
	
}
