package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("Знaчeниe i в mc теперь равно " + mc.getI());
        mc.setI(19);
        System.out.println("Знaчeниe i в mc теперь равно " + mc.getI());
    }
}
