public class Kalkulator {

    public static DataSet dataSet1 = new DataSet();

    public static String clearAll() {
        dataSet1.setInputStarted(false);
        dataSet1.setOperationEntered(false);
        dataSet1.setComaEntered(false);
        dataSet1.setSignMinus(false);
        dataSet1.setFirstArgumentEntered(false);
        dataSet1.setSecondArgumentEntered(false);
        dataSet1.setFirstArg(0.0);
        dataSet1.setSecondArg(0.0);
        dataSet1.setInput("0");
        dataSet1.setTextToBeDisplayed("0");
        dataSet1.setError(false);
        return dataSet1.getTextToBeDisplayed();
    }

    public static String clearOne() {
        if (dataSet1.isError()) return dataSet1.getTextToBeDisplayed();
        if (dataSet1.isInputStarted()) {        // if input started "C" clears one digit of input string
            String a,b;
            a = dataSet1.getInput();
            if (a.length() > 1) {
                b = a.substring(0, a.length() - 1);
                if (a.endsWith(".")) {dataSet1.setComaEntered(false);}
                if (b.equals("-")) {
                    b = "0";
                    dataSet1.setInputStarted(false);
                }
            } else {
                b = "0";
                dataSet1.setInputStarted(false);
            }
            dataSet1.setInput(b);               // else clears input operation
            dataSet1.setTextToBeDisplayed(dataSet1.getInput());
        } else {
            dataSet1.setOperationEntered(false);
        }
        return dataSet1.getTextToBeDisplayed();
    }

    public static String calculate() {
        if (dataSet1.isError()) return dataSet1.getTextToBeDisplayed();

        dataSet1.setSecondArg(Double.valueOf(dataSet1.getInput()));
        dataSet1.setInputStarted(false);
        dataSet1.setComaEntered(false);
        dataSet1.setSignMinus(false);
        switch (dataSet1.getOperation()) {
            case 43: {
                dataSet1.setFirstArg(dataSet1.getFirstArg() + dataSet1.getSecondArg());
                break;
            }
            case 45: {
                dataSet1.setFirstArg(dataSet1.getFirstArg() - dataSet1.getSecondArg());
                break;
            }
            case 42: {
                dataSet1.setFirstArg(dataSet1.getFirstArg() * dataSet1.getSecondArg());
                break;
            }
            case 47: {
                if (dataSet1.getSecondArg() != 0) {
                    dataSet1.setFirstArg(dataSet1.getFirstArg() / dataSet1.getSecondArg());
                    break;
                } else dataSet1.setError(true);
                break;
            }
        }
        if (dataSet1.isError()) {
            dataSet1.setTextToBeDisplayed("Div.by zero");
        } else {
            dataSet1.setTextToBeDisplayed(dataSet1.getFirstArg().toString());
        }
        dataSet1.setOperationEntered(false);
        return dataSet1.getTextToBeDisplayed();
    }

    public static String signalOperation(int enteredKey) {
        if (dataSet1.isError()) return dataSet1.getTextToBeDisplayed();

        if (dataSet1.isOperationEntered()) {
                dataSet1.setTextToBeDisplayed(calculate());
        } else if (dataSet1.isInputStarted()){
            dataSet1.setFirstArg(Double.valueOf(dataSet1.getInput()));
            dataSet1.setInputStarted(false);
            dataSet1.setComaEntered(false);
            dataSet1.setSignMinus(false);
            dataSet1.setTextToBeDisplayed(dataSet1.getFirstArg().toString());
        }
        dataSet1.setOperation(enteredKey);
        dataSet1.setOperationEntered(true);

        return dataSet1.getTextToBeDisplayed();
    }


    public static String changeSign() {
        if (dataSet1.isError()) return dataSet1.getTextToBeDisplayed();
        if (dataSet1.isInputStarted()) {
            dataSet1.setSignMinus(!dataSet1.isSignMinus());
            String a;
            a = dataSet1.getInput();
            if (dataSet1.isSignMinus()) {
                dataSet1.setInput("-" + a);
            } else {
                dataSet1.setInput(a.substring(1));
            }
            dataSet1.setTextToBeDisplayed(dataSet1.getInput());
        }
        return dataSet1.getTextToBeDisplayed();
    }

    public static String signalComa() {
        if (!dataSet1.isError()  &&  !dataSet1.isComaEntered()) {
            if (dataSet1.isInputStarted()) {
                dataSet1.setInput(dataSet1.getInput() + ".");
            } else {
                dataSet1.setInput("0.");
                dataSet1.setInputStarted(true);
            }
            dataSet1.setComaEntered(true);
            dataSet1.setTextToBeDisplayed(dataSet1.getInput());
        }
        return dataSet1.getTextToBeDisplayed();
    }

    public static String signalDigit(int enteredKey) {

        if (dataSet1.isError()) return dataSet1.getTextToBeDisplayed();
        if (dataSet1.isInputStarted()) {
            if (dataSet1.getInput().length() < 13) {dataSet1.setInput(dataSet1.getInput() + (char) enteredKey); }
        } else {
            if (enteredKey != 48) {
                dataSet1.setInput("" + (char) enteredKey);
                dataSet1.setInputStarted(true);
            } else dataSet1.setInput("0");
        }
        dataSet1.setTextToBeDisplayed(dataSet1.getInput());

        return dataSet1.getTextToBeDisplayed();
    }

    public static void main(String[] args) {

    DataSet dataSet1 = new DataSet();
    clearAll();
    WorkWindow workWindow = new WorkWindow("0");
    }
}
