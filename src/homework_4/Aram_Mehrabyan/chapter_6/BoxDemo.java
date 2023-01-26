package homework_4.Aram_Mehrabyan.chapter_6;
class Box{
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public  static  void main(String []args){
        Box mybox=new Box();
        double vol;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        vol= mybox.width*mybox.height* mybox.depth;
        System.out.println("Volume is: "+vol);
    }


}
