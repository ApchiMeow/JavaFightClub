package Chapter10.task1013;
public class Sphere extends ThreeDimensionalShape {
	public Sphere(double radius) {
		super(radius);
	}

	@Override
	public double getArea3() {
		return 4 * Math.PI * Math.pow(super.getLength(), 2);
	}

	@Override
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(super.getLength(), 3);
	}
	@Override
	public String toString(){
		return String.format("%s, sphere, P = %f, A = %f", super.toString(), getArea3(), getVolume());
	}
}