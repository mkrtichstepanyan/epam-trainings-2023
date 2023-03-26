package homework_14.Yeghia_Ansuryan.chapter_14.overridingMethodsGenericClass;

public class Gen <T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        System.out.print("Gen`s getOb(): " );
        return ob;
    }
}
