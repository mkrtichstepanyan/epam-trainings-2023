package homework_6.Aram_Mehrabyan.Chapter8;
class Box2{
    double width;
    double height;
    double depth;
    Box2(Box2 ob){
        width= ob.width;
        height=ob.height;
        depth= ob.depth;
    }
    Box2(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box2(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box2(double len){
        width=height=depth=len;
    }
    double volume(){

        return width*height*depth;
    }


}
class BoxWeight2 extends Box2{
    double weight;
    BoxWeight2(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    BoxWeight2(){
        super();
        weight=-1;
    }
    BoxWeight2(double len,double  m){
        super(len);
        weight=m;
    }
    BoxWeight2(BoxWeight2 ob){
        super(ob);
        weight=ob.weight;
    }

}
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 mybox1=new BoxWeight2(10,20,15,34.3);
        BoxWeight2 mybox2=new BoxWeight2(2,3,4,0.076);
        BoxWeight2 mybox3=new BoxWeight2();
        BoxWeight2 mycube=new BoxWeight2(3,2);
        BoxWeight2 myclone=new BoxWeight2(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        System.out.println("Weight of mybox1 is "+mybox1.weight);
        System.out.println();
        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        System.out.println("Weight of mybox2 is "+mybox2.weight);
        System.out.println();
        vol=mybox3.volume();
        System.out.println("Volume of mybox3 is "+vol);
        System.out.println("Weight of mybox3 is "+mybox3.weight);
        System.out.println();
        vol=myclone.volume();
        System.out.println("Volume of myclone is "+vol);
        System.out.println("Weight of myclone is "+myclone.weight);
        System.out.println();
        vol=mycube.volume();
        System.out.println("Volume of mycube is "+vol);
        System.out.println("Weight of mycube is "+mycube.weight);
        System.out.println();

    }
}
