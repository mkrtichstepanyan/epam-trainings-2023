package homework_7.Hovhannes_Gspeyan.palmetto.exception;

public abstract class CheckedBaseException extends Exception{

    public CheckedBaseException(Error error){
        super(String.valueOf("error_code: " + error.getErrorCode() + ", error_message: " + error.getMessage()));
    }
}
