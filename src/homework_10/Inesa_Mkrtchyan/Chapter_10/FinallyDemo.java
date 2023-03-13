package homework_10.Inesa_Mkrtchyan.Chapter_10;

public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("Inside proc A");
        }finally{
            System.out.println("procA's finally");
        }
    }
    static void procB(){
        try{
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("procB's finnaly");
        }
    }
    static void procC(){
        try{
            System.out.println("inside procC");
        }finally {
            System.out.println("procC's finaly");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }


}
