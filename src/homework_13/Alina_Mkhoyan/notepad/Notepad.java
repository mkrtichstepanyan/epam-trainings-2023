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
    public JMenuItem about, copy, cut, Paste, del;
    public JMenuItem copy1, cut1, Paste1, del1;


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
        Paste = new JMenuItem("Paste (ctrl+v)");
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
        Paste.addActionListener(this);
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
                if ((e.getKeyCode() == KeyEvent.VK_S) && (e.isControlDown())) {// ctrl+s
                    sava();
                }
                if ((e.getKeyCode() == KeyEvent.VK_O) && (e.isControlDown())) {// ctrl+o
                    openFile();
                }
                if ((e.getKeyCode() == KeyEvent.VK_N) && (e.isControlDown())) {// ctrl+n
                    newFile();
                }
                if ((e.getKeyCode() == KeyEvent.VK_D) && (e.isControlDown())) {// ctrl+d
                    del();
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
        edit.add(Paste);
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

    private static StringSelection stsel = null;

    private Clipboard clipboard = jframe.getToolkit().getSystemClipboard();

    public void copy() {
        String tempText = txt.getSelectedText();
        stsel = new StringSelection(tempText);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stsel, stsel);
    }

    public void cut() {
        String tempText = txt.getSelectedText();
        StringSelection editText = new StringSelection(tempText);
        clipboard.setContents(editText, null);
        int start = txt.getSelectionStart();
        int end = txt.getSelectionEnd();
        txt.replaceRange("", start, end);
    }

    public void Paste() {
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

    public void del() {
        int start = txt.getSelectionStart();
        int end = txt.getSelectionEnd();
        txt.replaceRange("", start, end);
    }

    private static File OpenFile = null;
    private static File SavaFile = null;
    private static BufferedReader br = null;


    public void newFile() {
        new Notepad().add();
    }


    public void openFile() {
        int result;
        StringBuilder str = new StringBuilder();
        String temp;
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        result = fileChooser.showOpenDialog(null);

        if (JFileChooser.APPROVE_OPTION == result) {
            OpenFile = new File(fileChooser.getSelectedFile().getPath());
            try {
                br = new BufferedReader(new FileReader(OpenFile));
                while ((temp = br.readLine()) != null) {
                    str.append(temp).append("\r\n");
                }
                br.close();
                txt.setText(str.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sava() {
        int result = 0;
        String temp = txt.getText();
        JFileChooser fileChooser = new JFileChooser();

        result = fileChooser.showSaveDialog(null);
        if (JFileChooser.APPROVE_OPTION == result) {
            SavaFile = new File(fileChooser.getSelectedFile().getPath());
            boolean isWrite = true;
            if (SavaFile.exists()) {
                int verifyValue = JOptionPane.showConfirmDialog(null,
                        SavaFile + "The file already exists, it is overwritten?", "Save", JOptionPane.YES_NO_OPTION,
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
                sava();
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
            sava();
        }
        if (e.getSource() == newSave) {
            sava();
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
        if (e.getSource() == Paste || e.getSource() == Paste1) {
            Paste();
        }
        if (e.getSource() == del || e.getSource() == del1) {
            del();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new Notepad().add();
    }
}

