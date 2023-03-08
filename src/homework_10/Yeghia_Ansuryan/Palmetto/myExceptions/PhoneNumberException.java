package homework_10.Yeghia_Ansuryan.Palmetto.myExceptions;

public class PhoneNumberException extends Exception {
    @Override
    public String toString() {
        return "Phone number must be valid ! \nExample: +37444308304";
    }
}
