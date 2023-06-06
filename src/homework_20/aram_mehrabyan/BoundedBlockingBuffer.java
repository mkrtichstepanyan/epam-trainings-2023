package homework_20.aram_mehrabyan;

public class BoundedBlockingBuffer <T> {
    T data;
    boolean setFlag=false;
    synchronized T take()  {
        while(!setFlag)
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
            System.out.println("Value got: "+data);
        setFlag=false;
        notify();
        return data;

    }

    synchronized void put(T data)  {
        while(setFlag)
            try{
                wait();
            } catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
        this.data=data;
        setFlag=true;
        System.out.println("Value put: "+data);
        notify();
    }

}
