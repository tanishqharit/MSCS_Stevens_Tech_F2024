package Resources.InClass_Codes;

public class Rectangle {

	// data fields
	private double width;
	private double height;
	private static int numberOfRectangles = 0;
	
	// Constructors
	
	public Rectangle() {
		width = 0;
		height = 0;
		numberOfRectangles++;
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
		numberOfRectangles++;
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
	
	public double area() {
		return width * height;
	}
	
	public void scaleUp(double factor) {
		width *= factor;
		height *= factor;
	}
	
	public static int getNumberOfRectangles() {
		return numberOfRectangles;
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3.0, 4.0);
		System.out.println(rect1.area());
		System.out.println(rect2.area());
		rect1.scaleUp(2.0);
		rect2.scaleUp(2.0);
		System.out.println(rect1.area());
		System.out.println(rect2.area());
	}
}
