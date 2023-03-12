package homework_11.Karen_Sargsyan.chapter_22.serialization_demo;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream onjOStrm =
                     new ObjectOutputStream(new FileOutputStream("serial"))) {
            homework_11.Karen_Sargsyan.chapter_22.serialization_demo.MyClass object1 =
                    new homework_11.Karen_Sargsyan.chapter_22.serialization_demo.MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            onjOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try (ObjectInputStream objIStrm =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }

}
