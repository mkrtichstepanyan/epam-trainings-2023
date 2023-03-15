package homework_13.garik_gharibyan.notepad;

import homework_6.Karen_Mikayelyan.chapter_8.simpleInheritane.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private JTextArea textArea;

    private File currentFile;

    public Notepad() {
        currentFile = new File("src/homework_13/garik_gharibyan/notepad/Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar {

        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem amLang;
        private final JMenuItem enLang;
        private final JMenuItem ruLang;

        public NotepadMenuBar() {
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
            enLang = new JMenuItem("English");
            amLang = new JMenuItem("Armenian");
            ruLang = new JMenuItem("Russian");

            language.add(enLang);
            language.add(amLang);
            language.add(ruLang);

            add(file);
            add(language);

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            String currentText = textArea.getText();
            JFileChooser fileChooser = new JFileChooser();
            openSaveDialog(fileChooser, currentText);
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            onNewActionPerformed(actionEvent);
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                System.out.println("File is opened");
                String text = "";

                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                    int c = bufferedReader.read();
                    while (c != -1) {
                        text = text + (char) c;
                        c = bufferedReader.read();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
                textArea.setText(text);

            } else if (choice == JFileChooser.CANCEL_OPTION) {
                System.out.println("you click: CANCEL");
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String currentText = textArea.getText();
            if (currentFile != null) {
                writer(currentFile, currentText);
            } else {
                JFileChooser fileChooser = new JFileChooser();
                openSaveDialog(fileChooser, currentText);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            String currentText = textArea.getText();
            if (!currentText.isEmpty()) {
                onNewActionPerformed(e);
                System.exit(0);
            } else {
                System.exit(0);
            }

        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            String currentText = textArea.getText();
            if (!currentText.isEmpty()) {

                int i = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (i == JOptionPane.NO_OPTION) {
                    System.out.println("you click: NO");
                    textArea.setText("");
                } else if (i == JOptionPane.YES_OPTION) {
                    System.out.println("you click: YES");

                    JFileChooser fileChooser = new JFileChooser();
                    openSaveDialog(fileChooser, currentText);

                } else {
                    System.out.println("You click: CANCEL");
                    textArea.setText(currentText);
                }

            }
        }

        private void writer(File file, String text) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        private void openSaveDialog(JFileChooser fileChooser, String text) {
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.CANCEL_OPTION) {
                System.out.println("You click: CANCEL");
                textArea.setText("");
            } else if (choice == 0) {
                System.out.println("You click: SAVE");
                writer(fileChooser.getSelectedFile(), text);
                textArea.setText("");
            }
        }

    }

    public static void main(String[] args) {
        new Notepad();
    }
}
