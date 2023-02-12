package homework_4.Liana_gevorgyan.Chapter_7;


    class OverloadDemo1 {
        void test() {
            System.out.println("Without parameters ");
        }

        //Overload test for two parameters
        void test(int a, int b) {
            System.out.println("a and b " + a + " " + b);
        }
        double test(double a) {
            System.out.println("Inside test (double) a: " + a);
            return a * a;
        }
    }
    class Overload1 {
        public static void main(String[] args) {
            OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

            ob.test();
            ob.test(10,20);

            ob.test(i); //This will invoke test (double)
            ob.test(123.2); //this will invoke test(double)
        }

    }

