package Chapter10.task1013;
public class Cube extends ThreeDimensionalShape {
	public Cube(double length) {
		super(length);
	}

	@Override
	public double getArea3() {
		return super.getLength() * super.getLength() * 6;
	}

	@Override
	public double getVolume() {
		return super.getLength() * super.getLength() * super.getLength();
	}
	@Override
	public String toString(){
		return String.format("%s, cube, P = %f, A = %f", super.toString(), getArea3(), getVolume());
	}
}