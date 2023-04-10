package homework_13.robert_nazaryan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

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
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            enLang.addActionListener(e -> loadMenuLabels(LabelKey.EN));
            ruLang.addActionListener(e -> loadMenuLabels(LabelKey.RU));
            amLang.addActionListener(e -> loadMenuLabels(LabelKey.HY));

        }

        private void loadMenuLabels(LabelKey labelKey) {
            InputStream inputStream;
            String path = switch (labelKey.getLabel()) {
                case "hy" -> "homework_13/robert_nazaryan/notepad/i18n/label_hy.properties";
                case "ru" -> "homework_13/robert_nazaryan/notepad/i18n/label_ru.properties";
                default -> "homework_13/robert_nazaryan/notepad/i18n/label.properties";
            };
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                properties.load(reader);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                }
            }

            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    StringBuilder fileText = new StringBuilder();
                    while ((line = bufferedReader.readLine()) != null) {
                        fileText.append(line).append("\n");
                    }
                    textArea.setText(fileText.toString());
                    currentFile = selectedFile;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
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

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            JFileChooser fileChooser = new JFileChooser();
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
            }
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
        HY("hy"),
        RU("ru"),
        EN("en");
        private String label;

        LabelKey(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
