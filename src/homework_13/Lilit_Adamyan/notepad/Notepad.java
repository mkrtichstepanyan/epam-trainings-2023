package homework_13.Lilit_Adamyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class Notepad extends JFrame {
    private ResourceBundle resourceBundle;
    private JTextArea textArea;
    private File currentFile;


    public Notepad() {
        resourceBundle = ResourceBundle.getBundle("resources/i18n/Notepad");

        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar {
        private JMenu file;
        private JMenuItem newFile;
        private  JMenuItem openFile;
        private  JMenuItem save;
        private  JMenuItem saveAs;
        private  JMenuItem close;

        private  JMenu language;
        private  JMenuItem armLang;
        private  JMenuItem rusLang;
        private  JMenuItem engLang;

        public NotepadMenuBar() {
            file = new JMenu(resourceBundle.getString("menu.file"));
            newFile = new JMenuItem(resourceBundle.getString("menu.new"));
            openFile = new JMenuItem(resourceBundle.getString("menu.open"));
            save = new JMenuItem(resourceBundle.getString("menu.save"));
            saveAs = new JMenuItem(resourceBundle.getString("menu.saveAs"));
            close = new JMenuItem(resourceBundle.getString("menu.close"));

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language = new JMenu(resourceBundle.getString("menu.language"));
            engLang = new JMenuItem(resourceBundle.getString("menu.english"));
            armLang = new JMenuItem(resourceBundle.getString("menu.armenian"));
            rusLang = new JMenuItem(resourceBundle.getString("menu.russian"));

            language.add(engLang);
            language.add(armLang);
            language.add(rusLang);

            add(file);
            add(language);

            newFile.addActionListener(this::newFileActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            close.addActionListener(this::onCloseActionPerformed);

            armLang.addActionListener(e -> updateLocale(LabelKey.AM));
            rusLang.addActionListener(e -> updateLocale(LabelKey.RU));
            engLang.addActionListener(e -> updateLocale(LabelKey.EN));

        }

        private void updateLocale(LabelKey labelKey) {
            loadMessages(labelKey);
            updateMenuText();

        }

        private void updateMenuText() {
            file.setText(resourceBundle.getString("menu.file"));
            newFile.setText(resourceBundle.getString("menu.new"));
            openFile.setText(resourceBundle.getString("menu.open"));
            save.setText(resourceBundle.getString("menu.save"));
            saveAs.setText(resourceBundle.getString("menu.saveAs"));
            close.setText(resourceBundle.getString("menu.close"));

            language.setText(resourceBundle.getString("menu.language"));
            engLang.setText(resourceBundle.getString("menu.english"));
            armLang.setText(resourceBundle.getString("menu.armenian"));
            rusLang.setText(resourceBundle.getString("menu.russian"));
        }
        private Properties loadMessages(LabelKey labelKey){
            InputStream inputStream;
            String path = "";
            switch ((labelKey.getLabel())){
                case "am":
                    path = "i18n/Notepad_arm.properties";
                    break;
                case "ru":
                    path ="i18n/Notepad_ru.properties";
                    break;
                default:
                    path= "i18n/Notepad.properties";
                    break;

            }
            inputStream = getClass().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return properties;
        }

        private void newFileActionPerformed(ActionEvent actionevent) {
            if (textArea.getText().isEmpty()) {
                textArea.setText("");
            } else {
                int choice = JOptionPane.showConfirmDialog(null,
                        "Do you want to save your changes?",
                        "Save changes",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionevent);
                } else if (choice == JOptionPane.NO_OPTION) {
                    textArea.setText("");
                }
            }

        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (!textArea.getText().equals("")) {
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save the changes to "
                        + getTitle() + "?", "Confirm Open", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    onSaveAsActionPerformed(actionEvent);
                } else if (confirm == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }

            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    reader.close();
                    textArea.setText(sb.toString());
                    setTitle(selectedFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error opening file " + selectedFile.getName());
                }
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            if (currentFile == null) {
                onSaveAsActionPerformed(actionEvent);
            } else {
                try {
                    FileWriter writer = new FileWriter(currentFile);
                    writer.write(textArea.getText());
                    writer.close();
                    setTitle(currentFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file " + currentFile.getName());
                }
            }
        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(selectedFile);
                    writer.write(textArea.getText());
                    writer.close();
                    currentFile = selectedFile;
                    setTitle(currentFile.getName() + " - Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file " + selectedFile.getName());
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


    enum LabelKey{
        AM("am"),RU("ru"),EN("en");
        private String label;
        LabelKey(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }

}



