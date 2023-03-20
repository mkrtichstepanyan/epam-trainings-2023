package homework_13.Alina_Mkhoyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.io.*;

public class Notepad implements ActionListener {

    private JFrame jframe = new JFrame();
    public JMenuBar menuBar;
    public JMenu edit, type, more;
    private JMenuItem file, newFile, openFile, savaFile, newSave, exit;
    private JMenuItem help;
    private JTextArea txt;
    private JScrollPane jsp;
    public JMenuItem about, copy, cut, paste, del;
    public JMenuItem copy1, cut1, Paste1, del1;
    private StringSelection select;
    private Clipboard clipboard = jframe.getToolkit().getSystemClipboard();
    private static File fileOpen = null;
    private static File fileSave = null;
    private static BufferedReader bufferedReader = null;

    public Notepad() {
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(230, 230, 250));
        menuBar.setFont(new Font("Monospaced", Font.PLAIN, 18));
        file = new JMenu("File ");
        edit = new JMenu("Edit ");
        more = new JMenu("More ");
        newFile = new JMenuItem("New file(ctrl+n)");
        openFile = new JMenuItem("Open file(ctrl+o)");
        savaFile = new JMenuItem("Save file(ctrl+s)");
        newSave = new JMenuItem("Save as");
        exit = new JMenuItem("Exit ");
        copy = new JMenuItem("Copy (ctrl+c)");
        cut = new JMenuItem("Cut (ctrl+x)");
        paste = new JMenuItem("Paste (ctrl+v)");
        del = new JMenuItem("Delete ");

        file.addActionListener(this);
        edit.addActionListener(this);
        more.addActionListener(this);
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        savaFile.addActionListener(this);
        newSave.addActionListener(this);
        exit.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        del.addActionListener(this);

        about = new JMenuItem("About ");
        about.addActionListener(this);

        help = new JMenuItem("Help ");
        help.addActionListener(this);

        txt = new JTextArea();
        txt.setBackground(Color.white);
        txt.setFont(new Font("Monospaced", Font.PLAIN, 19));
        txt.setForeground(Color.black);
        txt.setLineWrap(true);

        txt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.isControlDown()) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_S -> save();
                        case KeyEvent.VK_O -> openFile();
                        case KeyEvent.VK_N -> newFile();
                        case KeyEvent.VK_D -> delete();
                    }
                }
            }
        });
    }

    public void add() {
        jframe.setTitle("Notepad");
        jframe.setSize(680, 560);
        jframe.setResizable(true);
        jframe.setLocationRelativeTo(null);
        jframe.setJMenuBar(menuBar);
        jsp = new JScrollPane(txt);
        jframe.getContentPane().add(jsp);

        file.add(newFile);
        file.add(openFile);
        file.add(savaFile);
        file.add(newSave);
        file.add(exit);

        edit.add(copy);
        edit.addSeparator();
        edit.add(cut);
        edit.addSeparator();
        edit.add(paste);
        edit.addSeparator();
        edit.add(del);

        more.add(about);
        more.add(help);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(more);

        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                exit();
            }
        });
    }

    public void copy() {
        String tempText = txt.getSelectedText();
        select = new StringSelection(tempText);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, select);
    }

    public void cut() {
        String tempText = txt.getSelectedText();
        StringSelection editText = new StringSelection(tempText);
        int start = txt.getSelectionStart();
        int end = txt.getSelectionEnd();
        clipboard.setContents(editText, null);
        txt.replaceRange("", start, end);
    }

    public void paste() {
        Transferable contents = clipboard.getContents(this);
        DataFlavor flavor = DataFlavor.stringFlavor;
        if (contents.isDataFlavorSupported(flavor)) {
            try {
                String str;
                str = (String) contents.getTransferData(flavor);
                txt.setText(txt.getText() + str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void delete() {
        int start = txt.getSelectionStart();
        int end = txt.getSelectionEnd();
        txt.replaceRange("", start, end);
    }

    public void newFile() {
        new Notepad().add();
    }

    public void openFile() {
        int result;
        StringBuilder stringBuilder = new StringBuilder();
        String temp;
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        result = fileChooser.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == result) {
            fileOpen = new File(fileChooser.getSelectedFile().getPath());
            try {
                bufferedReader = new BufferedReader(new FileReader(fileOpen));
                while ((temp = bufferedReader.readLine()) != null) {
                    stringBuilder.append(temp).append("\r\n");
                }
                bufferedReader.close();
                txt.setText(stringBuilder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void save() {
        int result = 0;
        String temp = txt.getText();
        JFileChooser fileChooser = new JFileChooser();

        result = fileChooser.showSaveDialog(null);
        if (JFileChooser.APPROVE_OPTION == result) {
            fileSave = new File(fileChooser.getSelectedFile().getPath());
            boolean isWrite = true;
            if (fileSave.exists()) {
                int verifyValue = JOptionPane.showConfirmDialog(null,
                        fileSave + "The file already exists, it is overwritten?", "Save", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                if (verifyValue != JOptionPane.YES_OPTION) {
                    isWrite = false;
                }
            }
            if (isWrite) {
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(fileChooser.getSelectedFile().getPath());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < temp.length(); i++) {
                    char c = temp.charAt(i);
                    try {
                        if (fileOutputStream != null) {
                            fileOutputStream.write(c);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isCloseIng) {
                this.jframe.dispose();
            }
        }

    }

    public void exit() {
        String temp = txt.getText();
        if (temp != null && temp.length() > 0) {
            int verifyValue = JOptionPane.showConfirmDialog(null, "Save content?",
                    "Save", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (verifyValue == JOptionPane.YES_OPTION) {
                isCloseIng = true;
                save();
            } else {
                this.jframe.dispose();
            }
        } else {
            this.jframe.dispose();
        }
    }

    private static boolean isCloseIng = false;


    public String about() {
        return "Creator Alina \n This is a notepad software written in Java";
    }

    public String help() {
        return "If you have any problems while using it, please contact the author!\n The author is sleeping, call : )\n +37477*****";
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newFile) {
            newFile();
        }
        if (e.getSource() == openFile) {
            openFile();
        }
        if (e.getSource() == savaFile) {
            save();
        }
        if (e.getSource() == newSave) {
            save();
        }
        if (e.getSource() == exit) {
            exit();
        }
        if (e.getSource() == about) {
            JOptionPane.showMessageDialog(null, about());
        }
        if (e.getSource() == help) {
            JOptionPane.showMessageDialog(null, help());
        }
        if (e.getSource() == copy || e.getSource() == copy1) {
            copy();
        }
        if (e.getSource() == cut || e.getSource() == cut1) {
            cut();
        }
        if (e.getSource() == paste || e.getSource() == Paste1) {
            paste();
        }
        if (e.getSource() == del || e.getSource() == del1) {
            delete();
        }
        System.out.println(" option selected.");
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        new Notepad().add();
    }
}

