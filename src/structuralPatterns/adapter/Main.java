package structuralPatterns.adapter;

public class Main {

	public static void main(String[] args) {
		OldInterface student = new Student(1, "Sarpreet Singh", "Amritsar, Punjab", "sarpreet@singh", 23);	
		NewInterface newInterface = new Adapter(student);		
		System.out.println(newInterface.toString());
	}
}