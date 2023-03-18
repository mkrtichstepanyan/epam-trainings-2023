package homework_13.Varsik_Pijoyan.Notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private JFrame window;
    private File currentFile;

    public Notepad() {
        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotePadMenuBar menuBar = new NotePadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);

        createWindow();
        setVisible(true);
    }

    private void createWindow() {
        window = new JFrame("Notepad");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class NotePadMenuBar extends JMenuBar {

        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem amLang;
        private final JMenuItem engLang;
        private final JMenuItem ruLang;


        public NotePadMenuBar() {
            file = new JMenu("File");
            newFile = new JMenuItem("New File");
            openFile = new JMenuItem("Open File");
            save = new JMenuItem("Save");
            saveAs = new JMenuItem("Save As");
            close = new JMenuItem("Close");

            add(newFile);
            add(openFile);
            add(save);
            add(saveAs);
            add(close);

            language = new JMenu("Language");
            amLang = new JMenuItem("Armenian");
            engLang = new JMenuItem("English");
            ruLang = new JMenuItem("Russian");

            add(amLang);
            add(engLang);
            add(ruLang);

            add(file);
            add(language);

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewFileActionPerformed);

        }

        private void onNewFileActionPerformed(ActionEvent actionEvent) {
            textArea.setText("");
            setTitle("New");
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser jFileChooser = new JFileChooser();
            int choice = jFileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                try {
                    String line;
                    File fileSelect = jFileChooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(fileSelect));
                    BufferedReader br = new BufferedReader(reader);
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line);
                    }
                    reader.close();
                } catch (IOException exc) {
                    System.out.println("Exception Caught");
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
            JFrame saveAs = new JFrame();

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");

            int userSelection = fileChooser.showSaveDialog(saveAs);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
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
}


