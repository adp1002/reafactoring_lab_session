package lanSimulation.internals;

public class WorkStation extends Node {

	public WorkStation(String name) {
		super(Node.WORKSTATION, name);
	}
	
	public WorkStation(String name, Node nextNode) {
		super(Node.WORKSTATION, name, nextNode);
	}

}
