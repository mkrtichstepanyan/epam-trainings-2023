package homework_13.Ani_Barseghyan.notepad;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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


    public class NotepadMenuBar extends JMenuBar {
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
        private static boolean isModified = false;


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


            if (!isTextModified(textArea)) {
                save.setEnabled(false);
            }

            textArea.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if (isTextModified(textArea)) {
                        save.setEnabled(true);
                    }
                }
            });

            close.addActionListener(this::onCloseActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);

            loadMenuLabels(LabelKey.EN);

            enLang.addActionListener(this::onEnLangActionPerformed);
            amLang.addActionListener(this::onAmLangActionPerformed);
            ruLang.addActionListener(this::onRuLangActionPerformed);


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
            enLang.setText(properties.getProperty("eng.menu.name"));
            amLang.setText(properties.getProperty("arm.menu.name"));
            ruLang.setText(properties.getProperty("ru.menu.name"));
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
                properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
        }

        enum LabelKey {
            AM("hy"),
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

        private static boolean isTextModified(JTextArea textArea) {
            textArea.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    isModified = true;
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    isModified = true;
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    isModified = true;
                }
            });
            return isModified;
        }


        private void onCloseActionPerformed(ActionEvent event) {
            if (textArea.getText().equals("") || !isTextModified(textArea)) {
                System.exit(0);
            }
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(event);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

        private void onSaveActionPerformed(ActionEvent event) {
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onSaveAsActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            String text = textArea.getText();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File newFIle = new File(fileChooser.getSelectedFile() + ".txt");
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFIle))) {
                    if (!textArea.getText().equals("")) {
                        bufferedWriter.write(text);
                        onSaveActionPerformed(event);
                        System.exit(0);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onOpenActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            if (textArea.getText().equals("")) {
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File chosenFile = fileChooser.getSelectedFile();
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(chosenFile))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            stringBuilder.append(line).append("\n");
                        }
                        textArea.setText(stringBuilder.toString());
                        setTitle(chosenFile.getName());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("File is opened");
                }
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?");
                if (option == JOptionPane.YES_OPTION) {
                    fileChooser.showSaveDialog(this);
                    onSaveActionPerformed(event);
                    System.exit(0);
                }
            }
        }

        private void onNewActionPerformed(ActionEvent event) {
            JFileChooser fileChooser = new JFileChooser();
            if (!textArea.getText().equals("")) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?");
                if (option == JOptionPane.YES_OPTION) {
                    fileChooser.showSaveDialog(this);
                    onSaveActionPerformed(event);
                    System.exit(0);
                } else {
                    textArea.setText("");
                }
            }
        }

        private void onAmLangActionPerformed(ActionEvent event) {
            loadMenuLabels(LabelKey.AM);
        }

        private void onRuLangActionPerformed(ActionEvent event) {
            loadMenuLabels(LabelKey.RU);
        }

        private void onEnLangActionPerformed(ActionEvent event) {
            loadMenuLabels(LabelKey.EN);
        }


    }

    public static void main(String[] args) {
        new Notepad();
    }
}
