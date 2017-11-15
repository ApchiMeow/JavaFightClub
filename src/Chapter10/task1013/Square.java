package Chapter10.task1013;
public class Square extends TwoDimensionalShape {
	public Square(double length) {
		super(length);
	}

	@Override
	public double getArea() {
		return super.getLength() * super.getLength();
	}
	@Override
	public String toString(){
		return String.format("%s, square, P = %f", super.toString(), getArea());
	}
}