package homework_13.Roza_Petrosyan.notepad;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame implements DocumentListener {

    private JTextArea textArea;

    private File currentFile;

    private boolean changed = false;

    public Notepad() {
        currentFile = new File("src/homework_13/Roza_Petrosyan/notepad/Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        boolean isFileExistsInDirectory = new File("src/homework_13/Roza_Petrosyan/notepad/",
                currentFile.getName()).exists();

        if (isFileExistsInDirectory) {
            textArea.append(readFile());
        }
        textArea.getDocument().addDocumentListener(this);
        setVisible(true);
    }

    public String readFile() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        try (BufferedReader fr = new BufferedReader(new FileReader(currentFile))) {
            while ((line = fr.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        changed = true;
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
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

            newFile.addActionListener(this::onNewActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            close.addActionListener(this::onCloseActionPerformed);

        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            if (!textArea.getText().isEmpty()) {
                if (readFile().equals(textArea.getText())) {
                    textArea.setText("");
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                    if (option == JOptionPane.YES_OPTION) {
                        JFileChooser fileChooser = new JFileChooser();
                        int choice = fileChooser.showSaveDialog(this);
                        if (choice == JFileChooser.APPROVE_OPTION) {
                            onSaveActionPerformed(actionEvent);
                        }
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }
            } else {
                onSaveActionPerformed(actionEvent);
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            if (changed) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionEvent);
                    }
                    readOpenFile(fileChooser);
                }
            } else {
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    readOpenFile(fileChooser);
                }
            }
        }

        private void readOpenFile(JFileChooser fileChooser) {
            textArea.setText("");
            File selectedFile = fileChooser.getSelectedFile();
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            try (BufferedReader fr = new BufferedReader(new FileReader(selectedFile))) {
                while ((line = fr.readLine()) != null) {
                    textArea.setText(textArea.getText() + line + "\n");
                    stringBuilder.append(line);
                }
                changed = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            String directory = "src/homework_13/Roza_Petrosyan/notepad/";
            boolean isFileExistsInDirectory = new File(directory, currentFile.getName()).exists();

            if (!isFileExistsInDirectory) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                        bufferedWriter.write(text);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                onSaveActionPerformed(actionEvent);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            if (changed) {
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
