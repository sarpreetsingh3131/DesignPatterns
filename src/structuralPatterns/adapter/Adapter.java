package structuralPatterns.adapter;

public class Adapter implements NewInterface {

	private final OldInterface student;
	private String id;
	private String name;
	private String address;
	private String email;
	private String age;

	public Adapter(OldInterface student) {
		this.student = student;
		setStudentId("" + student.getId());
		setStudentName(student.getName());
		setStudentAddress(student.getAddress());
		setStudentEmail(student.getEmail());
		setStudentAge("" + student.getAge());
	}

	@Override
	public String getStudentId() {
		return id;
	}

	@Override
	public void setStudentId(String id) {
		this.id = id;
	}

	@Override
	public String getStudentName() {
		return name;
	}

	@Override
	public void setStudentName(String name) {
		this.name = name;
	}

	@Override
	public String getStudentAddress() {
		return address;
	}

	@Override
	public void setStudentAddress(String address) {
		this.address = address;
	}

	@Override
	public String getStudentEmail() {
		return email;
	}

	@Override
	public void setStudentEmail(String email) {
		this.email = email;
	}

	@Override
	public String getStudentAge() {
		return age;
	}

	@Override
	public void setStudentAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age + "]";
	}

}