package homework_9.TatevKocharyan.chapter12.annotationsHomework.error;


public class ErrorStorage {
    private final Error[] errors = new Error[10];
    int index = 0;

    public Error[] getErrors() {
        return errors;
    }

    public void addError(Error error) {
        errors[index++] = error;
    }

    @Override
    public String toString() {
        String errors = "";

        for (Error error : this.errors) {
            if (error != null) {

                errors += error.getMessage()+error.getFieldName();
            }
        }

        return "[" + errors+ "]";
    }
}
