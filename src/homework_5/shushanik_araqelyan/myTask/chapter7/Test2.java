package homework_5.shushanik_araqelyan.myTask.chapter7;

import homework_5.shushanik_araqelyan.chapter7.Test;

public class Test2 {
    int a;
    Test2(int i){
        a=i;
    }
    Test incriByTen(){
       Test temp= new Test(a+10 );
        return temp;

    }
}
