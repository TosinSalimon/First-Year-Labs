package firstYearLabs;
import java.util.Scanner;
public class WeatherReport {

	public static void main(String args[]){
	   printWeatherReport();
	}
	
	public static void printWeatherReport(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num = sc.nextInt();
		
		if(num>=0&&num<=8)
			System.out.println("It is cold, bring a jacket!");
		
		else if(num>=9&&num<=16)
			System.out.println("The sun is coming out, and it is getting warnmer");
		
		else if(num>=17&&num<=32)
			System.out.println("Time to sit beside the pool and relax");
		
		else if(num>=33&&num<=45)
			System.out.println("Too hot, can't move");
		
		else
			System.out.println("Not a valid number!");
	}
		
	
}
