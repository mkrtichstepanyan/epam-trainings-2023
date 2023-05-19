package homework_20.Radik_Manasyan;

public class Main {
    public static void main(String[] args) {
        MyGen<String> myGen = new MyGen<>("VALUE");
        new Put(myGen);
        new Take(myGen);
    }
}
