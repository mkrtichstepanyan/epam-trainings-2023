package homework_13.ofelya_khachatryan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

import static homework_13.ofelya_khachatryan.notepad.Notepad.LabelKey.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private JTextArea textArea;

    private File currentFile;

    public Notepad() {
        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();
        add(menuBar, BorderLayout.NORTH);
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
            enLang = new JMenuItem();
            amLang = new JMenuItem();
            ruLang = new JMenuItem();

            language.add(enLang);
            language.add(amLang);
            language.add(ruLang);

            add(file);
            add(language);

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::newFileActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            loadMenuLabels(ENGLISH);
            enLang.addActionListener(this::onEnLangActionPerformed);
            amLang.addActionListener(this::onAmLangActionPerformed);
            ruLang.addActionListener(this::onRuLangActionPerformed);

        }

        private void onRuLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(RUSSIAN);
        }

        private void onAmLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(ARMENIAN);
        }

        private void onEnLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(ENGLISH);
        }

        private void loadMenuLabels(LabelKey labelKey) {
            Properties properties = loadMessage(labelKey);
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
            enLang.setText(properties.getProperty("en.menu.name"));
            amLang.setText(properties.getProperty("hy.menu.name"));
            ruLang.setText(properties.getProperty("ru.menu.name"));
        }

        private Properties loadMessage(LabelKey labelKey) {
            InputStream inputStream;
            String path = switch (labelKey.getLabel()) {
                case "hy" -> "ofelya_khachatryan\\label_hy.properties";
                case "ru" -> "ofelya_khachatryan\\label_ru.properties";
                default -> "ofelya_khachatryan\\label.properties";
            };
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return properties;
        }

        private void newFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().isEmpty()) {
                textArea.setText("");
            } else {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to save changes?",
                        "Save", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                } else if (choice == JOptionPane.NO_OPTION) {
                    textArea.setText(" ");
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
                    setTitle(currentFile.getName() + "_Notepad");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving file" + selectedFile.getName());
                }
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                System.out.println("File is opened");
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

    enum LabelKey {

        ARMENIAN("hy"),
        ENGLISH("en"),
        RUSSIAN("ru");

        private String label;

        LabelKey(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

    }

    public static void main(String[] args) {
        new Notepad();
    }
}
