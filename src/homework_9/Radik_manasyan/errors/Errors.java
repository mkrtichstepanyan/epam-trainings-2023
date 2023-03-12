package homework_9.Radik_manasyan.errors;

public class Errors {
    private final Error[] errors = new Error[10];
    private int errorIndex;

    public void addError(Error error) {
        if (error != null) {
            errors[errorIndex++] = error;
        }
    }


    @Override
    public String toString() {
        String errorsStr = "";

        for (Error error : errors) {
            if (error != null) {
                errorsStr += error.toString();
            } else {
                break;
            }
        }
        return errorsStr;
    }

}
