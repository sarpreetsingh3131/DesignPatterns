package structuralPatterns.bridge;

public class CentreLockingSystem implements Product {

	private final String name;

	public CentreLockingSystem(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void create() {
		System.out.println("Creating centre locking system");
	}
}