package homework_9.Ani_Barseghyan.error;

public class Errors {
    private Error[] errors = new Error[10];
    private int index = 0;


    public void addError(Error error) {
        errors[index++] = error;
    }

    public Error[] getErrors() {
        return errors;
    }

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
