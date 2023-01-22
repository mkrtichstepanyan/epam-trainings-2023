package homework_3.shushanik_araqelyan;

public class MissingBreak {
public static void main(String [] args) {
    int i;
    for (i = 0; i < 12; i++) ;
    switch (i) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println(" i is less then 5");
            break;
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            System.out.println("i is less then 10");
            break;
        default:
            System.out.println("i is 10 or more");

    }
}
}
