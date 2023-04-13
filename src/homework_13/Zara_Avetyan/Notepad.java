package homework_13.Zara_Avetyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private final JTextArea textArea;

    private final File currentFile;

    public Notepad() {
        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new Notepad.NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar {

        private JMenu file;
        private JMenuItem newFile;
        private JMenuItem openFile;
        private JMenuItem save;
        private JMenuItem saveAs;
        private JMenuItem close;

        private JMenu language;
        private JMenuItem amLang;
        private JMenuItem enLang;
        private JMenuItem ruLang;

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
            loadMenuLabels(LabelKey.EN);

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            amLang.addActionListener(this::onAmLangActionPerformed);
            enLang.addActionListener(this::onEnLangActionPerformed);
            ruLang.addActionListener(this::onRuLangActionPerformed);
        }


        private void onAmLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.AM);
        }

        private void onEnLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.EN);
        }

        private void onRuLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.RU);
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
            amLang.setText(properties.getProperty("hy.menu.name"));
            enLang.setText(properties.getProperty("en.menu.name"));
            ruLang.setText(properties.getProperty("ru.menu.name"));

        }

        private Properties loadMessages(LabelKey labelKey) {
            InputStream inputStream;
            String path = "";
            switch (labelKey.getLabel()) {
                case "am":
                    path = "homework_13/Zara_Avetyan/i18n/label_hy.properties";
                    break;
                case "ru":
                    path = "homework_13/Zara_Avetyan/i18n/label_ru.properties";
                    break;
                default:
                    path = "homework_13/Zara_Avetyan/i18n/label.properties";
            }
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return properties;
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

        enum LabelKey {
            AM("am"),
            EN("en"),
            RU("ru");

            private String label;

            LabelKey(String label) {
                this.label = label;
            }

            public String getLabel() {
                return label;
            }
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
