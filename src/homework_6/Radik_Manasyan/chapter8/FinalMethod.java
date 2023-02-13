package homework_6.Radik_Manasyan.chapter8;

public class FinalMethod {
    final void meth() {
        System.out.println("Этo конечный метод.");
    }
}

class ExtendFinalMethod extends FinalMethod {
    //ОШИБКА! Этот метод не может быть переопределен.
    void math() {
        System.out.println("Heдoпycтимo!");
    }
}
