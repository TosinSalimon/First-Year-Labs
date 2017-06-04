package firstYearLabs;
import java.util.*;
public class arrayValueTimes10 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[]fillArray = new int[size];
		for(int i = 0; i<size; i++){
				fillArray[i]=sc.nextInt();	
			}
		System.out.println(checkArray(fillArray, 0));

	}
	public static boolean checkArray(int[]a, int index){
		if(index>=a.length-1)
			return false;
		
		if(a[index+1] == a[index]*10)
			return true;
	
		return checkArray(a, ++index);
	}
	

}
