package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String name) {
		super(Node.PRINTER, name);
	}
	
	public Printer(String name, Node nextNode) {
		super(Node.PRINTER, name, nextNode);
	}

}
