package homework_13.Diana_Melkonyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private File currentFile;

    public Notepad() {
        textArea = new JTextArea();
        currentFile = new File("src\\homework_13\\Diana_Melkonyan\\Result.txt");
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();
        add(menuBar, BorderLayout.NORTH);
        add(jScrollPane);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Notepad();
    }

    public class NotepadMenuBar extends JMenuBar {
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
            close.addActionListener(this::onCloseActionPerfomed);
            save.addActionListener(this::onSaveActionPerfomed);

            close.addActionListener(this::onCloseActionPerfomed);
            save.addActionListener(this::onSaveActionPerfomed);
            openFile.addActionListener(this::onOpenActionPerfomed);
            saveAs.addActionListener(this::onSaveAsActiionPerfomed);
            newFile.addActionListener(this::onNewFileActionPerfomed);

        }

        private void onOpenActionPerfomed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choise = fileChooser.showOpenDialog(this);
            if (choise == JFileChooser.APPROVE_OPTION) {
                try {
                    String line;
                    File file1 = fileChooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(file1));
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line);
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Exception");
                }
            }
        }

        private void onNewFileActionPerfomed(ActionEvent actionEvent) {
            textArea.setText("");
            setTitle("New file");
        }

        private void onSaveActionPerfomed(ActionEvent actionEvent) {
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onSaveAsActiionPerfomed(ActionEvent actionEvent) {
            JFrame saveAs = new JFrame();
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("File to save");

            int user = fileChooser.showSaveDialog(saveAs);

            if (user == JFileChooser.APPROVE_OPTION) {
                File file1 = fileChooser.getSelectedFile();
                System.out.println("Save file: " + file1.getAbsolutePath());
            }
        }

        private void onCloseActionPerfomed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(this, "Do you wont to save?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerfomed(e);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }

        }

    }
}
