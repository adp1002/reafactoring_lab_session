package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String name) {
		super(Node.PRINTER, name);
	}
	
	public Printer(String name, Node nextNode) {
		super(Node.PRINTER, name, nextNode);
	}
	@Override
	public void printOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
	@Override
	public void printHTMLOn(StringBuffer buf) {
		buf.append("\n\t<LI> ");
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
		buf.append(" </LI>");
	}
	@Override
	public void printXMLOn(StringBuffer buf) {
		buf.append("\n\t");
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}

}
