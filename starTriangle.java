package firstYearLabs;
import java.util.Scanner;
public class starTriangle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A number");
		int n = sc.nextInt();
		printStarTriangle(n);
		
	}
	public static void printStarTriangle(int num){
		for(int i = 1; i<=num;i++){
		 for(int j = 1; j<=i;j++){
			 System.out.print("*");
			 
		 }
		 System.out.println();
		}
		
		
	}

}
