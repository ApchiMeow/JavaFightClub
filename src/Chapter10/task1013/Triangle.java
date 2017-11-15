package Chapter10.task1013;
public class Triangle extends TwoDimensionalShape {

	public Triangle(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double getArea() {
        double a = super.getLength();
		double b = super.getWidth();
		double c = super.getHeight();
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	@Override
	public String toString(){
		return String.format("%s, triangle, P = %f", super.toString(), getArea());
	}
}