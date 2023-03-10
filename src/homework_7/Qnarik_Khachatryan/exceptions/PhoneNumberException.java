package homework_7.Qnarik_Khachatryan.exceptions;

//checked exception
public class PhoneNumberException extends Exception {
    public PhoneNumberException() {
        super("Please provide correct format of phone number");
    }
}
