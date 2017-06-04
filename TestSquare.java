package firstYearLabs;

public class TestSquare {
	public static void main(String args[]){
		
		Square s[] = new Square[4];
		for(int i = 0; i<s.length; i++){
			s[i]=new Square();
		}
		
		s[0].setLength(10);
		s[2].setLength(10);
		
		System.out.println("Square 1 has a side length of " + s[0].getLength());
		System.out.println("Square 2 has a side length of " + s[1].getLength());
		System.out.println("Square 3 has a side length of " + s[2].getLength());
		System.out.println("Square 4 has a side length of " + s[3].getLength());

		System.out.println("Square 1 has an area of " + s[0].getArea());
		System.out.println("Square 2 has an area of " + s[1].getArea());
		
		System.out.println(s[3].toString());

	}
	

}
