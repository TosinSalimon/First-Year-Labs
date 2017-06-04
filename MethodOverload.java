package firstYearLabs;
import java.util.*;
public class MethodOverload {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s1 = new String ();
		
		for(int i = 0; i < num; i++)
		{
			s1+=sc.next().toLowerCase()+ " ";
		}
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		char c = sc.next().charAt(0);
		char c1 = sc.next().charAt(0);
		
		
		System.out.println(manipulation(s1));
		System.out.println(manipulation(s1, c));
		System.out.println(manipulation(s1, n));
		System.out.println(manipulation(s1, n, n1));
		System.out.println(manipulation(s1, c, c1));
		System.out.println(manipulation(s1, c, n));
		
	}
	
 public static String manipulation(String s1){
	 
	 String rv = new String();
	 
		for(int i = 0; i<s1.length(); i++){
			
		if(s1.charAt(i)!=' '){
			rv+=s1.charAt(i);	
		  }
		}
	  return rv;
		
 }
 public static String manipulation(String s1, char c){
	 
		 String rv = new String();
		 
			for(int i = 0; i<s1.length(); i++){
				
			if(s1.charAt(i)!=c){
				rv+=s1.charAt(i);	
			  }
			}
		  return rv;
	 }
 public static String manipulation(String s1, int n){
	 
	 char c = s1.charAt(n);
	 String rv = new String();
	 
		for(int i = 0; i<s1.length(); i++){
			
		if(s1.charAt(i)!=c){
			rv+=s1.charAt(i);	
		  }
		}
	  return rv;
	
  }
 public static String manipulation(String s1, int n, int n1){
	 String rv = s1.substring(0, n + 1 ) + s1.substring(n1, s1.length()-1); 
	 
	 return rv;
 }
 public static String manipulation(String s1, char c, char c1){
	 
	 int start = 1;
	 int finish = 0;
	 String rv = new String();
	 
	 for(int i = 0; i<s1.length(); i++){
		 if(s1.charAt(i)==c){
			 start = i+1;
			 break;
		 }
	 }
	 for(int i = s1.length()-1; i > -1; i--){
		 if(s1.charAt(i)==c1){
			 finish = i;
			 break;
		 }
	 }
	 rv = s1.substring(0, start) +s1.substring(finish, s1.length()-1);
	 
	 return rv;
 }
 public static String manipulation(String s1, char c, int n){
	 
	 int charCount = 0;
	 int index = 0; 
	 String rv = new String();
	 
	 for(int i = 0; i<s1.length(); i++)
	   {	 
		 if(s1.charAt(i)==c && charCount< n)
		  {
			 charCount++;
	      }
		 if(charCount == n)
		  {
			         index = 1;
					 break;
		  }
	   }
	 rv = s1.substring(index,  s1.length()-1);
	 
	 return rv;
  }
	
}
