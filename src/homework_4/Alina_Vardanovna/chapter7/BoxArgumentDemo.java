package homework_4.Alina_Vardanovna.chapter7;

import homework.javabook.chapter6.Box;

public class BoxArgumentDemo {

    public static void main(String[] args) {

        BoxArgument boxArgument = new BoxArgument();
        Box myBox = new Box(1, 2, 3);
        boxArgument.printBoxDim(myBox);
        Box myBox2 = new Box(2, 3, 3);
        System.out.println(myBox.equalTo(myBox2));
    }
}
