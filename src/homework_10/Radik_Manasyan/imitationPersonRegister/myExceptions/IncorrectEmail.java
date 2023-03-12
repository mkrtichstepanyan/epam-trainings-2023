package homework_10.Radik_Manasyan.imitationPersonRegister.myExceptions;

public class IncorrectEmail extends RuntimeException {
    @Override
    public String toString() {
        return "please input correct email";
    }
}
