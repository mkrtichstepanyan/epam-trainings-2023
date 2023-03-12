package homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions;

public class LatinNameException extends Exception {

    @Override
    public String toString() {
        return "The name must contain only latin characters and the first " +
                "character must be uppercase!\nExample: John";
    }
}
