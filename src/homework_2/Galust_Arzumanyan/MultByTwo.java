package homework_2.Galust_Arzumanyan;


//This method is used to demonstrate left shifting as a quick way to multiply by 2
class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xABCDEF;// num is 11259375: num in binary is 1010_1011_1100_1101_1110_1111
        for (i = 0; i < 3; i++) {
            num = num << 2;
            System.out.println(num);
        }

    }
}
