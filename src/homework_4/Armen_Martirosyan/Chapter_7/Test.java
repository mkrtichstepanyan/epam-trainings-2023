package homework_4.Armen_Martirosyan.Chapter_7;

public class Test {
    int a, b;

    public Test(int i, int j) {
        this.a = i;
        this.b = j;
    }

    boolean equalTo(Test o){
        if (o.a==a && o.b==b) {
            return true;
        }else{
            return false;
        }
    }
}
