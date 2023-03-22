package homework_13.Nona_Asatryan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

public class Notepad extends JFrame {
    private JTextArea textArea;
    private File currentFile;

    public Notepad() {

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
        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem armLang;
        private final JMenuItem rusLang;
        private final JMenuItem engLang;

        public NotepadMenuBar() {
            file = new JMenu();
            newFile = new JMenuItem();
            openFile = new JMenuItem();
            save = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language = new JMenu();
            engLang = new JMenuItem();
            armLang = new JMenuItem();
            rusLang = new JMenuItem();

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

            loadMenuLabels(LabelKey.HY);
            loadMenuLabels(LabelKey.RU);
            loadMenuLabels(LabelKey.EN);

            armLang.addActionListener(this::onArmLangActionPerformed);
            rusLang.addActionListener(this::onRusLangActionPerformed);
            engLang.addActionListener(this::onEngLangActionPerformed);
        }

        private void onArmLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.HY);
        }

        private void onRusLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.RU);
        }

        private void onEngLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.EN);
        }

        private void newFileActionPerformed(ActionEvent actionevent) {
            if (textArea.getText().isEmpty()) {
                textArea.setText("");
            } else {
                int choice = JOptionPane.showConfirmDialog(null,
                        "Do you want to save changes?",
                        "Save",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionevent);
                } else if (choice == JOptionPane.NO_OPTION) {
                    textArea.setText("");
                }
            }

        }

        private void loadMenuLabels(LabelKey labelKey) {
            Properties properties = loadMessages(labelKey);
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties) {
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("new.menu.name"));
            openFile.setText(properties.getProperty("open.menu.name"));
            save.setText(properties.getProperty("save.menu.name"));
            saveAs.setText(properties.getProperty("saveAs.menu.name"));
            close.setText(properties.getProperty("close.menu.name"));

            language.setText(properties.getProperty("language.menu.name"));
            armLang.setText(properties.getProperty("hy.menu.name"));
            rusLang.setText(properties.getProperty("ru.menu.name"));
            engLang.setText(properties.getProperty("en.menu.name"));
        }

        private Properties loadMessages(LabelKey labelKey) {
            InputStream inputStream;
            String path = "";
            switch (labelKey.getLabel()) {
                case "hy":
                    path = "i18n/label_hy.properties";
                    break;
                case "ru":
                    path = "i18n/label_ru.properties";
                    break;
                default:
                    path = "i18n/label.properties";
            }
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
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
}






