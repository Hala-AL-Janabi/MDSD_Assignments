package main.metamodel;

public class Transition {

	private String event;
	private State target;
	private Operation operation;
	private boolean incrementOperation;
	private boolean decrementOperation;
	private boolean setOperation;
	private Object operationVariableName;
	private Object conditionName;
	private Integer operationValue;
	private boolean conditionEqual;
	private Integer conditionValue;
	private boolean conditionGreaterThan;
	private boolean conditionLessThan;

	public Transition(String string) {
		return;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return setOperation;
	}

	public boolean hasIncrementOperation() {
		return incrementOperation;
	}

	public boolean hasDecrementOperation() {
		return decrementOperation;
	}

	public Object getOperationVariableName() {
		return conditionName;
	}

	public boolean isConditional() {
		return conditionValue != null;
	}

	public Object getConditionVariableName() {
		return conditionName;
	}

	public Integer getConditionComparedValue() {
		return conditionValue;
	}

	public boolean isConditionEqual() {
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		return conditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		return conditionLessThan;
	}

	public boolean hasOperation() {
		return setOperation || incrementOperation || decrementOperation;
	}

	public void setTarget(String string) {
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public void setOperationVariableName(String operationVariableName) {
		this.operationVariableName = operationVariableName;
	}
	public void setOperationValue(int operationValue) {
		this.operationValue = operationValue;
	}
	public void setConditionName(Object conditionName) {
		this.conditionName = conditionName;
	}
	public void setConditionComparedValue(int conditionValue) {
		this.conditionValue = conditionValue;
	}
	public void setConditionEqual(boolean conditionEqual) {
		this.conditionEqual = conditionEqual;
	}

	public void setConditionGreaterThan(boolean conditionGreaterThan) {
		this.conditionGreaterThan = conditionGreaterThan;
	}

	public void setConditionLessThan(boolean conditionLessThan) {
		this.conditionLessThan = conditionLessThan;
	}
}
