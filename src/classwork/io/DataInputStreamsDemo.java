package classwork.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamsDemo {

    public static void main(String args[]) throws IOException {
        // First, write the data.
        try (DataOutputStream dout =
                     new DataOutputStream(new FileOutputStream("Test.txt"))) {
            dout.writeDouble(98.6);
            dout.writeDouble(1.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
// Now, read the data back.
        try (DataInputStream din =
                     new DataInputStream(new FileInputStream("Test.txt"))) {

            double d = din.read();
            double i = din.readDouble();
            boolean b = din.readBoolean();
            System.out.println("Here are the values: " +
                    d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
