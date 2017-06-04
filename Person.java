package firstYearLabs;

public class Person {
	private String name;
	private String address;
	private int ppsNo; 
	private static int counter = 1001;


public Person(String name, String address)
{
	this.name = name;
	this.address = address; 
	ppsNo = counter++;
}
//Getter method
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}


	public int getPpsNo()
	{
		return ppsNo;
	}

	//Setter method
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void showPerson()
   	{
   		System.out.println("*****PERSONAL DETAILS*****");
   		System.out.println("NAME: " + name);
   		System.out.println("ADDRESS: " + address);
   		System.out.println("PPS NUMBER: " + ppsNo);
   	
   	}
	public String toString()
   	{
   		String details = null;
   		details = "NAME: " + name + "\nADDRESS: " + address + "\nPPS NUMBER: " + ppsNo;
   		return details;
   	}
}