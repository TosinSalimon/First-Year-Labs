package firstYearLabs;
import java.util.*;
public class LinearSearch {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double array[] = new double[size];
		for(int i = 0; i<size; i++){
			array[i]=sc.nextDouble();
		}
		double num = sc.nextDouble();
		boolean result = findElement(array, num);
		if(result==true)
			System.out.println(num + " was found in the array");
		else
			System.out.println(num + " was NOT found in the array");
			
		
	}
  
	public static boolean findElement(double []array, double num){
		for(int i =0; i<array.length; i++){
			
			if(array[i]==num)
               return true;
		}
	return false;
	}
}
