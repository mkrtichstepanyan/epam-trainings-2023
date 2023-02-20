package homework_4_1;

class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1(15);
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}
