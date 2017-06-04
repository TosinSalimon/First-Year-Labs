package firstYearLabs;
import java.util.*;
public class TestBasicCircle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	BasicCircle c[] = new BasicCircle[3];
	c[0] = new BasicCircle(sc.nextInt());
	c[1] = new BasicCircle(sc.nextInt());
	c[2] = new BasicCircle(sc.nextInt());
	
	System.out.println("Circle 1 has a radius of " + c[0].getRadius());
	System.out.println("Circle 2 has a radius of " + c[1].getRadius());
	System.out.println("Circle 3 has a radius of " + c[2].getRadius());
	
	
	System.out.println("Circle 1 has a circumference of " + c[0].getCircumference());
	System.out.println("Circle 2 has a circumference of " + c[1].getCircumference());
	System.out.println("Circle 3 has a circumference of " + c[2].getCircumference());

	System.out.println("Circle 1 has an area of " + c[0].getArea());
	System.out.println("Circle 2 has an area of " + c[1].getArea());
	System.out.println("Circle 3 has an area of " + c[2].getArea());
	}
	

}
