package homework_13.Ani_Barseghyan.notepad;

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
            saveAs = new JMenuItem("Save As");
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

        private void onCloseActionPerformed(ActionEvent event) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(event);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

        private void onSaveActionPerformed(ActionEvent event) {
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onSaveAsActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            String text = textArea.getText();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                String newFIle = fileChooser.getCurrentDirectory().getPath();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFIle))) {
                    if (!textArea.getText().equals("")) {
                        int option = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?");
                        if (option == JOptionPane.YES_OPTION) {
                            fileChooser.showSaveDialog(this);
                            bufferedWriter.write(text);
                            onSaveActionPerformed(event);
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onOpenActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            if (!textArea.getText().equals("")) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?");
                if (option == JOptionPane.YES_OPTION) {
                    fileChooser.showSaveDialog(this);
                    onSaveActionPerformed(event);
                    System.exit(0);
                } else {
                    int choice = fileChooser.showOpenDialog(this);
                    if (choice == JFileChooser.APPROVE_OPTION) {
                        File chosenFile = fileChooser.getSelectedFile();
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(chosenFile))) {
                            StringBuilder stringBuilder = new StringBuilder();
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                stringBuilder.append(line).append("\n");
                            }
                            textArea.setText(stringBuilder.toString());
                            setTitle(chosenFile.getName());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("File is opened");
                    }
                }
            }
        }

        private void onNewActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            if (!textArea.getText().equals("")) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?");
                if (option == JOptionPane.YES_OPTION) {
                    fileChooser.showSaveDialog(this);
                    onSaveActionPerformed(event);
                    System.exit(0);
                } else {
                    textArea.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
