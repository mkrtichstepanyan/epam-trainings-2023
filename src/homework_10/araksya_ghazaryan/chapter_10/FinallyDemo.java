package homework_10.araksya_ghazaryan.chapter_10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Inside procA() ");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("procA`s finally");
        }
    }
    static void procB() {
        try {
            System.out.println("Inside procB() ");
            return;
        } finally {
            System.out.println("procB`s finally ");
        }
    }
    static void procC() {
        try {
            System.out.println("Inside procC() ");
        } finally {
            System.out.println("proc`C finally ");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}