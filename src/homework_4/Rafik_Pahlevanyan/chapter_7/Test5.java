package homework_4.Rafik_Pahlevanyan.chapter_7;

/*
    This program demonstrates the difference between
    public and private
 */
public class Test5 {
    int a; //default access
    public int b; //public access
    private int c; //private access

    //method to access c
    void setC(int i) { //set c`s value
        c = i;
    }

    int getC() { //get c`s value
        return c;
    }

}
