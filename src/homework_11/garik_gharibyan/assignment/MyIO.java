package homework_11.garik_gharibyan.assignment;

import java.io.*;
import java.util.ArrayList;

public class MyIO {
    public static String readFile(String fileName) {

        ArrayList<Character> characters = new ArrayList<>();
        char[] chars = null;

        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));

            int i = bufferedInputStream.read();
            while (i != -1) {
                characters.add((char) i);
                i = bufferedInputStream.read();
            }

            chars = new char[characters.size()];
            for (int k = 0; k < characters.size(); k++) {
                chars[k] = characters.get(k);
            }
        } catch (IOException e) {
            System.err.print(e);
            System.exit(400);
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                System.err.print(e);
                System.exit(400);

            }
        }
        return new String(chars);
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void writFile(String fileName, String data) {

        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);

        } catch (IOException e) {
            System.err.println(e);
            System.exit(400);

        } finally {

            if (outputStream != null) {
                try {
                    outputStream.flush();
                } catch (IOException e) {
                    System.err.println(e);
                    System.exit(400);
                }
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.err.println(e);
                    System.exit(400);
                }
            }
        }
    }

    public static void writePhoneNumber(String[] phoneNumbers, String fileName) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));
            for (String phoneNumber : phoneNumbers) {
                byte[] bytes = phoneNumber.getBytes();
                try {
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.write("\n".getBytes());
                } catch (IOException e) {
                    System.err.println(e);
                    System.exit(400);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(400);

        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.flush();
                } catch (IOException e) {
                    System.err.println(e);
                    System.exit(400);
                }
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    System.err.println(e);
                    System.exit(400);
                }
            }
        }
    }
}
