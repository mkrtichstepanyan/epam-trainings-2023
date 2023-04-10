package homework_13.TatevKocharyan.notepad;

import classwork.io.notepad.Notepad;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class NotePad extends JFrame {
    private JTextArea textArea;
    private File currentFile;

    public NotePad() {
        currentFile = new File("ResultFile.txt");
        NotePadMenuBar menuBar = new NotePadMenuBar();
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        add(menuBar, BorderLayout.NORTH);
        add(jScrollPane);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


    class NotePadMenuBar extends JMenuBar {

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

        public NotePadMenuBar() {
            init();
            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language.add(amLang);
            language.add(enLang);
            language.add(ruLang);
            add(file);
            add(language);

            newFile.addActionListener(this::onNewFileActionPerformed);
            openFile.addActionListener(this::onOpenFileActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            close.addActionListener(this::onCloseActionPerformed);

            amLang.addActionListener(e -> loadMenuLabels(LanguageType.AM));
            ruLang.addActionListener(e -> loadMenuLabels(LanguageType.RU));
            enLang.addActionListener(e -> loadMenuLabels(LanguageType.EN));

        }
        private void init(){
            file = new JMenu();
            newFile = new JMenuItem();
            openFile = new JMenuItem();
            save = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();
            language = new JMenu();
            amLang = new JMenuItem();
            enLang = new JMenuItem();
            ruLang = new JMenuItem();
            loadMenuLabels(LanguageType.EN);
        }

        private void loadMenuLabels(LanguageType languagetype) {
            String path = switch (languagetype.getLabel()) {
                case "hy" -> "tatev_kocharyan\\i18n\\notepad_hy.properties";
                case "ru" -> "tatev_kocharyan\\i18n\\notepad_ru.properties";
                default -> "tatev_kocharyan\\i18n\\notepad.properties";
            };
            InputStream inputStream =  getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try (Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)){
                properties.load(reader);


            } catch (IOException e) {
                e.printStackTrace();
            }
            loadMenuBar(properties);
        }

        private void loadMenuBar(Properties properties) {
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

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice != JFileChooser.SAVE_DIALOG) {
                File fileToSave = fileChooser.getSelectedFile();
                try (FileWriter fileWriter = new FileWriter(fileToSave)) {
                    String text = textArea.getText();
                    fileWriter.write(text);
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to exit");
                    if (option == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
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

        private void onOpenFileActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {

                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                    String readLine;
                    while ((readLine = bufferedReader.readLine()) != null) {
                        textArea.setText(readLine);
                    }
                } catch (IOException e) {

                    e.printStackTrace();
                }

            }
        }

        private void onNewFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText() != null) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save");
                onSaveActionPerformed(actionEvent);
                textArea.setText("");
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(e);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }

        }
    }

    enum LanguageType {
        AM("hy"),
        EN("en"),
        RU("ru");
        private String label;

        LanguageType(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

}