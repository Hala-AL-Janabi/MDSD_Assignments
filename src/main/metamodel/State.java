package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {

	private String stateName;
	private List<Transition> transitions = new ArrayList<>();

	public Object getName() {
		return stateName;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public void addTransition(Transition transition){
		this.transitions.add(transition);
	}

	public Transition getTransitionByEvent(String string) {
		return transitions.stream().filter(transition -> transition.getEvent() == string).findFirst().orElseThrow();
	}

}
