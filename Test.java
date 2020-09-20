package PA2;
import java.util.*;
class Test{
	private static void testRectangle() {
		//create rectangles
		Rectangle rectA = new Rectangle(15, 10, 'A');
		Rectangle rectB = new Rectangle(5, 100, 'B');
		Rectangle rectC = new Rectangle(30, 5, 'C');
		Rectangle rectD = new Rectangle(20, 5, 'D');
		Rectangle rectE = new Rectangle(10, 5, 'E');
		//print number of rectangles created
		System.out.println("Number of rectangles created is  " + Rectangle.created);
		System.out.println("********************");
	}
	private static void testMaxAndCount() {
		
	}
	public static void main(String[] args) {
		System.out.println("*****Rectangle Verification*****");
		testRectangle();
		System.out.println("END");
		System.out.println("*****Max and Count Verification*****");
		testMaxAndCount();
		System.out.println("END");
	}
}
