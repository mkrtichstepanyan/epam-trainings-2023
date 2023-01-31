package homework_4.Vardan_Mkrtchyan.chapter7;

public class OverloadConstructors {
    static class Box{
        double width;
        double depth;
        double height;
        Box(double w, double d, double h){
            width = w;
            depth = d;
            height = h;
        }
        Box(){
            width = -1;
            depth = -1;
            height = -1;
        }
        Box(double len){
            width = depth = height = len;
        }
        double volume(){
            return width * depth * height;
        }
    }

    public void main(String[] args) {
        Box b1 = new Box(1 , 2.5 ,3.5);
        Box b2 = new Box();
        Box b3 = new Box(2.5);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}
