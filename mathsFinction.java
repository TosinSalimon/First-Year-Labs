
package firstYearLabs;
import java.util.Scanner;

public class mathsFinction {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("RECURSIVE: " +q2Recursive(n));
		System.out.println("ITERATIVE: "+q2Iterative(n));
	}
	public static int q2Iterative(int n){
		int baseCase = 2; 
		int current = baseCase;
		int runningTotal = 0;
		//we start the loop at i = 2
		//(this is the first recursive case)
		for(int i = 2; i<=n; i++){
			runningTotal =4*current - 3*i; 
			current = runningTotal;
			//System.out.println(current);
		}
		return runningTotal;
			
	}
		    
		
	 static int q2Recursive(int n){
		if(n == 1){
		return 2;
		}else{
		return 4*(q2Recursive(n-1))-3*n;
		}
	}
	
}


