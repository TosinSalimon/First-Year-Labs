package firstYearLabs;

public class Dog {
	private String name;
	private String breed;
	private int age;
	private int lisenceNo;
	private boolean isDangerous;
	private static int counter = 1001;
	//default constructor
	public Dog()
	{
		name = null;
		breed = null;
		age = 0;
		lisenceNo = counter++;
		isDangerous = false;
		
	}
	//general constructor
	public Dog(String name, String breed, int age, boolean isDangerous)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		lisenceNo = counter++;
		this.isDangerous = isDangerous;
	}
	//getter method
	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}
	public int getAge()
	{
		return age;
	}

	public int getLisenceNo()
	{
		return lisenceNo;
	}
	public boolean getIsDangerous()
	{
		return isDangerous;
	}

	//Setter method
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setIsDangerous(boolean isDangerous)
	{
		this.isDangerous = isDangerous;
	}
	
	public void bark(){
		System.out.println(name + " says Woof! Woof! Woof!");	
	}
	
	public String toString()
   	{
   		String details = null;
   		details = "NAME: " + name + "\nBREED: " + breed + "\nAGE: " + age + "\nIS DANGEROUS: " + isDangerous + "\nLICENCE NO: " + lisenceNo;
   		return details;
   	}
	

}
