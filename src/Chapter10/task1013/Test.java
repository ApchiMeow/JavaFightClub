package Chapter10.task1013;
public class Test {
	public static void main(String[] args) {
		Shape[] figure = new Shape[6];

		Triangle triangle = new Triangle(3, 4, 5);
		Square square = new Square(5);
		Circle circle = new Circle(10);
		Tetrahedron tetrahedron = new Tetrahedron(5);
		Cube cube = new Cube(5);
		Sphere sphere = new Sphere(5);

		figure[0] = triangle;
		figure[1] = square;
		figure[2] = circle;
		figure[3] = tetrahedron;
		figure[4] = cube;
		figure[5] = sphere;

		for (Shape currentFigure : figure) {
//			if (currentFigure instanceof TwoDimensionalShape) {
//				System.out.println(currentFigure.toString());
//			} else if (currentFigure instanceof ThreeDimensionalShape) {
//				System.out.println(currentFigure.toString());
//			}
			// не помню, чего я хотел добиться с instanceof...
			System.out.println(currentFigure.toString());
		}
	}
}