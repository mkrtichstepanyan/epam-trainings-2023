package homework_4.Galust_Arzumanyan.homework_4_1.chapter_7;


// This method is used to demonstrate returning an object
class Test3 {
    int a;

    Test3(int i) {
        a = i;
    }

    Test3 incrbyTen() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String[] args) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;
        ob2 = ob1.incrbyTen();
        System.out.println(" ob1.a: " + ob1.a);
        System.out.println(" ob2.a: " + ob2.a);
        ob2 = ob2.incrbyTen();
        System.out.println(" ob2.a after second increase: " + ob2.a);
    }
}