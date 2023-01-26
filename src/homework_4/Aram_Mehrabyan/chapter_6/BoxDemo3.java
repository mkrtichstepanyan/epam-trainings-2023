package homework_4.Aram_Mehrabyan.chapter_6;

class Box3{
    double width;
    double height;
    double depth;
    void volume(){
        System.out.print("Volume is: ");
        System.out.println(width*height*depth);
    }

}
public class BoxDemo3 {
    public static  void main(String []args){
        Box3 mybox1=new Box3();
        Box3 mybox2=new Box3();
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        mybox1.volume();
        mybox2.volume();
    }
}
