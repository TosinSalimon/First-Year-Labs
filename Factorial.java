package firstYearLabs;

import java.util.*;
public class Factorial {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter two integer numbers");
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		if(n>0&&m>0){
		for(int i = n; i<=m; i++){
		getFactorial(i);
		 }
		}
		else
			System.out.println("Not a valid entry!");
	}
	public static void getFactorial(int num){
		int result = 1;
		for(int i =1; i<=num;i++){
			 result = result *i;
		}
		System.out.println("The factorial of " + num + " is " + result);	
	}

}
