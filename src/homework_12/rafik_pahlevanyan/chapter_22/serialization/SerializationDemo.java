package homework_12.rafik_pahlevanyan.chapter_22.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\serialization\\serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 7e10);
            System.out.println("object1: " + object1);
            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\serialization\\serial"))) {
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}