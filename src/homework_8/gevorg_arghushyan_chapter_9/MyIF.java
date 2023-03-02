package homework_8.gevorg_arghushyan_chapter_9;

public interface MyIF {
    int getNumber ();
    default String getString(){
        return "Standard string";
    }

}
