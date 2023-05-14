package homework_20.Radik_Manasyan;

public class Take implements Runnable{
    private MyGen myGen;

    public Take(MyGen myGen) {
        this.myGen = myGen;
        new Thread(this, "Take").start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myGen.take();
        }
    }
}
