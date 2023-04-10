package homework_13.Yeghia_Ansuryan.notepad;

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
        setSize(700, 400);
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
        private JMenuItem duLang;

        public NotepadMenuBar() {
            init();

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language.add(amLang);
            language.add(enLang);
            language.add(ruLang);
            language.add(duLang);

            add(file);
            add(language);

            setTitle(currentFile.getName());

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewFileActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            amLang.addActionListener(e -> loadMenuLabels(LanguagesType.HY));
            ruLang.addActionListener(e -> loadMenuLabels(LanguagesType.RU));
            enLang.addActionListener(e -> loadMenuLabels(LanguagesType.EN));
            duLang.addActionListener(e -> loadMenuLabels(LanguagesType.DU));

        }

        private void init() {
            file = new JMenu();
            newFile = new JMenuItem();
            openFile = new JMenuItem();
            save = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();

            language = new JMenu("Language");
            amLang = new JMenuItem("Armenian");
            enLang = new JMenuItem("English");
            ruLang = new JMenuItem("Russian");
            duLang = new JMenuItem("Deutsch");

            loadMenuLabels(LanguagesType.EN);
        }

        private void loadMenuLabels(LanguagesType languageType) {
            InputStream inputStream;
            String path = switch (languageType.getLabel()) {
                case "hy" -> "Yeghia_Ansuryan/i18n/notepad_hy.properties";
                case "ru" -> "Yeghia_Ansuryan/i18n/notepad_ru.properties";
                case "du" -> "Yeghia_Ansuryan/i18n/notepad_du.properties";
                default -> "Yeghia_Ansuryan/i18n/notepad.properties";
            };
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            if (inputStream != null) {
                try (Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
                    properties.load(reader);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties) {
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
            duLang.setText(properties.getProperty("lang.du.menu.item.name"));
        }

        private void onCloseActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() == 0) {
                System.exit(0);
            }
            int option = JOptionPane.showConfirmDialog(this, "Do you would like to save ?");
            if (option == JOptionPane.YES_OPTION) {
                ActionEvent e = null;
                onSaveAsActionPerformed(e);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            if (currentFile == null) {
                JFileChooser fileChooser = new JFileChooser();
                int userSelection = fileChooser.showSaveDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    currentFile = fileChooser.getSelectedFile();
                }
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you would like to save your changes ?");
                if (option == JOptionPane.YES_OPTION) {
                    ActionEvent activeEvent = null;
                    onSaveAsActionPerformed(activeEvent);
                }
            }
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile))) {
                    StringBuilder fileContent = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        fileContent.append(line).append("\n");
                    }
                    textArea.setText(fileContent.toString());
                    setTitle(selectedFile.getName());
                    currentFile = selectedFile;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onNewFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you would like to save your changes ?");
                if (option == JOptionPane.YES_OPTION) {
                    ActionEvent activeEvent = null;
                    onSaveAsActionPerformed(activeEvent);
                }
            }
            textArea.setText("");
            setTitle("New File");
            currentFile = null;
        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                    bufferedWriter.write(textArea.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                currentFile = selectedFile;
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }

}
