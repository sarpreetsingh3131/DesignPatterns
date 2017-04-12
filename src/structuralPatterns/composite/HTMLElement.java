package structuralPatterns.composite;

public class HTMLElement extends HTMLTag {

	private String name;
	private String beginTag;
	private String endTag;
	private String body;

	public HTMLElement(String name) {
		this.name = name;
		beginTag = "";
		endTag = "";
		body = "";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setBeginTag(String tag) {
		beginTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		endTag = tag;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public void printHTML() {
		System.out.println(beginTag + body + endTag);
	}
}