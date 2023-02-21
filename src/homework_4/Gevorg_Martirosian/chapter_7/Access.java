package homework_4.Gevorg_Martirosian.chapter_7;

public class Access {
    int a;              //standard access
    public int b;       //open access
    private int c;      //closed access

    //methods for access to c
    void setc(int i){   //setting value of c
        c = i;
    }

    int getc(){         //getting value c
        return c;
    }
}
