package homework_8.gevorg_arghushyan_chapter_9;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("Callback() with " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces\n" +
                            "may also define other members");
    }
}
