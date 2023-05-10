package homework_20.Radik_Manasyan;

public class Put<T> implements Runnable {
    private MyGen myGen;

    public Put(MyGen val) {
        this.myGen = val;
        new Thread(this, "Put").start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myGen.put(myGen.getValue());
        }
    }
}
