package homework_4.Alina_Vardanovna.chapter6;

public class BoxDemo {

    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 40);

        double vol = box1.volume();
        System.out.println(vol * 2);

        Box box2 = new Box(4, 2, 3);

        System.out.println(box2.volume());

        Box box = new Box(1, 2, 3);
//      box.warranty = 2;
//      Այսպես չենք կարող գրել ու փոխել, որովհետև final ենք դրել:
        System.out.println(box.WARRANTY_YEAR);


        final Box MyBox = new Box(1, 2, 3);
        MyBox.depth = 7;
        Box MyBox1 = MyBox;

    }
}
