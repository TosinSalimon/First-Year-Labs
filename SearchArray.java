package firstYearLabs;
import java.util.*;
public class SearchArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String[][]array = new String[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n;j++){
				array[i][j]=sc.next();
				
			}
			
		}
			String s1= sc.next();
			
			
			int result = countString(array, s1);
			if(result>0)
				System.out.println(s1 + " was found " + result + " times in the array");
			else
				System.out.println(s1 + " was NOT found in the array");
	}

	public static int countString(String[][]array, String s1){
		int count=0;
		
    for(int i =0; i<array.length; i++){
    	
    	for(int j=0; j<array.length; j++){
    		
		  if(array[i][j].equalsIgnoreCase(s1))
			  count++;
         }
    }
    return count;
	}
}