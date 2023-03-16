package homework_11.garik_gharibyan.chapter_22.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        File file = new File("src/homework_11/garik_gharibyan/chapter_22/serialization/serial.txt");

        try (ObjectOutputStream objOUS = new ObjectOutputStream(new FileOutputStream(file))) {
            MyClass myClass1 = new MyClass("hello", -7, 2.5e43);
            System.out.println("myClass1: " + myClass1);
            objOUS.writeObject(myClass1);

        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try (ObjectInputStream objIS = new ObjectInputStream(new FileInputStream(file))) {
            MyClass myClass2;
            myClass2 = (MyClass) objIS.readObject();
            System.out.println("myClass2: " + myClass2);

        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }

        try (ObjectInputStream objIS2 = new ObjectInputStream(new FileInputStream(file))) {

            ObjectInputFilter myFilter = ObjectInputFilter.Config.createFilter("MyClass");
            objIS2.setObjectInputFilter(myFilter);

            MyClass myClass3;
            myClass3 =(MyClass) objIS2.readObject();
            System.out.println("myClass2: " + myClass3);


        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }
}
