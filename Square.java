package firstYearLabs;

public class Square {
	private int length;
	
	//default constuctor
	public Square(){
		length = 1;
	}
	//general constructor
	public Square(int length){
		
		this.length = length;
	}
	
	//Getter method
		public int getLength(){
			return length;
		}
		//Setter method
		public void setLength(int length){
			this.length = length;
		}
	
		public int getArea(){
			return length*length;
			
		}
		public String toString()
	   	{
	   		String details = null;
	   		details = "LENGTH: " + length;
	   		return details;
	   	}

		

}
