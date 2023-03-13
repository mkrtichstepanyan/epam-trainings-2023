package homework_9.Roza_Petrosyan.annotation_task.error;

public class Errors {
    private  Error[] errors;
    private int index = 0;

    public void addError(Error error) {
        Error[] temp = new Error[++index];
        temp[index - 1] = error;

        if (errors != null) {
            System.arraycopy(errors, 0, temp, 0, errors.length);
        }

        errors = temp;
    }

    public Error[] getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        String errors = "";

        for (Error error : this.errors) {
            if (error != null) {

                errors += error.toString();
            }
        }

        return "[" + errors + "]";
    }
}
