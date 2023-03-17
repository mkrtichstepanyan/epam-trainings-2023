package homework_13.Lilit_Adamyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private File currentFile;

    public Notepad(){

        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    class NotepadMenuBar extends JMenuBar{
        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem armLang;
        private final JMenuItem rusLang;
        private final JMenuItem engLang;

        public  NotepadMenuBar() {
            file = new JMenu("File");
            newFile = new JMenuItem("New");
            openFile = new JMenuItem("Open");
            save = new JMenuItem("Save");
            saveAs = new JMenuItem("Save as");
            close = new JMenuItem("Close");

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language = new JMenu("Language");
            engLang = new JMenuItem("English");
            armLang = new JMenuItem("Armenian");
            rusLang = new JMenuItem("Russian");

            language.add(engLang);
            language.add(armLang);
            language.add(rusLang);

            add(file);
            add(language);

            newFile.addActionListener(this::newFileActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
           close.addActionListener(this::onCloseActionPerformed);
        }


        private void newFileActionPerformed(ActionEvent actionevent) {
            if (textArea.getText().isEmpty()) {
                textArea.setText("");
            } else {
                int choice = JOptionPane.showConfirmDialog(null,
                        "Do you want to save your changes?",
                        "Save changes",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionevent);
                } else if (choice == JOptionPane.NO_OPTION) {
                   textArea.setText("");
                }
            }

        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (!textArea.getText().equals("")) {
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save the changes to "
                        + getTitle() + "?", "Confirm Open", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    onSaveAsActionPerformed(actionEvent);
                } else if (confirm == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }

            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    reader.close();
                    textArea.setText(sb.toString());
                    setTitle(selectedFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error opening file " + selectedFile.getName());
                }
            }
        }
        private void onSaveActionPerformed(ActionEvent actionEvent) {
            if (currentFile == null) {
                onSaveAsActionPerformed(actionEvent);
            } else {
                try {
                    FileWriter writer = new FileWriter(currentFile);
                    writer.write(textArea.getText());
                    writer.close();
                    setTitle(currentFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file " + currentFile.getName());
                }
            }
        }
        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(selectedFile);
                    writer.write(textArea.getText());
                    writer.close();
                    currentFile = selectedFile;
                    setTitle(currentFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file " + selectedFile.getName());
                }
            }
        }

        private void onCloseActionPerformed(ActionEvent actionEvent) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (option == JOptionPane.YES_OPTION){
                onSaveActionPerformed(actionEvent);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }
        }
    public static void main(String[] args) {
        new Notepad();
    }
}






