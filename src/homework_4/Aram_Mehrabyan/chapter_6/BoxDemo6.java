package homework_4.Aram_Mehrabyan.chapter_6;
class Box6{
    double width;
    double height;
    double depth;
    Box6(){
        System.out.println("Constructing box");
        width=10;
        height=10;
        depth=10;
    }
    double volume(){

        return width*height*depth;
    }


}
public class BoxDemo6 {
    public static  void main(String []args){
        Box6 mybox1=new Box6();
        Box6 mybox2=new Box6();
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume is: "+vol);
        vol=mybox2.volume();
        System.out.println("Volume is: "+vol);
    }
}
