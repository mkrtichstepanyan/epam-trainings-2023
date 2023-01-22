package homework_3.Inesa_Mkrtchyan.Tasks;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
            third:{
                System.out.println("Befor the break;");
                if(t) break second;
                System.out.println("This won't execute");
            }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block!");
        }
    }
}
