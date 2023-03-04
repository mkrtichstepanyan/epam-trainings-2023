package homework_10.Radik_Manasyan.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("В теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехваченно");
        }
        procB();
        procC();
    }
}
