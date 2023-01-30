package homework_4.Aram_Mehrabyan.chapter7;



public class OveloadCons {
    public static  void main(String []args){
        OverloadConsDemo mybox1=new OverloadConsDemo(10,20,15);
        OverloadConsDemo mybox2=new OverloadConsDemo();
        OverloadConsDemo mybox3=new OverloadConsDemo(7);
        OverloadConsDemo mybox4=new OverloadConsDemo(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume is: "+vol);
        vol=mybox2.volume();
        System.out.println("Volume is: "+vol);
        vol=mybox3.volume();
        System.out.println("Volume is: "+vol);
        vol=mybox4.volume();
        System.out.println("Volume is: "+vol);
    }
}
