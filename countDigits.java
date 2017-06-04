package firstYearLabs;

import java.util.*;

public class countDigits{ 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println(countRecursive(number));
		
	}

	public static int countRecursive(int num){
		if (num==8) 
			return 1; 
		
			if (num<10) 
			 return 0;
		
				if (num%100==88) 
		          return 2 + countRecursive(num/10);
		 
						if (num%10==8)
		                  return 1 + countRecursive(num/10);
		       return countRecursive(num/10);
		
		
	}
}
