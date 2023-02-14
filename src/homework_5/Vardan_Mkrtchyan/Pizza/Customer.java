package homework_5.Vardan_Mkrtchyan.Pizza;
public class Customer {

        private static int client = 7874;

        public Customer() {

            client++;
        }

        public int getClientNumber() {
            return client;
        }

}
