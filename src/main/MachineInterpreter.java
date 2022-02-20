package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	private Machine machine;
	private State state;

	public void run(Machine m) {
		machine = m;
		state = machine.getInitialState();
	}

	public State getCurrentState() {
		return state;
	}

	public void processEvent(String string) {

	}

	public int getInteger(String string) {
		return machine.getIntegers().get(string);
	}

}
