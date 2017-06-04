package firstYearLabs;
import java.util.*;
public class sumDigits {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		System.out.println(recursiveSum(s1));
		
	}
   public static int recursiveSum(int n){
	   int sum = 0;
	   if(n==0){
		   return sum;
	   }
	   else{
		   sum = n%10 + recursiveSum(n/10);
		   
	      return sum;
	   }
   }
}
