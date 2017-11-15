package Chapter10.task1013;
public class Circle extends TwoDimensionalShape {
	public Circle(double radius) {
		super(radius);
	}

	@Override
	public double getArea() {
		return Math.PI * super.getLength() * super.getLength();
	}
	@Override
	public String toString(){
		return String.format("%s, circle, P = %f", super.toString(), getArea());
	}
}