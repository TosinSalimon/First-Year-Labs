package firstYearLabs;
import java.util.Scanner;
public class DoubleSize {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter two numbers");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		determineSize(n1, n2);
	}
	public static void determineSize(double num1, double num2){
		if(num1<num2)
			System.out.println(num1 + " is smaller than " + num2);
		else if(num2<num1)
			System.out.println(num2 + " is smaller than " + num1);
			
		else if(num1>num2)
			System.out.println(num1 + " is greater than " + num2);
		else if(num2>num1)
			System.out.println(num2 + " is greater than " + num1);
		
		if(num1==num2)
			System.out.println(num1 + " and " + num2 + " are equal ");
		
		
	}

}
