package homework_8.Diana_Melkonyan.Interfase;

import homework_6.Vazgen_Harutyunyan.chapter_8.member_access.A;
import homework_6.ani_kovalenko.chapter_8.Dispatch.C;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // c now refers to AnotherClient object
        c.callback(42);
    }
}
