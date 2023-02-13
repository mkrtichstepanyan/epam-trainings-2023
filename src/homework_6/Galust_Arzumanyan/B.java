package homework_6.Galust_Arzumanyan;

class B extends A {
    int total;
    int k;
    void sum(){
        System.out.println("i + j + k=" + (i + j + k));
    }

    public void showk() {
        System.out.println("k is: " + k);
    }
    // A's is not accessible here
    /**
    void sumiz(){
        total = i + z;
    }
     */
}
