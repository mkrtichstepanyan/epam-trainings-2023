package homework_4.Aram_Mehrabyan.chapter7;

public class OverloadConsDemo {
    double width;
    double height;
    double depth;
    OverloadConsDemo(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    OverloadConsDemo(){
        width=-1;
        height=-1;
        depth=-1;
    }
    OverloadConsDemo( double len){
        width=height=depth=len;
    }
    OverloadConsDemo(OverloadConsDemo ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    double volume(){

        return width*height*depth;
    }


}

