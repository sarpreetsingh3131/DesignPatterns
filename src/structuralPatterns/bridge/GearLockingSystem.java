package structuralPatterns.bridge;

public class GearLockingSystem implements Product {

	private final String name;

	public GearLockingSystem(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void create() {
		System.out.println("Creating gear locking system");
	}
}