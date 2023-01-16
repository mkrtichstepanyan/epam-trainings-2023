package homework_1.Alina_Vardanovna;

public class ScopeErr {

    public static void main(String[] args) {
        int bar = 1;
        /* Եթե այստեղ փորձենք գրել int bar = 2; սխալ ցույց կտա,
        որովհետև մենք արդեն ունենք bar անունով փոփոխական: Բայց եթե օրինակ if-ի մեջ ունենք հայտարարած y,
        որը if-ից դուրս տեսանելի չէ, կարող ենք նորից սարքել  */
    }

}
