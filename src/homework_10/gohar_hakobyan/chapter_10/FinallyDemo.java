package homework_10.gohar_hakobyan.chapter_10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Inside method A ");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("procA's finally ");
        }
    }

    static void procB() {
        try {
            System.out.println("Inside method procB ");
            return;
        } finally {
            System.out.println("procA's finally ");
        }
    }

    static void procC() {
        try {
            System.out.println("Inside method procC ");
            return;
        } finally {
            System.out.println("procC's finally ");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception chaught");
        }
        procB();
        procC();
    }
}
