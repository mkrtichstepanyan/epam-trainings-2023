package homework_6.Aram_Mehrabyan.Chapter8;
class Box3{
    double width;
    double height;
    double depth;
    Box3(Box3 ob){
        width= ob.width;
        height=ob.height;
        depth= ob.depth;
    }
    Box3(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box3(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box3(double len){
        width=height=depth=len;
    }
    double volume(){

        return width*height*depth;
    }


}
class BoxWeight3 extends Box3{
    double weight;
    BoxWeight3(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    BoxWeight3(){
        super();
        weight=-1;
    }
    BoxWeight3(double len,double  m){
        super(len);
        weight=m;
    }
    BoxWeight3(BoxWeight3 ob){
        super(ob);
        weight=ob.weight;
    }

}

class Shipment extends BoxWeight3{
    double cost;
    Shipment(double w,double h,double d,double m,double c){
        super(w,h,d,m);
        cost=c;
    }
    Shipment(){
        super();
        cost=-1;
    }
    Shipment(double len,double  m,double c){
        super(len,m);
        cost=c;
    }
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }

}
public class DemoShipment {
    public static void main(String[] args) {
        double vol;
        Shipment shipment1=new Shipment(10,20,15,10,3.41);
        Shipment  shipment2=new  Shipment (2,3,4,0.76,1.28);
        vol=shipment1.volume();
        System.out.println("Volume of shipment1  is "+vol);
        System.out.println("Weight of shipment1 is "+shipment1.weight);
        System.out.println("Cost of shipment1 $ is "+shipment1.cost);
        System.out.println();
        vol=shipment2.volume();
        System.out.println("Volume of shipment2 is "+vol);
        System.out.println("Weight of shipment2 is "+shipment2.weight);
        System.out.println("Cost of shipment2 $ is "+shipment2.cost);
        System.out.println();
    }
}
