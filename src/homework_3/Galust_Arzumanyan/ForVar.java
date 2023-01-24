package homework_3.Galust_Arzumanyan;


//This method is used to demonstrate parts of the for loop can be empty
class ForVar {
    public static void main(String[] args) {
        boolean done = false;
        int i = 0;
        for (; !done; ) {
            System.out.println(" i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
