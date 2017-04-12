package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HTMLParent extends HTMLTag {

	private String name;
	private String beginTag;
	private String endTag;
	private List<HTMLTag> children;

	public HTMLParent(String name) {
		this.name = name;
		beginTag = "";
		endTag = "";
		children = new ArrayList<HTMLTag>();
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
	public void printHTML() {
		System.out.println(beginTag);
		for(HTMLTag tag: children)
			tag.printHTML();
		System.out.println(endTag);
	}
	
	@Override
	public void addChild(HTMLTag child) {
		children.add(child);
	}
	
	@Override
	public void removeChild(HTMLTag child) {
		children.remove(child);
	}
	
	@Override
	public List<HTMLTag> getChildren() {
		return children;
	}
}