package structuralPatterns.bridge;

public abstract class Bus {

	private final String type;
	private final Product product;
	
	public Bus(String type, Product product) {
		this.type = type;
		this.product = product;
	}
	
	public void printDetails() {
		System.out.println("Bus: " + type + " ,  Product: " + product.getName());
	}
	
	public abstract void assemble();
	
	public abstract void produce();
}