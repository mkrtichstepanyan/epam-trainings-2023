package homework_1.Ruzanna_Marutyan;
//Demonstrate boolean values.
class BoolTest {
    public static void main (String args[]){
        boolean b;

        b=false;
        System.out.println("b is "+b);
        b=true;
        System.out.println("b is " + b);

        //a boolean value can control the if statement
        if(b) System.out.println("This is executed.");
        b=false;
        if(b) System.out.println("This is not executed.");

        //outcome of a relational operation is a boolean value
        System.out.println("10 > 9 is "+ (10 > 9));
        System.out.println(9== 9);
        System.out.println(10 < 9);

    }
}
