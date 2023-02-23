//A simple package
package homework_8.rafik_pahlevanyan.chapter_9.mypack;

/*
    Now, the Balance class , its constructor, and its
    show() method are public. This means that they can be used
    by non-subclass code outside their package.
 */
public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print("--->");
        System.out.println(name + ": $" + bal);
    }
}