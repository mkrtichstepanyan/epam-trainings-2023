package homework_14.aram_mehrabyan;

public class TestStack1 {
    public static  void main(String []args){
     Stack1 <Integer> mystckI=new Stack1<Integer>();
     mystckI.push(5);
     mystckI.push(10);
        System.out.println(mystckI.pop());
        Stack1 <Double> mystckD=new Stack1<Double>(3);
        mystckD.push(7.25);
        mystckD.push(5.33);
        mystckD.push(2.38);
        mystckD.pop();
        System.out.println(mystckD.pop());
       // mystckD.pop();
        Stack1 <String> mystckS=new Stack1<String>(4);
        mystckS.push("Aram");
        mystckS.push("Armen");
        mystckS.push("Mher");
        mystckS.push("Anahit");
        System.out.println(mystckS.pop());
    }
}
