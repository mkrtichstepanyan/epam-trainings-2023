package homework_20.Ani_Kovalenko.using_sinc_keyword;

public class BoundedBlockingBuffer {

    private int num = 1;
    private boolean valueSet;

    synchronized void put (int inputValue){
        System.out.println("The start of put() method");
        while (valueSet){
            try {
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        num *= inputValue;
        valueSet = true;
        notify();
    }

    synchronized int pick(){
        System.out.println("The start of pick() method");
        while (!valueSet){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
        return num;
    }
}
