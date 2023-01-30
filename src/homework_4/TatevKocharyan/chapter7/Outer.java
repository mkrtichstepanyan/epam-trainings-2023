package homework_4.TatevKocharyan.chapter7;

public class Outer {
    int outer_x=100;


//  method 1
//     void  test(){
//       Inner inner=new Inner();
//       inner.display(); }

//  method 2
    void test(){
        for (int i = 0; i <10 ; i++) {
            class Inner{
                void display(){
                    System.out.println( "display: outer_x= "+ outer_x);
                }
            }
            Inner inner=new Inner();
            inner.display(); }

        }
    }

//   class Inner{
//     int y=10;
//      void display(){
//        System.out.println("display: outer_x= "+ outer_x); }
//     }


//  void showy(){ System.out.println(y);} error ,y not known.