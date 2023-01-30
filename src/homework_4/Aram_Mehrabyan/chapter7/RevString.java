package homework_4.Aram_Mehrabyan.chapter7;


class Print{
    public static void main(String[] args) {
        String str="Aram";
        String s;
        char []ch=str.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]=='a')
                ch[i]='b';
            System.out.print(ch[i]+" ");
        }
      //  System.out.print(ch.toString());

    }
}
