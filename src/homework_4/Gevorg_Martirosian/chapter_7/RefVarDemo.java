package homework_4.Gevorg_Martirosian.chapter_7;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("i value in mc now equals: " + mc.getI());
        mc.setI(19);
        System.out.println("i value in mc now equals: " + mc.getI());
    }
}
