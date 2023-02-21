package homework_6.Radik_Manasyan.chapter8;

public class AC {
    AC() {
        System.out.println("B конструкторе AC.");
    }
}

class BA extends AC {
    BA() {
        System.out.println("B конструкторе BA.");

    }
}

class CA extends BA {
    CA() {
        System.out.println("B конструкторе CA.");
    }
}
