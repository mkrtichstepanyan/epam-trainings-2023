package homework_9.araksya.ghazaryan.chapter_12;

import java.sql.SQLOutput;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants: ");

        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
            System.out.println();
        }
            ap = Apple.valueOf("Winesap");
            System.out.println("ap contains " + ap);
        }
    }