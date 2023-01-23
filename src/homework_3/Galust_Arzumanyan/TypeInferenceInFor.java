package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate type inference in a for loop
class TypeInferenceInFor {
    public static void main(String[] args) {

// Use type inference with the loop control variable
        System.out.println(" Values of x: ");
        for (var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");

            System.out.println();

            // Use type inference with the iteration variable
            int[] num = {1, 2, 3, 4, 5, 6};
            System.out.print(" Values in num array: ");
            for (var v : num) {
                System.out.print(v + " ");

                System.out.println();
            }
        }
    }
}
