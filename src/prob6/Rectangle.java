package prob6;

public class Rectangle extends Shape implements Resizable {
	private double result;
	
	public Rectangle(double width, double height) {
		super(width,height);
	}

	@Override
	public double getArea() {
		this.result = (this.width * this.height);
		return this.result;
	}

	@Override
	public double getPerimeter() {
		this.result = (this.width + this.height) * 2;
		return this.result;
	}

	@Override
	public void resize(double r) {
		this.height *= r;
		this.width *= r;
	}
	
	
}
