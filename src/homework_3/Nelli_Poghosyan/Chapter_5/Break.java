package homework_3.Nelli_Poghosyan.Chapter_5;

    public class Break {
        public static void main(String[] args) {
            boolean t = true;

            first:
            {
                second:
                {
                    third:
                    {
                        System.out.println("Before the break.");
                        if (t) {
                            break second; //break out second block
                        }
                        System.out.println("This won't execute");
                    }
                }
                System.out.println("This is after second block");

            }
        }
    }

