package homework_13.Inesa_Mkrtchyan.Notepad;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.EventListener;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {
    private File currentFile = new File("src\\homework_13\\Inesa_Mkrtchyan\\Notepad\\Test.txt");
    private JTextArea textArea = new JTextArea();
    public Notepad(){
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jScrollPane);
        NotepadMenuBar menuBar = new NotepadMenuBar();
        add(menuBar, BorderLayout.NORTH);
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Notepad();
    }
    private class NotepadMenuBar extends JMenuBar {
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
        public NotepadMenuBar(){
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
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            newFile.addActionListener(this::onNewFileActionPerformed);
        }
        private void onNewFileActionPerformed(ActionEvent actionEvent){
            int opt = JOptionPane.showConfirmDialog(this,"Do you want to save?");
            if(opt == JOptionPane.YES_OPTION){
                onSaveActionPerformed(actionEvent);
            }
            textArea.setText("");
        }
        private void onSaveAsActionPerformed(ActionEvent actionEvent){
            JFileChooser fileChooser = new JFileChooser();
            int choise = fileChooser.showOpenDialog(this);
            if(choise == JFileChooser.APPROVE_OPTION){
                try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))){
                    bufferedWriter.write(textArea.getText());
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
        private void onOpenActionPerformed(ActionEvent actionEvent){
            JFileChooser fileChooser = new JFileChooser();
            int choise = fileChooser.showOpenDialog(this);
            if(choise == JFileChooser.APPROVE_OPTION){
                File choosedFile = fileChooser.getSelectedFile();
                textArea.append(readFile(choosedFile.getAbsolutePath()));
                System.out.println(choosedFile.getAbsolutePath());
            }
        }
        private static String readFile(String fileName){
            StringBuilder sb = new StringBuilder();
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();
            } catch (IOException e) {
                System.err.println("Error reading file! \n " + fileName + " file is not found");
            }
            return sb.toString();
        }

        private void onSaveActionPerformed(ActionEvent e){
            String text = textArea.getText();
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))){
                bufferedWriter.write(text);
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        private void onCloseActionPerformed(ActionEvent e){
            int opt = JOptionPane.showConfirmDialog(this,"Do you want to save?");
            if(opt == JOptionPane.YES_OPTION){
                onSaveActionPerformed(e);
                System.exit(0);
            }
            if(opt == JOptionPane.NO_OPTION){
                System.exit(0);
            }
            System.exit(0);
        }
    }
}
