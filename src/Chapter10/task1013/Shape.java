package Chapter10.task1013;
public abstract class Shape {
	private double length;
	private double width;
    private double height;
	public Shape(double length, double width, double height) {
		setLength(length);
		setWidth(width);
		setHeight(height);
	}
	public Shape(double length, double width) {
		this(length, width,1);
	}
	public Shape(double length) {
		this(length, 1 ,1);
	}
	public Shape() {
		this(1, 1, 1);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString(){
		return String.format("Shape");
	}
}