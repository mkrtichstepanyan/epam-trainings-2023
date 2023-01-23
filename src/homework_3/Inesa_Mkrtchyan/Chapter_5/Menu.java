package homework_3.Inesa_Mkrtchyan.Chapter_5;

public class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Help on: ");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3.While");
            System.out.println("4.do-while");
            System.out.println("5.for \n");
            System.out.println("Choose one: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("The is:\n");
                System.out.println("if(condition) statment;");
                System.out.println("else statment;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("Switch(expression) {");
                System.out.println("case constant:");
                System.out.println("statment sequence");
                System.out.println("break;");
                System.out.println("// . . . ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while \n");
                System.out.println("while(condition)statment;");
                break;
            case '4':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println("statement; ");
                System.out.println("} while(condition);");
                break;
            case 5:
                System.out.println("The for: \n");
                System.out.println("for(init; condition; iteration");
                System.out.println("statment");
                break;
        }
    }
}

