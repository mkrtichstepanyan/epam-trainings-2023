package homework_19.aram_mehrabyan;

public class Main {
    public static void main(String[] args) {
        ExtendedList <Integer> extList=new ExtendedList<>();
        extList.add(5);
        extList.add(20);
        extList.add(55);
        extList.add(70);
        extList.forEach(System.out::println);
        ExtendedList <Integer> mapExtList=extList.map((n)->n*3);
        mapExtList.forEach(System.out::println);
        System.out.println("-----------------");
        extList.fill(()->26,2);
        extList.forEach(System.out::println);
        System.out.println("-----------------");
        System.out.println(extList.forAll((n)->n>0));
        System.out.println("-----------------");
        System.out.println(extList.partition((n)->n<55)); ;
        System.out.println("-----------------");
        System.out.println(extList.reduce((a,b)->a+b,0));

    }
}
