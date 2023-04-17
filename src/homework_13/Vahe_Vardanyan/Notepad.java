package homework_13.Vahe_Vardanyan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private File currentFile;

    public Notepad(){
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
    public static void main(String[] args){new Notepad();}
    class NotepadMenuBar extends JMenuBar{
        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private  final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem amLang;
        private final JMenuItem enLang;
        private final JMenuItem ruLang;

        public NotepadMenuBar(){
            file = new JMenu("file");
            newFile = new JMenuItem("New");
            openFile = new JMenuItem("Open");
            save = new JMenuItem("Save");
            saveAs = new JMenuItem("saveAs");
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
            newFile.addActionListener(this::onNewFileActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
        }
        private void onSaveAsActionPerformed(ActionEvent actionEvent){
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                    bufferedWriter.write(textArea.getText());
                }catch (IOException e){
                    e.printStackTrace();
                }
                currentFile = selectedFile;
                System.exit(0);
            }
        }
        private void onNewFileActionPerformed(ActionEvent actionEvent){
            if (textArea.getText().length() > 0){
                int option = JOptionPane.showConfirmDialog(this,"Do you wont to save your changes ?");
                if (option == JOptionPane.YES_OPTION){
                    ActionEvent actionEvent1 = null;
                    onSaveAsActionPerformed(actionEvent);
                }
            }
            textArea.setText(" ");
            currentFile = null;
        }
        private void onOpenActionPerformed(ActionEvent actionEvent){
            if (textArea.getText().length() > 0){
                int option = JOptionPane.showConfirmDialog(this,"Do you wont to save your changes ?");
                if (option == JOptionPane.YES_OPTION){
                    ActionEvent actionEvent1 = null;
                    onSaveAsActionPerformed(actionEvent);
                }
            }
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile))) {
                    StringBuilder fileContent = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null){
                        fileContent.append(line).append("\n");
                    }
                    textArea.setText(fileContent.toString());
                    currentFile = selectedFile;
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        private void onSaveActionPerformed(ActionEvent actionEvent){
            String text = textArea.getText();
            if (currentFile == null){
                JFileChooser fileChooser = new JFileChooser();
                int userSelection = fileChooser.showSaveDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION){
                    currentFile = fileChooser.getSelectedFile();
                }
            }
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))){
                bufferedWriter.write(text);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        private void onCloseActionPerformed(ActionEvent actionEvent){
            if (textArea.getText().length() == 0){
                System.exit(0);
            }
            int option = JOptionPane.showConfirmDialog(this,"Do you wont to save ?");
            if (option == JOptionPane.YES_OPTION){
                ActionEvent e = null;
                onSaveActionPerformed(e);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }
    }
}
