package homework_10.Radik_Manasyan.imitationPersonRegister.myExceptions;

public class IncorrectPhoneNumber extends RuntimeException{
    @Override
    public String toString() {
        return "Input correct phone number (+374-77-12-34-56)";
    }
}
