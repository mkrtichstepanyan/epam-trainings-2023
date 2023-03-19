package homework_13.Ani_Kovalenko.notepad;

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
        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        textArea.setRows(100);
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
        private String text;
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

            setTitle(currentFile.getName());
            this.text = textArea.getText();
            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            saveAs.addActionListener(this::onSaveActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);
        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            if (!this.text.equals(textArea.getText())) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                    textArea.setText("");
                } else if (option == JOptionPane.NO_OPTION) {
                    textArea.setText("");
                }
            }
            setTitle("New File");
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                if (!this.text.equals(textArea.getText())) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionEvent);
                    }
                }
                openSelectedFile(fileChooser);
            }
        }

        private void openSelectedFile(JFileChooser fileChooser) {
            textArea.setText("");
            BufferedReader readSelectedFile;
            File selectedFile = fileChooser.getSelectedFile();
            try {
                readSelectedFile = new BufferedReader(new FileReader(selectedFile));
                setTitle(selectedFile.getName());
                String line;
                while ((line = readSelectedFile.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            if (!this.text.equals(textArea.getText())) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(e);
                    System.exit(0);
                }
                if (option == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
