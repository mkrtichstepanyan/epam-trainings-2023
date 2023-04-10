package homework_8.gevorg_arghushyan_chapter_9;

public class MyIFimp2 implements MyIF{
    @Override
    public int getNumber() {
        return 111;
    }

    @Override
    public String getString() {
        return "Another String";
    }

    public static void main(String[] args) {
        MyIFimp2 ob3 = new MyIFimp2();
        System.out.println(ob3.getNumber());
        System.out.println(ob3.getString());
    }
}
