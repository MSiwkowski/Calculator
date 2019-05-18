public class DataSet {

    private String input;
    private Double firstArg, secondArg;
    private int operation;

    private String textToBeDisplayed;

    boolean signMinus;
    boolean operationEntered;
    boolean firstArgumentEntered;
    boolean secondArgumentEntered;
    boolean inputStarted;
    boolean comaEntered;
    boolean error;

    public boolean isError() {
        return error;
    }

    public DataSet setError(boolean error) {
        this.error = error;
        return this;
    }

    public String getTextToBeDisplayed() {
        return textToBeDisplayed;
    }
    public DataSet setTextToBeDisplayed(String textToBeDisplayed) {
        this.textToBeDisplayed = textToBeDisplayed;
        return this;
    }
    public boolean isSignMinus() {
        return signMinus;
    }

    public DataSet setSignMinus(boolean signMinus) {
        this.signMinus = signMinus;
        return this;
    }

    public boolean isOperationEntered() {
        return operationEntered;
    }

    public DataSet setOperationEntered(boolean operationEntered) {
        this.operationEntered = operationEntered;
        return this;
    }

    public DataSet setFirstArgumentEntered(boolean firstArgumentEntered) {
        this.firstArgumentEntered = firstArgumentEntered;
        return this;
    }

    public DataSet setSecondArgumentEntered(boolean secondArgumentEntered) {
        this.secondArgumentEntered = secondArgumentEntered;
        return this;
    }

    public boolean isInputStarted() {
        return inputStarted;
    }

    public DataSet setInputStarted(boolean inputStarted) {
        this.inputStarted = inputStarted;
        return this;
    }

    public boolean isComaEntered() {
        return comaEntered;
    }

    public DataSet setComaEntered(boolean comaEntered) {
        this.comaEntered = comaEntered;
        return this;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public Double getFirstArg() {
        return firstArg;
    }

    public DataSet setFirstArg(Double firstArg) {
        this.firstArg = firstArg;
        return this;
    }

    public Double getSecondArg() {
        return secondArg;
    }

    public DataSet setSecondArg(Double secondArg) {
        this.secondArg = secondArg;
        return this;
    }

    public int getOperation() {
        return operation;
    }

    public DataSet setOperation(int operation) {
        this.operation = operation;
        return this;
    }

    public DataSet(){
        StringBuffer input = new StringBuffer();
        StringBuffer exponentInput = new StringBuffer();
        Double firstArg = 0.0, secondArg = 0.0;
        int signal, operation;
    }


}
