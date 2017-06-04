package firstYearLabs;
import java.util.*;
public class TestPerson {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			Person p[] = new Person[3];
		p[0] = new Person(sc.nextLine(),sc.nextLine());
		p[1] = new Person(sc.nextLine(),sc.nextLine());
		p[2] = new Person(sc.nextLine(),sc.nextLine());
		
		System.out.println("Person 1 is called " + p[0].getName());
		System.out.println("They live in " + p[0].getAddress());
		System.out.println("Their PPS Number is " + p[0].getPpsNo());

		p[1].setName("Paul Smyth");
		p[1].setAddress("Dublin");
		
		//call showPerson method
		for(int i = 0; i < p.length; i++)
		{
			p[i].showPerson();
		}


//call the toString method on a paticular object
	String details = p[2].toString();
	System.out.print(details); 
	//or System.out.print(e[1].toString());


 }
}
