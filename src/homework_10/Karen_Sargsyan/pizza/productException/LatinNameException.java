package homework_10.Karen_Sargsyan.pizza.productException;

public class LatinNameException extends RuntimeException{
    public String getMessage() {
        return "The name contain only latin characters and first "
                + "character must be uppercase ! \nExample: Karen Sargsyan";
    }

}
