package homework_7.Varsik_Pijoyan;

public class NameException extends RuntimeException{
    public String toString() {
        return "Please enter the right name: ([A-Z][a-z]+)";
    }
}
