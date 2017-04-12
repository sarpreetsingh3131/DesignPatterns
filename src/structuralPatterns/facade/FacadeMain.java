package structuralPatterns.facade;

public class FacadeMain {

	public static void main(String[] args) {
		FacadeChaiMaker facadeChaiMaker = new FacadeChaiMaker(new ChaiMaker());
		facadeChaiMaker.makeChai();
	}
}