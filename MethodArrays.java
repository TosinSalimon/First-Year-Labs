package firstYearLabs;
import java.util.*;
public class MethodArrays {
 public static void main(String args[]){
	 int[] array = fillArray();
	 System.out.println("Sum = " + sumArray(array));
	 System.out.println("Average = " + avgArray(array));
	 printArray(array);	 
 }
 public static int[] fillArray(){
	 Scanner sc = new Scanner(System.in);
	 int size = sc.nextInt();
	 
	 int myArray[]=new int[size];
	 for(int i=0; i<size; i++){
		 myArray[i]=sc.nextInt();
	 }
	 return myArray;
	 
 }
 public static int sumArray(int[]array){
	 int sum = 0;
	 for(int i = 0; i<array.length; i++){
		 sum+=array[i];
 }
	 return sum;
	 
 }
 public static int avgArray(int[]array){
	 int avg = 0;
	 int sum = sumArray(array);
	 avg = sumArray(array)/array.length;
	 
	 return avg;
 }
public static void printArray(int []array){
	for(int i = 0; i<array.length; i++){
		System.out.print(array[i] + " ");
	}
  }

}

