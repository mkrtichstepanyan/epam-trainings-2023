package homework_13.Hovhannes_Gspeyan.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NotepadMenuBar extends JMenuBar {

    private final JMenu file;
    private final JMenuItem newFile;
    private final JMenuItem openFile;
    private final JMenuItem saveFile;
    private final JMenuItem saveAs;
    private final JMenuItem close;

    private final JMenu language;
    private final JMenuItem amLang;
    private final JMenuItem enLang;
    private final JMenuItem ruLang;

    public NotepadMenuBar(){
        file = new JMenu("File");
        newFile = new JMenuItem("new file");
        openFile = new JMenuItem("open file");
        saveFile = new JMenuItem("save file");
        saveAs = new JMenuItem("save as");
        close = new JMenuItem("close");
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(saveAs);
        file.add(close);

        language = new JMenu("Language");
        amLang = new JMenuItem("Armenian");
        enLang = new JMenuItem("English");
        ruLang = new JMenuItem("Russian");
        language.add(amLang);
        language.add(enLang);
        language.add(ruLang);

        add(file);
        add(language);

        close.addActionListener(this::onCloseAction);
        saveFile.addActionListener(this::onSaveFileAction);
    }

    private void onSaveFileAction(ActionEvent e) {

    }

    private void onCloseAction(ActionEvent e){
        System.exit(0);
    }
}
