package homework_10.Yeghia_Ansuryan.Palmetto.myExceptions;

public class LatinNameException extends RuntimeException {


    @Override
    public String getMessage() {
        return "The name must contain only latin characters and first "
                + "character must be uppercase ! \nExample: Jennifer Lopez";
    }
}
