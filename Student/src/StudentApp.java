import java.util.*; 
public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Azizan");
		s1.setAge(22);
		s1.setMajor("Bioinformatics");
		s1.display();
		
		System.out.println("\nName: "+ s1.getName());
		System.out.println("Age: "+ s1.getAge());
		System.out.println("Name: "+ s1.getMajoring());
	
	

	}
	

}
