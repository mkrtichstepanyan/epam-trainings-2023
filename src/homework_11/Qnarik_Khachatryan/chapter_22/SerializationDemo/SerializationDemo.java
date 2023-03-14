package homework_11.Qnarik_Khachatryan.chapter_22.SerializationDemo;

import java.io.*;

class SerializationDemo {
    public static void main(String[] args) {
        //Object serialization

        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/files/serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        //Object deserialization

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/files/serial"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during serialization: " + e);
        }
    }
}
