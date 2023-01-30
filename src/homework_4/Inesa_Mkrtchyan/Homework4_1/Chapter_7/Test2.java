package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class Test2 {
    int a;
    Test2(int i){
        a = i;
    }

    Test2 incrByTen(){
        Test2 temp = new Test2(a+10);
        return temp;
    }

}
