package homework_3.Liana_Gevorgyan.ControlStatements;

public class BreakLoop {
    public static void main(String[] args) {
for(int i=0; i<100; i++){
    if (i==10) break;//will terminate loop if i is 10
    System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
