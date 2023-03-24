package homework_10.Radik_Manasyan.chapter10;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("Причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехваченно исключение: " + e);
            System.out.println("Первопричина:" + e.getCause());
        }
    }
}
