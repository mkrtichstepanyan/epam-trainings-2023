package homework_20.araksya_ghazaryan;

public class Producer implements Runnable{
    BoundedBlockBuffer buffer;

    public Producer(BoundedBlockBuffer buffer){
        this.buffer = buffer;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run() {
        Integer i = 1;
        while (true){
            buffer.put(i++);
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}