package homework_13.Argishti_Mesropyan.NewNotepad;


import javax.swing.*;
import java.io.*;

public class Notepad extends JFrame {
    private JTextArea editor;
    public JMenuBar menuBar;
    public JMenu fileMenu;
    public JMenuItem newFile, openFile, saveFile, saveFileAs, exit;
    private File currentFile;

    public Notepad() {
        super("Notepad");

        editor = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(editor);
        add(scrollPane);
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        saveFileAs = new JMenuItem("Save As");
        exit = new JMenuItem("Exit");

        newFile.addActionListener(e -> {
            editor.setText("");
            currentFile = null;
        });

        openFile.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(Notepad.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    currentFile = chooser.getSelectedFile();
                    BufferedReader reader = new BufferedReader(new FileReader(currentFile));
                    editor.read(reader, null);
                    reader.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(Notepad.this, ex.getMessage());
                }
            }
        });


        saveFile.addActionListener(e -> {
            if (currentFile == null) {
                saveFileAs.doClick();
            } else {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile));
                    editor.write(writer);
                    writer.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(Notepad.this, ex.getMessage());
                }
            }
        });

        saveFileAs.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showSaveDialog(Notepad.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    currentFile = chooser.getSelectedFile();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile));
                    editor.write(writer);
                    writer.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(Notepad.this, ex.getMessage());
                }
            }
        });


        exit.addActionListener(e -> System.exit(0));


        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveFileAs);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Notepad();
    }
}


