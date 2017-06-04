package firstYearLabs;

import java.util.Scanner;

public class TestDog {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Dog d[] = new Dog[3];
	d[0] = new Dog("Lady", "Poodle", 2, false);
	d[1] = new Dog("Rocky", "Pit Bull", 4, true);
	d[2] = new Dog();
	
	d[2].setName("Spot");
	d[2].setBreed("Dalmatian");
	d[2].setAge(3);
	d[2].setIsDangerous(false);
	
	System.out.println("Dog 3 is called " + d[2].getName());
	System.out.println("It is a " + d[2].getBreed());
	System.out.println("Their Licence Number is " + d[2].getLisenceNo());
	System.out.println("They are " + d[2].getIsDangerous());
	
	for(int i = 0; i < d.length; i++)
	{
		d[i].bark();
	}
	for(int i =0; i<d.length; i++){
		   if(d[i].getIsDangerous()== false){
			   System.out.println(d[i].getName() + " is  NOT Dangerous" );
			   
		   }else
				  System.out.println(d[i].getName() + " is Dangerous" );
		   
		}
	
	
	System.out.print(d[0].toString()); 
	System.out.print("\n"+d[1].toString());
	}
	

}
