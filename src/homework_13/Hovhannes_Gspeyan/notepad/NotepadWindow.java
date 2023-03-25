package homework_13.Hovhannes_Gspeyan.notepad;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import static homework_13.Hovhannes_Gspeyan.notepad.NotepadWindow.LabelKey.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class NotepadWindow extends JFrame {

    private boolean unsavedChanges = false;
    private File currentFile;
    private JTextArea textArea;

    public NotepadWindow() {
        currentFile = new File("result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();
        add(menuBar, BorderLayout.NORTH);

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                unsavedChanges = true;
            }

            public void removeUpdate(DocumentEvent e) {
                unsavedChanges = true;
            }

            public void changedUpdate(DocumentEvent e) {
                unsavedChanges = true;
            }

        });

        add(jScrollPane);
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar {

        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem saveFile;
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
            saveFile = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();

            file.add(newFile);
            file.add(openFile);
            file.add(saveFile);
            file.add(saveAs);
            file.add(close);

            language = new JMenu();
            amLang = new JMenuItem();
            enLang = new JMenuItem();
            ruLang = new JMenuItem();

            language.add(amLang);
            language.add(enLang);
            language.add(ruLang);

            add(file);
            add(language);

            close.addActionListener(this::onCloseActionPerformed);
            saveFile.addActionListener(this::onSaveFileActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewFileActionPerformed);
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

        private void loadMenuLabels(LabelKey labelKey){
            Properties properties = loadMessage(labelKey);
            loadMenuLabels(properties);
        }
        private void loadMenuLabels(Properties properties) {
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("new.menu.name"));
            openFile.setText(properties.getProperty("open.menu.name"));
            saveFile.setText(properties.getProperty("save.menu.name"));
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
                case "hy" -> "i18n/label_hy.properties";
                case "ru" -> "i18n/label_ru.properties";
                default -> "i18n/label.properties";
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

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String text = textArea.getText();
            if (selectedFile.isDirectory()) {
                File newFile = new File(selectedFile.getPath());
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile))) {
                    bufferedWriter.write(text);
                    unsavedChanges = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                    bufferedWriter.write(text);
                    unsavedChanges = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onNewFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().isEmpty()) {
                currentFile = null;
                textArea.setText("");
            } else if (unsavedChanges) {
                int choice = JOptionPane.showConfirmDialog(this, "do you want to save? ");
                if (choice == YES_OPTION) {
                    onSaveFileActionPerformed(actionEvent);
                }
                currentFile = null;
                textArea.setText("");
                unsavedChanges = false;
            } else {
                currentFile = null;
                textArea.setText("");
                unsavedChanges = false;
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            String lineContent;
            StringBuilder fullContent = new StringBuilder();
            if (choice == APPROVE_OPTION) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
                    while ((lineContent = reader.readLine()) != null) {
                        textArea.setText(String.valueOf(fullContent.append(lineContent).append("\n")));
                        unsavedChanges = false;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private void onSaveFileActionPerformed(ActionEvent e) {
            String text = textArea.getText();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
                writer.write(text);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            if (textArea.getText().isEmpty()) {
                System.exit(0);
            } else if (unsavedChanges) {
                int option = JOptionPane.showConfirmDialog(this, "do you want to save? ");
                if (option == YES_OPTION) {
                    onSaveFileActionPerformed(e);
                    System.exit(0);
                }
                if (option == NO_OPTION) {
                    System.exit(0);
                }
            } else {
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
        new NotepadWindow();
    }
}
