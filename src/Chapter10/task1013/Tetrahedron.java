package Chapter10.task1013;
public class Tetrahedron extends ThreeDimensionalShape {
	public Tetrahedron(double length) {
		super(length);
	}

	@Override
	public double getArea3() {
		return super.getLength() * super.getLength() * Math.sqrt(3);
	}

	@Override
	public double getVolume() {
		return super.getLength() * super.getLength() * super.getLength() * (Math.sqrt(2) / 12);
	}
	@Override
	public String toString(){
		return String.format("%s, tetrahedron, P = %f, A = %f", super.toString(), getArea3(), getVolume());
	}
}