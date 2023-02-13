package homework_6.Aram_Mehrabyan.Chapter8;
class Box1{
    double width;
    double height;
    double depth;
    Box1(Box ob){
        width= ob.width;
        height=ob.height;
        depth= ob.depth;
    }
    Box1(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box1(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box1(double len){
        width=height=depth=len;
    }
    double volume(){

        return width*height*depth;
    }


}
class BoxWeight1 extends Box1{
    double weight;
    BoxWeight1(double w,double h,double d,double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight1 boxWeight1=new BoxWeight1(3,5,7,8.37);
        Box1 plainbox=new Box1();
        double vol;
        vol= boxWeight1.volume();
        System.out.println("Volume of  boxWeight1 is "+vol);
        System.out.println("Weight of  boxWeight1 is "+ boxWeight1.weight);
        plainbox=boxWeight1;
        vol= plainbox.volume();
        System.out.println("Volume of  plainbox is "+vol);
       // System.out.println("Weight of  plainbox is "+ plainbox.weight);
    }
}
