
public class Student 
{
	private String name, majoring,country;
	private int age;
	
	public Student()
	{
	name = "";
	majoring = "";
	country = "";
	age = 0;
	}
	
	
	public Student(String d, int e, String f, String g) {
		name = d;
		majoring = f;
		age = e;
		country = g;
	}
	

	public String getName() {
		
		return name;
	}
	public String getMajoring() {
		
		return majoring;
	}
	public int getAge() {
	
	return age;
}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setMajor(String major)
	{
		this.majoring = major;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Student name : "+ name);
		System.out.println("Majoring in: "+ majoring);
		System.out.println("Age: "+ age);
	}
	
	@Override 
	public String toString() {
	    String out = "";

	    out = "[" + name + "," + age + "," + majoring + "]";

	    return out;
	}


	public void setCountry(String country) {
		
		this.country = country;
		
	}




}
