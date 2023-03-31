package homework_12.TatevKocharyan.chapter22;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error" + e);
        }


        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open output File");
        } catch (IOException e) {
            System.out.println("I/O Error" + e);
        }


    }
}

