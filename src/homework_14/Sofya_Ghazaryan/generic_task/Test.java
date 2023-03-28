package homework_14.Sofya_Ghazaryan.generic_task;

public class Test {
    public static void main(String[] args) {
        Stack_Generic<Integer> intStackGen = new Stack_Generic<>();
        intStackGen.push(1);
        intStackGen.push(2);
        intStackGen.push(3);
        intStackGen.push(4);
        intStackGen.push(5);
        intStackGen.push(6);

        int popItemInt = intStackGen.pop();
        System.out.println("The popped element is " + popItemInt);


        Stack_Generic<String> strStackGen = new Stack_Generic<>();
        strStackGen.push("String 1");
        strStackGen.push("String 2");
        strStackGen.push("String 3");
        strStackGen.push("String 4");

        String popItemStr = strStackGen.pop();
        System.out.println("The popped element is " + popItemStr);
    }
}
