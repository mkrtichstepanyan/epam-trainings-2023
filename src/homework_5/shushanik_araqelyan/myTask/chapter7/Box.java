package homework_5.shushanik_araqelyan.myTask.chapter7;

public  class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    width=-1;
    height=-1;
    depth=-1;
}
Box( double len) {
    width = height = depth = len;
}


    double volume(){
        return width * height * depth;
    }
}

    public static class Overloadcons2 {
        public static void main(String[] args) {
            Box mybox1= new Box(10,20,15);
            Box mybox2= new Box();
            Box mycube= new Box(7);
            Box myclone=new Box(mybox1);
            double vol;
            vol=mybox1.volume();
            System.out.println("Volume of mybox1 is" + vol);
            vol=mybox2.volume();
            System.out.println("Volume of cube is" + vol);
            vol=myclone.volume();
            System.out.println("Volume of clone is "+ vol);
        }

    }

    public static class OverloadCons {
        public static void main(String[] args) {
            Box mybox1=new Box(10,20,15);
            Box mybox2=new Box();
            Box mycube=new Box(7);
            double vol;
            vol= mybox1.volume();
            System.out.println("Volume of mybox1 is" + vol);
    vol=mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);
            vol=mycube.volume();
            System.out.println("Volume of mycube is " + vol);
        }
    }
}

