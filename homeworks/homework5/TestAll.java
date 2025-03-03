
public class TestAll {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1,1,10,10);
		Rectangle rec2 = new Rectangle(0,0,5,5);
		Rectangle rec3 = new Rectangle(0,0,5,5);
		Rectangle rec4 = new Rectangle(2,2,3,3);
		Point pt1 = new Point(2, 5);
		Point pt2 = new Point(1, 10);
		Point pt3 = new Point(0, 11);		


		Circle c1 = new Circle(0,0,2);
		Circle c2 = new Circle(0,0,2);
		System.out.println(c1);
		System.out.println(rec1);
		rec1.enlargeSize(20);
		System.out.println(rec1);
		System.out.println("Right Lower Corner: " + rec1.getRightLower());
		System.out.println("Right Upper Corner: " + rec1.getRightUpper());
		System.out.println("Left Upper Corner: " + rec1.getLeftUpper());
		System.out.println(rec2.equals(rec3));
		System.out.println(rec1.equals(rec3));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println("true: " + rec1.inside(pt1));
		System.out.println("true: " + rec1.inside(pt2));
		System.out.println("false: " + rec1.inside(pt3));
	}
}
