package homework_3.Aram_Mehrabyan.chapter_5;

public class BreakErr {
    public static  void  main(String []args){
        one:for(int i=0;i<3;i++){
            if(i==10)break;
            System.out.println("Pass "+i+": ");
        }
        for(int j=0;j<10;j++){
            //if(j==10)break one;
            System.out.println(j+" ");
        }

    }
}
