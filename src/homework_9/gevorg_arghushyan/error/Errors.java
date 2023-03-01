package homework_9.gevorg_arghushyan.error;

public class Errors {

    private final java.lang.Error[] errors = new java.lang.Error[10];
    private int index = 0;

    public void addError(java.lang.Error error) {
        errors[index++] = error;
    }

    public java.lang.Error[] getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        String errors = "";

        for (java.lang.Error error : this.errors) {
            if (error != null) {
                errors += error.toString();
            }
        }
        return "[" + errors + "]";
    }
}
