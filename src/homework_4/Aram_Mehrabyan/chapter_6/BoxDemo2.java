package homework_4.Aram_Mehrabyan.chapter_6;

class Box1{
    double width;
    double height;
    double depth;

}
public class BoxDemo2 {
    public  static  void main(String []atgs){
        Box1 mybox1=new Box1();
        Box1 mybox2=new Box1();
        double vol;
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
     vol=mybox1.width*mybox1.height*mybox1.depth;
  System.out.println("The volume is: "+vol);
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        vol=mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("The volume is: "+vol);

    }
}
