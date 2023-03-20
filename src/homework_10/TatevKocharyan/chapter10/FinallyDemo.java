package homework_10.TatevKocharyan.chapter10;

public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("procA's finally");
        }
    }
    static void procB(){
        try {
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("procB's finnaly");
        }

    }

    static void procC(){
        try {
            System.out.println("inside procB");
        }finally {
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Exeption caught");
            System.out.println(e.getMessage());
        }
        procB();
        procC();

    }
}