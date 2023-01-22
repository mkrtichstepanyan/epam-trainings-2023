package homework_3.shushanik_araqelyan;

public class BreakErr {
public static void main(String [] args){
    one :
    for (int i = 0; i < 3; i++) {
        System.out.print("Pass " + i + " :");
    }
    for (int j = 0; j < 100; j++) {
        if(j == 10)break  ;// WRONG
        System.out.println(j + " ");
    }

    }
}
