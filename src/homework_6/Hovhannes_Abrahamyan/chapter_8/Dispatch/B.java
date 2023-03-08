package homework_6.Hovhannes_Abrahamyan.chapter_8.Dispatch;


import homework_6.Hovhannes_Abrahamyan.chapter_8.Abstract.*;

class B extends A {
    @Override
   public void callMe() {
        System.out.println("Inside B's callMe method");
    }
}