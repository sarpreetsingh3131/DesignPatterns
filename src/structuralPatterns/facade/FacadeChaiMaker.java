package structuralPatterns.facade;

public class FacadeChaiMaker {

	private final ChaiMaker chaiMaker;

	public FacadeChaiMaker(ChaiMaker chaiMaker) {
		this.chaiMaker = chaiMaker;
	}

	public void makeChai() {
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