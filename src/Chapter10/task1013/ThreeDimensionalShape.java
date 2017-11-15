package Chapter10.task1013;
public abstract class ThreeDimensionalShape extends Shape {
	public ThreeDimensionalShape(double length, double width,double height) {
		super(length, width, height);
	}
	public ThreeDimensionalShape(double length,double width) {
		super(length,width);
	}
	public ThreeDimensionalShape(double length) {
		super(length);
	}
	public ThreeDimensionalShape() {
		super();
	}
	public abstract double getArea3();
	public abstract double getVolume();

	@Override
	public String toString(){
		return String.format("%s, 3D", super.toString());
	}
}
