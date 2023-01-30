package homework_4.Gevorg_Martirosian.chapter_7;

public class Box {
    double width;
    double height;
    double depth;

    //constructor, which used when all dimensions are defined
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //constructor, which accepted Box type objects
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor, which used when dimensions aren't defined
    Box(){
        width = -1;         //use -1 for designation
        height = -1;        //uninitialised
        depth = -1;         //box object
    }

    //constructor which used when cube object created
    Box(double len){
        width = height = depth = len;
    }

    //calculate and return volume
    double volume(){
        return width * height * depth;
    }
}
