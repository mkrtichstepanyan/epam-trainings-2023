package homework_3.Aram_Mehrabyan.chapter_5;

public class Search {
    public static void main(String[]args){
        int []nums={6,8,3,7,5,2,1,4};
        int val=5;
        boolean found=false;
        for(int x:nums){
            if(x==val)
                found=true;
            break;
        }
      if(found)
          System.out.println("Value found!");
    }
}
