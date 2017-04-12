package structuralPatterns.facade;

public class ChaiMaker {
	
	public void fillWaterInThePan() {
		System.out.println("Water is filled...");
	}
	
	public void turnOnTheStove() {
		System.out.println("Stove is on...");
	}
	
	public void putPanOnTheStove() {
		System.out.println("Pan is on stove...");
	}
	
	public void addSugar() {
		System.out.println("Sugar added...");
	}
	
	public void addTea() {
		System.out.println("Tea added...");
	}
	
	public void addGinger() {
		System.out.println("Ginger added...");
	}
	
	public void waitFor5Min() {
		System.out.println("5 minutes gone...");
	}
	
	public void addMilk() {
		System.out.println("Milk added...");
	}
	
	public void waitUntilTheMilkIsBoiling() {
		System.out.println("Milk is boiling...");
	}
	
	public void turnOffStove() {
		System.out.println("Stove is off...");
	}
	
	public void finish() {
		System.out.println("Chai is ready...");
	}
}