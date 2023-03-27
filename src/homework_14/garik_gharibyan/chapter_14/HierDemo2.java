package homework_14.garik_gharibyan.chapter_14;
class NonGen1{
    int num;
    NonGen1(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Gen5<T> extends NonGen1{
    T ob;
    Gen5(T ob,int num){
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
public class HierDemo2 {
    public static void main(String[] args) {

        Gen5<String> strOb = new Gen5<>("Hello",47);
        System.out.print(strOb.ob + " ");
        System.out.print(strOb.num + " ");
    }
}
