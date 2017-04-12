package structuralPatterns.composite;

import java.util.List;

public abstract class HTMLTag {

	public void addChild(HTMLTag child) {
		throw new UnsupportedOperationException();
	}

	public void removeChild(HTMLTag child) {
		throw new UnsupportedOperationException();
	}

	public List<HTMLTag> getChildren() {
		throw new UnsupportedOperationException();
	}

	public void setBody(String body) {
		throw new UnsupportedOperationException();
	}

	public abstract String getName();

	public abstract void setBeginTag(String tag);

	public abstract void setEndTag(String tag);
	
	public abstract void printHTML();
}