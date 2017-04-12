package structuralPatterns.adapter;

public interface NewInterface {
	
	String getStudentId();

	void setStudentId(String id);

	String getStudentName();

	void setStudentName(String name);

	String getStudentAddress();

	void setStudentAddress(String address);

	String getStudentEmail();

	void setStudentEmail(String email);
	
	String getStudentAge();

	void setStudentAge(String age);
	
	@Override
	String toString();
}