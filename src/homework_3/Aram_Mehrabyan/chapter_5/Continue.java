package homework_3.Aram_Mehrabyan.chapter_5;

public class Continue {
    public static  void  main(String []args){
        for(int i=0;i<100;i++){
            if(i==10)continue;
            System.out.println("i: "+i);
        }
        System.out.println("Loop complete.");
    }
}
