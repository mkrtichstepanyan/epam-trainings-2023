package homework_11.Roza_Petrosyan.chapter_22.data_input_output_stream;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/chapter_22/data_input_output_stream/Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Can not open output file");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("/Users/user/Desktop/OptionalTasks/TaskOne/src/homework_11/Roza_Petrosyan/chapter_22/data_input_output_stream/Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " + d
                    + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Can not open input file");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
