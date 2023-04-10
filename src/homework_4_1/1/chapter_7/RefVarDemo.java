package homework_4_1;

class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("Value if i in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value if i in Mc is now " + mc.getI());
    }
}







