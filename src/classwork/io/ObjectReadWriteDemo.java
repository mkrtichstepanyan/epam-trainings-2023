package classwork.io;

import homework_8.TatevKocharyan.interfaces.nestedClass.A;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectReadWriteDemo {

    public static void main(String[] args) {
        Address address = new Address("NL","Utrecht","",2);
        User user = new User(1,"Levon", address);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("MyUser.txt"))){
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setName("Melo");
        User.userObjectCount = 123123;

        System.out.println(user);

        ObjectInputStream objectInputStream  = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("MyUser.txt"));
            User user1 = (User)objectInputStream.readObject();
            System.out.println(user1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
