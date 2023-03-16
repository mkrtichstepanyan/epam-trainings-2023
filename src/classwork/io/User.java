package classwork.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class User implements Serializable, Externalizable {

    private long id;
    private String name;
    private Address address;
    public static int userObjectCount;
    public final String password ="abc";

    public User(long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public User (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        User user = new User(1,"Vahan",null);
        out.writeObject(user.name);
        out.writeObject(user.id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        String user = (String) in.readObject();
        System.out.println(user);

        long id = (long) in.readObject();
        System.out.println(id);
    }
}
