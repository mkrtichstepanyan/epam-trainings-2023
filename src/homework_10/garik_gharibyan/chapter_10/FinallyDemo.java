package homework_10.garik_gharibyan.chapter_10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally procA");
        }
    }
    static void procB(){
        try {
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("finally procB");
        }
    }
    static void procC(){
        try {
            System.out.println("inside procC");
        }finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (RuntimeException e){
            System.out.println("procA Exception " + e);
        }
        procB();
        procC();

    }
}
