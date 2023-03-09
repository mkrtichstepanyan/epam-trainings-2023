package homework_11.Roza_Petrosyan.chapter_22.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("src/homework_11/Roza_Petrosyan/chapter_22/serialization/serial"))) {
            MyClass object1 = new MyClass("Hello", -17, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("src/homework_11/Roza_Petrosyan/chapter_22/serialization/serial"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization");
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("src/homework_11/Roza_Petrosyan/chapter_22/serialization/serial"))) {
            ObjectInputFilter myFilter = ObjectInputFilter.Config.createFilter("MyClass;!*");
            objIStrm.setObjectInputFilter(myFilter);
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization");
        }
    }
}
