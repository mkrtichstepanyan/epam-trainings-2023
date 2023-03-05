package homework_7.Hovhannes_Gspeyan.palmetto.exception;

public enum Error {

    INVALID_NAME(400,"Please provide correct format for name! "),
    INVALID_PHONE_NUMBER(401,"Please provide correct format for phone number! "),
    MENU_ITEM_IS_EMPTY(402, "Menu item is empty! "),
    INVALID_ITEM_RANGE(4021,"Please remove index, it does not exist in items! " ),
    INVALID_NUMBER_OF_PIZZAS(403,"You can't order more than 10 same pizzas! " ),
    MAX_INGREDIENT_QUANTITY(404, "The pizza is already full! You cannot add more ingredients! "),
    INGREDIENT_DUPLICATION(4041,"You can not add the same ingredient twice! " );

    private final String message;
    private final int errorCode;
    Error(int errorCode, String message ) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
