package homework_10.gevorg_arghushyan;

class FinallyExample {
    static void procA() {
        try {
            System.out.println("Внутри метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок finally метода procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("Внутри метода procB()");
            return;
        } finally {
            System.out.println("Блок finally метода procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("Внутри метода procC()");
            System.exit(0);
        } finally {
            System.out.println("Блок finally метода procC()");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено.");
        }
        procB();
        procC();
    }

}
