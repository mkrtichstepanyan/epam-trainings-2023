package homework_13.gohar_hakobyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;


public class Notepad extends JFrame {
    private static final String FILE_PATH = "C:\\Users\\Noname\\Desktop\\EPAM2023\\epam-trainings-2023\\src\\homework_13\\gohar_hakobyan\\notepad\\result.txt";

    private static final String DIRECTORY = "C:\\Users\\Noname\\Desktop\\EPAM2023\\epam-trainings-2023\\src\\homework_13\\gohar_hakobyan\\notepad";
    private JTextArea textArea;

    private File currentFile;

    public Notepad() {
        currentFile = new File(FILE_PATH);
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

            newFile.addActionListener(this::onNewFileActionPerformed);
            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            saveAs.addActionListener(this::onSaveUsActionPerformed);

        }

        private void onNewFileActionPerformed(ActionEvent event) {
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?",
                    "Save File?", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                saveFile();
            } else {
                textArea.setText("");
            }
        }

        private void onOpenActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println("File is opened");
                if (confirmSaveChanges()) {
                    saveFile();
                } else {
                    readFile(file);
                }
            }
        }


        private boolean confirmSaveChanges() {
            return JOptionPane.showConfirmDialog(this,
                    "Do you want to save your changes?",
                    "Save Changes", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }

        private void saveFile() {
            JFileChooser fileChooser = new JFileChooser();
            int savedSelection = fileChooser.showSaveDialog(this);
            if (savedSelection == JFileChooser.APPROVE_OPTION) {
                String savedFileName = fileChooser.getSelectedFile().getAbsolutePath();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(savedFileName))) {
                    bw.write(textArea.getText());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        private void readFile(File file) {
            String filename = file.getAbsolutePath();
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    textArea.setText(textArea.getText() + line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        private void onSaveActionPerformed(ActionEvent event) {
            boolean isFileExistsInDirectory = new File(DIRECTORY, currentFile.getName()).exists();
            if (!isFileExistsInDirectory) {
                onSaveUsActionPerformed(event);
            } else {
                try (BufferedWriter br = new BufferedWriter(new FileWriter(currentFile))) {
                    br.write(textArea.getText());
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }


        private void onSaveUsActionPerformed(ActionEvent actionEvent) {
            JFileChooser saveDialog = new JFileChooser();
            int option = saveDialog.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File selectedFile = saveDialog.getSelectedFile();
                writeToFile(textArea.getText(), selectedFile);
                currentFile = selectedFile;
            }
        }

        // write to file on click save as option
        private void writeToFile(String text, File file) {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
                br.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onCloseActionPerformed(ActionEvent event) {
            int option = JOptionPane.showConfirmDialog(this,
                    "Do you want to save your changes?",
                    "Save Changes", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(event);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
    }
}
