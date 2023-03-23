package homework_13.Qnarik_Khachatryan.notepad;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;


public class Nodepad extends JFrame {
    private JTextArea textArea;

    private File currentFile;
    private String filePath = "";


    public Nodepad() {
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
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);

        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            File selectedFIle = fileChooser.getSelectedFile();
            if (choice == JFileChooser.APPROVE_OPTION) {
                String currentText = textArea.getText();
                if (currentFile != null) {
                    if (isChanged(currentText, currentFile)) {
                        int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                        if (option == JOptionPane.YES_OPTION) {
                            onSaveActionPerformed(actionEvent);
                        }
                        openSelectedFile(selectedFIle);
                    }
                    openSelectedFile(selectedFIle);

                }
                if (currentFile == null && currentText.length() > 0) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(actionEvent);
                    }
                    openSelectedFile(selectedFIle);
                }
                openSelectedFile(selectedFIle);
            }
        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            File currentFile = fileChooser.getSelectedFile();
            String currentText = textArea.getText();
            if (currentFile!=null){
                System.out.println(currentFile.getName());

                if (!isChanged(currentText, currentFile)){
                    textArea.setText("");
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionEvent);
                        textArea.setText("");
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }
            }
            if (currentFile==null){ // new file
                if(currentText.length() > 0) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(actionEvent);
                        textArea.setText("");
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            if (currentFile != null) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else onSaveAsActionPerformed(actionEvent);
        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            JFileChooser dirChooser = new JFileChooser();
            int choice = dirChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                String chosenDirPath = dirChooser.getSelectedFile().getAbsolutePath();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(chosenDirPath))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                System.exit(0);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            String currentText = textArea.getText(); // текст в момент закрытия
            if (currentFile != null) {
                if (!isChanged(currentText, currentFile)) {
                    System.exit(0);
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(e);
                        System.exit(0);
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }
            }
            if (currentFile == null) {
                if (currentText.length() == 0) {
                    System.exit(0);
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(e);
                        System.exit(0);
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }
            }
        }

        private boolean isChanged(String textFromArea, File currentFile) {
            String textFromSavedFile = "";
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(currentFile))) {
                textFromSavedFile += bufferedReader.read();
            } catch (IOException err) {
                err.printStackTrace();
            }
            return !textFromArea.contentEquals(textFromSavedFile);
        }

        private void openSelectedFile(File selectedFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                textArea.setText(sb.toString());

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Nodepad();
    }
}
