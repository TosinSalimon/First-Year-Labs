package firstYearLabs;
import java.util.*;
public class MinValue {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[]fillArray = new int[size];
		for(int i = 0; i<size; i++){
				fillArray[i]=sc.nextInt();	
			}
		System.out.println(q1Iterative(fillArray));
		System.out.println(q1Recursive(fillArray, 1));
	}
	public static int q1Iterative (int[] a){
		int minValue = a[0];
		for(int i = 1; i<a.length; i++){
			if(a[i]<minValue){
				minValue = a[i];
			}
			
		}
	return minValue;
}
   
	public static int q1Recursive(int[] a, int start){
		if(start == a.length-1){
			return a[start];
		}
		int min = q1Recursive(a, start+1);
		if(a[start]<min)
			return a[start];
		else
			return min;	
	}
}
