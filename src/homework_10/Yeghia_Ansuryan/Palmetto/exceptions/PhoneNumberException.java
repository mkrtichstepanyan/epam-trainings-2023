package homework_10.Yeghia_Ansuryan.Palmetto.exceptions;

public class PhoneNumberException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Phone number must be valid ! \nExample: +37444308304";
    }
}
