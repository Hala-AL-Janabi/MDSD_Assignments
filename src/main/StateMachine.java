package main;

import main.metamodel.Machine;
import main.metamodel.Operation;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {

	private final List<State> states = new ArrayList<>();
	private Machine machine;
	private State state;
	private Transition transition;

	public Machine build() {
		return machine;
	}

	public StateMachine state(String string) {
		State state = new State();
		machine.getState(string);
		return this;
	}

	public StateMachine initial() {
		machine.getInitialState();
		return this;
	}

	public StateMachine when(String string) {
		Transition transition = new Transition(string);
		this.transition = transition;
		this.state.addTransition(transition);
		return this;
	}

	public StateMachine to(String string) {
		this.transition.setTarget(string);
		return this;
	}

	public StateMachine integer(String string) {
		state = states.get(states.size());
		return this;
	}

	public StateMachine set(String string, int i) {
		this.transition.setOperation(Operation.SET);
		this.transition.setOperationVariableName(string);
		this.transition.setOperationValue(i);
		return this;
	}

	public StateMachine increment(String string) {
		this.transition.setOperation(Operation.INCREMENT);
		this.transition.setOperationVariableName(string);
		return this;
	}

	public StateMachine decrement(String string) {
		this.transition.setOperation(Operation.DECREMENT);
		this.transition.setOperationVariableName(string);
		return this;
	}

	public StateMachine ifEquals(String string, int value) {
		transition.setConditionName(string);
		transition.setConditionComparedValue(value);
		transition.setConditionEqual(true);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int value) {
		transition.setConditionName(string);
		transition.setConditionComparedValue(value);
		transition.setConditionGreaterThan(true);
		return this;
	}

	public StateMachine ifLessThan(String string, int value) {
		transition.setConditionName(string);
		transition.setConditionComparedValue(value);
		transition.setConditionLessThan(true);
		return this;
	}
}
