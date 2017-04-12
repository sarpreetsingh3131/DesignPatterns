package structuralPatterns.composite;

public class Main {

	public static void main(String[] args) {
		HTMLTag parent = new HTMLParent("<html>");
		parent.setBeginTag("<html>");
		parent.setEndTag("</html>");
		
		HTMLTag subParent = new HTMLParent("<body>");
		subParent.setBeginTag("<body>");
		subParent.setEndTag("</body>");
		
		parent.addChild(subParent);
		
		HTMLTag child = new HTMLElement("<h1>");
		child.setBeginTag("<h1>");
		child.setEndTag("</h1>");
		child.setBody("Heading 1");
		subParent.addChild(child);
		
		child = new HTMLElement("<h2>");
		child.setBeginTag("<h2>");
		child.setEndTag("</h2>");
		child.setBody("Heading 2");
		subParent.addChild(child);
		
		parent.printHTML();
	}
}