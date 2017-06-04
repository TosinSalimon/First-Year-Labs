package firstYearLabs;
import java.lang.Math.*;
public class BasicCircle {
	
	private int radius;
	
	//default constructor
	public BasicCircle(){
		radius = 1;
	}
	//general constructor
	public BasicCircle(int radius){
		
		this.radius = radius;
	}
	
	//Getter method
	public int getRadius(){
		return radius;
	}
	//Setter method
	public void setRadius(int radius){
		this.radius = radius;
	}
	public double getCircumference(){
		double answer =  2*Math.PI*radius;
		double roundOff = Math.round(answer*100.0)/100.0;
		
		return roundOff;
		
	}
	public double getArea(){
		double answer = Math.PI*radius*radius;
		double roundOff = (double)Math.round(answer*100.0)/100.0;
		
		return roundOff;
		
	}

}
