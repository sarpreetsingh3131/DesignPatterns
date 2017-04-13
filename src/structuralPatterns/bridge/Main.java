package structuralPatterns.bridge;

public class Main {

	public static void main(String[] args) {
		Product centreLockingSystem = new CentreLockingSystem("Centre locking system");
		Product gearLockingSystem = new GearLockingSystem("Gear locking system");
		
		Bus companyA = new CompanyA("CompanyA", centreLockingSystem);
		Bus companyB = new CompanyA("CompanyB", gearLockingSystem);
		
		companyA.produce();
		companyA.assemble();
		companyA.printDetails();
		System.out.println();
		companyB.produce();
		companyB.assemble();
		companyB.printDetails();
	}
}
