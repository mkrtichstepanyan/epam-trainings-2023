package homework_9.gohar_hakobyan.error;

public class Errors {

    private static final int DEFAULT_SIZE = 10;
    private Error[] errors;
    private int index = 0;
    private int size;

    //Default constructor
    public Errors() {
        this.size = DEFAULT_SIZE;
        errors = new Error[this.size];
    }

    public void addError(Error error) {
        errors[index++] = error;
        if (index > 0.75 * size) {
            extendCapacity();
        }
    }


    private void extendCapacity() {
        Error[] newError = new Error[2 * errors.length];
        if (size >= 0) {
            System.arraycopy(errors, 0, newError, 0, index + 1);
        }
        errors = newError;
        size *= 2;
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
