package firstYearLabs;
import java.util.Scanner;
public class stringReverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(reverseRecursive(s1));
		
		
	}
	public static String reverseRecursive(String word){
		if(word.length()<2)
		{
			return word;
		}
		else{
			return reverseRecursive(word.substring(1, word.length()))+word.charAt(0);
		}
	}

}
