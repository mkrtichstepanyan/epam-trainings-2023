package homework_2.Ruzanna_Marutyan;
class MultByTwo {
    public static void main (String[] args) {
        int i;
        int num = 0xFFFFFFE; //Multiply the last digit by 1, Multiply the second to last digit by 16,
        // Multiply the third to the last digit by 16 x 16, Multiply the fourth to the last digit by 16 x 16 x 16,
        // Multiply the fifth to the last digit by 16 x 16 x 16 x 16 and so on until all the digits are used. E=14,F=15
        //E*1=14*1=14
        //F*16=240
        //F*16*16=3840
        //F*16*16*16=61440
        //F*16*16*16*16=983040
        //F*16*16*16*16*16=15728640
        //F*16*16*16*16*16*16=251658240
        //num=FFFFFFE=14+240+3840+61440+983040+15728640+251658240=268435454
        //FFFFFFE=1111111111111111111111111110=268435454

        for (i=0; i<4; i++) {
            num=num<<1;
            //num<<1 ->  11111111111111111111111111100=536870908...
            System.out.println(num);
        }
    }
}
