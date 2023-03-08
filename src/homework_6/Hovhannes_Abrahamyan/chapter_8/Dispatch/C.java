package homework_6.Hovhannes_Abrahamyan.chapter_8.Dispatch;

import homework_6.Hovhannes_Abrahamyan.chapter_8.Abstract.A;

class C extends A {
    @Override
   public void callMe() {
        System.out.println("Inside C's callMe method");
    }
}