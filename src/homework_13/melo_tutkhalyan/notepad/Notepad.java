package homework_13.melo_tutkhalyan.notepad;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
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
            newFile.addActionListener(this::onNewActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            enLang.addActionListener(this::onEnLanguageActionPerformed);
            amLang.addActionListener(this::onAmLanguageActionPerformed);
            ruLang.addActionListener(this::onRuLanguageActionPerformed);

            loadMenuLabels(LabelKey.HY);

        }
        

        private void onRuLanguageActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.RU);
        }

        private void onAmLanguageActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.HY);
        }

        private void onEnLanguageActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.EN);
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
                case "hy" -> "i18n/label_hy.properties";
                case "ru" -> "i18n/label_ru.properties";
                default -> "i18n/label.properties";
            };
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
        }


        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save File");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("File Type (*.txt)", "txt");
            fileChooser.setFileFilter(filter);
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().toString();
                String extension = filter.getExtensions()[0];
                if (!fileName.endsWith("." + extension)) {
                    fileName += "." + extension;
                }
                String text = textArea.getText();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(actionEvent);
                textArea.setText("");
            } else if (option == JOptionPane.NO_OPTION) {
                textArea.setText("");
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(actionEvent);
                textArea.setText("");
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    transferFileContent(textArea, fileChooser.getSelectedFile().getPath());
                }
            } else if (option == JOptionPane.NO_OPTION) {
                textArea.setText("");
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    transferFileContent(textArea, fileChooser.getSelectedFile().getPath());
                }
            }

        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                String text = textArea.getText();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

        public static void transferFileContent(JTextArea textArea, String filePath) {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        new Notepad();
    }
}
