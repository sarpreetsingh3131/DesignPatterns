package structuralPatterns.bridge;

public class CompanyB extends Bus {

	private final String type;
	private final Product product;

	public CompanyB(String type, Product product) {
		super(type, product);
		this.type = type;
		this.product = product;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " + product.getName() + " for " + type);
	}

	@Override
	public void produce() {
		product.create();
		System.out.println("Modifying product " + product.getName() + " according to " + type);
	}
}