package homework_3.Ani_Kovalenko.Chapter_5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {2,5,1,58,6,9,54,25,5};
        int val = 6;
        boolean found;
        for(int x : nums){
            if(x == val)
                found = true;
            break;
        }
        System.out.println(" The number is found");
    }
}
