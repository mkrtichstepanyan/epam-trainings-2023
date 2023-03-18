package homework_13.aram_mehrabyan.notepad;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private JTextArea textArea;

    private File currentFile;


    public Notepad() {
        currentFile = new File("/Users/PC/Desktop/RD/epam-trainings-2023/src/homework_13/aram_mehrabyan/notepad/Result.txt");
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

        private void onNewActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            if (text.length() != 0) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save changes?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionEvent);
                    } else {
                        textArea.setText("");

                    }


                }


            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            String text = textArea.getText();
            if (text.length() == 0) {
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                        String line = reader.readLine();
                        while (line != null) {
                            textArea.append(line);
                            line = reader.readLine();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save changes ?");
                if (option == JOptionPane.YES_OPTION) {
                    int choice = fileChooser.showSaveDialog(this);
                    if (choice == JFileChooser.APPROVE_OPTION) {
                        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                            bufferedWriter.write(text);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                         choice = fileChooser.showOpenDialog(this);
                        if (choice == JFileChooser.APPROVE_OPTION) {
                            try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                                String line = reader.readLine();
                                while (line != null) {
                                    textArea.append(line);
                                    line = reader.readLine();
                                }

                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }


                } else {
                    textArea.getText();
                }
            }

        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save changes?");
                if (option == JOptionPane.YES_OPTION) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                        bufferedWriter.write(text);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    textArea.getText();

                }


            }
        }

        private void onCloseActionPerformed(ActionEvent actionEvent) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(actionEvent);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        new Notepad();
    }

}
