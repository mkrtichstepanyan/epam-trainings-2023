package homework_7.Karen_Mikayelyan;

public class ItemSizeOutOfBoundsException extends RuntimeException {
    ItemSizeOutOfBoundsException(){
        super("You can not add more than MAX_ITEM_AMOUNT items");
    }
}
