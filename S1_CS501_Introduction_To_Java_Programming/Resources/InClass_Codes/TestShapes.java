package Resources.InClass_Codes;

public class TestShapes {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3.0, 4.0);
		System.out.println(rect1.area());
		System.out.println(rect2.area());
		int n = Rectangle.getNumberOfRectangles();
		System.out.println(n);
	}
}
