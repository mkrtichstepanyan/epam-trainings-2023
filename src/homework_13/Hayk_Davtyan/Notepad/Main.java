package homework_13.Hayk_Davtyan.Notepad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Notepad();
            }
        });
    }
}
