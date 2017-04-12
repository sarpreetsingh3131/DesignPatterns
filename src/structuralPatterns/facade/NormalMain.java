package structuralPatterns.facade;

public class NormalMain {
	
	public static void main(String[] args) {
		ChaiMaker chaiMaker = new ChaiMaker();
		chaiMaker.fillWaterInThePan();
		chaiMaker.turnOnTheStove();
		chaiMaker.putPanOnTheStove();
		chaiMaker.addSugar();
		chaiMaker.addTea();
		chaiMaker.addGinger();
		chaiMaker.waitFor5Min();
		chaiMaker.addMilk();
		chaiMaker.waitUntilTheMilkIsBoiling();
		chaiMaker.turnOffStove();
		chaiMaker.finish();
	}
}