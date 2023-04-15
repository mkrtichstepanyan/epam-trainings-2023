package homework_16.Radik_Manasyan.chapter19;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        String number;
        FileInputStream fin = null;
        boolean change = false;

        try {
            fin = new FileInputStream("Phonebook.dat");
        } catch (FileNotFoundException e) {

        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        do {
            System.out.println("Enter new name" + " ('quit' to stop): ");
            name = br.readLine();
            if (name.equals("quit")) {
                continue;
            }

            System.out.println("Enter number: ");
            number = br.readLine();
            ht.setProperty(name, number);
            change = true;
        } while (!name.equals("quit"));

        if (change) {
            FileOutputStream fout = new FileOutputStream("Phonebook.dat");

            ht.store(fout, "Telephone Book");
            fout.close();
        }

        do {
            System.out.println("Enter name to find" + " ('quit' to quit): ");

            name = br.readLine();
            if (name.equals("quit")) {
                continue;
            }

            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("quit"));
    }
}
