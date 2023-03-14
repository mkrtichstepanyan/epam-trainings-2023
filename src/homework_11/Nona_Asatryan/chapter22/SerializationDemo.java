package homework_11.Nona_Asatryan.chapter22;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objOStream =
                     new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization:" + e);
        }

        try (ObjectInputStream objIStream =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization" + e);
        }
    }
}
