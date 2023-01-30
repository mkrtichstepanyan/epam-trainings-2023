package homework_4.Aram_Mehrabyan.chapter7;

public class PassArray {
    static  void vtest(int []v){
        System.out.print("Number of args: "+v.length+"Contents");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int []n1={10};
        int []n2={1,2,3};
        int []n3={};
        vtest(n1);
        vtest(n2);
        vtest(n3);
    }
}
