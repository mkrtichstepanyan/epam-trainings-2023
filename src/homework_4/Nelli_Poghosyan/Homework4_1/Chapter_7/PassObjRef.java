package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15 , 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
