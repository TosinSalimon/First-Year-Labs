package firstYearLabs;
import java.util.*;
public class cleanString {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(removeDuplicates(word));
		
		
	}
	private static String removeDuplicates(String s) {
	    if (s.length() < 2) 
	        return s;
	     
	    if (s.charAt(0) == s.charAt(1))
	        return removeDuplicates(s.substring(1));
	     
	    return s.charAt(0) + removeDuplicates(s.substring(1));
	}

}
