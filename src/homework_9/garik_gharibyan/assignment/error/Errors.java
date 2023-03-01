package homework_9.garik_gharibyan.assignment.error;

public class Errors {
    int topIndex = 0;
    private final Error[] errors = new Error[8];

    public void addError(Error error) {
        errors[topIndex++] = error;
    }

    public Error[] getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        String allErrors = "";

        for (Error error:errors) {
            if (error !=null){
                allErrors = allErrors + error + "\n";
            }
        }

        return  allErrors ;
    }
}
