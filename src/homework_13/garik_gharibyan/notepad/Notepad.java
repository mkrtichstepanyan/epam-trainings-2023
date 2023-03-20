package homework_13.garik_gharibyan.notepad;

import homework_6.Karen_Mikayelyan.chapter_8.simpleInheritane.B;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private static final String APP_NAME = "Notepad";

    String currentText;
    private JTextArea textArea;
    private File currentFile;

    public Notepad() {
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(APP_NAME);
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

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            amLang.addActionListener(e -> loadMenuLabels(LanguageType.AM));
            enLang.addActionListener(e -> loadMenuLabels(LanguageType.EN));
            ruLang.addActionListener(e -> loadMenuLabels(LanguageType.RU));

        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            currentText = textArea.getText();
            openSaveDialog(currentText);
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (!(currentText != null && currentText.equals(textArea.getText()))) {
                System.out.println("nun@ che e");
                onNewActionPerformed(actionEvent);
            }


            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                onFileSelected(fileChooser.getSelectedFile());
                currentText = "";

                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                    int c = bufferedReader.read();
                    while (c != -1) {
                        currentText = currentText + (char) c;
                        c = bufferedReader.read();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
                textArea.setText(currentText);

            } else if (choice == JFileChooser.CANCEL_OPTION) {
                System.out.println("you click: CANCEL");
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            currentText = textArea.getText();
            if (currentFile != null) {
                writer(currentFile, currentText);
            } else {
                openSaveDialog(currentText);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            currentText = textArea.getText();
            if (!currentText.isEmpty()) {
                onNewActionPerformed(e);
                System.exit(0);
            } else {
                System.exit(0);
            }

        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            currentText = textArea.getText();
            if (!currentText.isEmpty()) {

                int i = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");

                if (i == JOptionPane.NO_OPTION) {
                    System.out.println("you click: NO");
                    textArea.setText("");
                } else if (i == JOptionPane.YES_OPTION) {
                    System.out.println("you click: YES");
                    openSaveDialog(currentText);

                } else {
                    System.out.println("You click: CANCEL");
                }

            }
        }

        private void writer(File file, String text) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        private void openSaveDialog(String text) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.CANCEL_OPTION) {
                System.out.println("You click: CANCEL");
            } else if (choice == JFileChooser.APPROVE_OPTION) {
                System.out.println("You click: SAVE");
                onFileSelected(fileChooser.getSelectedFile());
                writer(currentFile, text);
            }
        }

        private void onFileSelected(File file) {
            currentFile = file;
            System.out.println("On file selected: " + file.getName());
            setTitle(currentFile.getName() + " " + APP_NAME);
        }



        enum LanguageType{
            AM("hy"),
            RU("ru"),
            EN("en");
            final String label;
            LanguageType(String label){
                this.label = label;
            }

            public String getLabel() {
                return label;
            }
        }

        private void loadMenuLabels(LanguageType languageType){
            InputStream inputStream;
            String path = switch (languageType.getLabel()) {
                case "hy" -> "i18n/notepad_hy.properties";
                case "ru" -> "i18n/notepad_ru.properties";
                default -> "i18n/notepad.properties";
            };

            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try( Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
                properties.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties){
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("create.menu.item.name"));
            save.setText(properties.getProperty("save.menu.item.name"));
            saveAs.setText(properties.getProperty("saveas.menu.name"));
            openFile.setText(properties.getProperty("open.menu.item.name"));
            close.setText(properties.getProperty("close.menu.item.name"));
            language.setText(properties.getProperty("lang.menu.name"));
            enLang.setText(properties.getProperty("lang.en.menu.item.name"));
            amLang.setText(properties.getProperty("lang.am.menu.item.name"));
            ruLang.setText(properties.getProperty("lang.ru.menu.item.name"));
        }


    }

    public static void main(String[] args) {
        new Notepad();
    }
}
