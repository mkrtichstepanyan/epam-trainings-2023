package homework_20.Diana_Melkonyan;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BoundedBlockBuffer queue=new BoundedBlockBuffer();
        new Producer(queue);
        new Consumer(queue);
    }
}


