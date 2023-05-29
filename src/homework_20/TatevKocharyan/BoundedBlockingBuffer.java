package homework_20.TatevKocharyan;

import java.util.ArrayList;

public class BoundedBlockingBuffer<T> {

    ArrayList<T> list = new ArrayList<>();
    boolean isPresent = false;

    synchronized public T take() {
        T takenValue = null;
        while (isPresent) {
            takenValue = list.get(0);
            System.out.println("taken :"+takenValue);
            isPresent =false;
            try {
                wait(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        return takenValue;

    }

    synchronized public void put(T value)  {
        while (!isPresent) {
            for (int i = 1; i <=10 ; i++) {
                list.add(value);
                System.out.println(i+". Put: "+ value);
                isPresent = true;
                try {
                    wait(200);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }


        }



    }


}
