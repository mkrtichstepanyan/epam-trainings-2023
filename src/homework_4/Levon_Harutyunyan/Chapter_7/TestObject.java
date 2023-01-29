package homework_4.Levon_Harutyunyan.Chapter_7;

public class TestObject {
    int a;
    int b;

    TestObject(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(TestObject o) {
        if (o.a == a && o.b == b) {
            return true;
        }
        else {
            return false;
        }
    }
}

class PassObject {
    public static void main(String[] args) {
        TestObject ob1 = new TestObject(100, 22);
        TestObject ob2 = new TestObject(100, 22);
        TestObject ob3 = new TestObject(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
