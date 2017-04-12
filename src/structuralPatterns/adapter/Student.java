package structuralPatterns.adapter;

public class Student implements OldInterface {

	private int id;
	private String name;
	private String address;
	private String email;
	private int age;

	public Student(int id, String name, String address, String email, int age) {
		setId(id);
		setName(name);
		setAddress(address);
		setEmail(email);
		setAge(age);
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}
}