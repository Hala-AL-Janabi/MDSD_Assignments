package main.metamodel;

import java.util.List;
import java.util.Map;

public class Machine {
	private final List<State> states;
	private final State initialState;
	private State state;
	private Map<String, Integer> integers;

	public Machine(List<State> states, State initialState, Map<String, Integer> integers) {
		this.states = states;
		this.initialState = initialState;
		this.integers = integers;
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		return states.stream().filter((a) -> a.getName() == string).findFirst().orElseThrow();
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		return integers.get(string) != null;
	}
	public Map<String, Integer> getIntegers() {
		return integers;
	}
}
