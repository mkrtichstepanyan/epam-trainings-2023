package homework_13.Qnarik_Khachatryan.notepad;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;


public class Nodepad extends JFrame {
    private JTextArea textArea;

    private File currentFile;
    private String filePath = "";


    public Nodepad() {
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
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);

            enLang.addActionListener(this::onEnLangActionPerformed);
            amLang.addActionListener(this::onAmLangActionPerformed);
            ruLang.addActionListener(this::onRuLangActionPerformed);

            loadMenuLabels(LabelKey.EN);

        }

        private void onEnLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.EN);
        }

        private void onAmLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.HY);
        }

        private void onRuLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(LabelKey.RU);
        }

        private void loadMenuLabels(LabelKey labelKey){
            Properties properties = loadMessages(labelKey);
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties){
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("newFile.menu.name"));
            openFile.setText(properties.getProperty("openFile.menu.name"));
            save.setText(properties.getProperty("save.menu.name"));
            saveAs.setText(properties.getProperty("saveAs.menu.name"));
            close.setText(properties.getProperty("close.menu.name"));

            language.setText(properties.getProperty("language.menu.name"));
            enLang.setText(properties.getProperty("enLang.menu.name"));
            amLang.setText(properties.getProperty("amLang.menu.name"));
            ruLang.setText(properties.getProperty("ruLang.menu.name"));

        }

        private Properties loadMessages(LabelKey labelKey) {
            String path = "";
            switch (labelKey.getLabel()) {
                case "hy":
                    path = "/Qnarik_Khachatryan/i18n/label_hy.properties";
                    break;
                case "ru":
                    path = "/Qnarik_Khachatryan/i18n/label_ru.properties";
                    break;
                default:
                    path = "/Qnarik_Khachatryan/i18n/label.properties";
            };

            Properties properties = new Properties();

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
            if (inputStream!= null) {
                try (InputStreamReader reader = new InputStreamReader(inputStream)){
                    properties.load(reader);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return properties;
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            File selectedFIle = fileChooser.getSelectedFile();
            if (choice == JFileChooser.APPROVE_OPTION) {
                String currentText = textArea.getText();
                if (currentFile != null) {
                    if (isChanged(currentText, currentFile)) {
                        int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                        if (option == JOptionPane.YES_OPTION) {
                            onSaveActionPerformed(actionEvent);
                        }
                        openSelectedFile(selectedFIle);
                    }
                    openSelectedFile(selectedFIle);

                }
                if (currentFile == null && currentText.length() > 0) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(actionEvent);
                    }
                    openSelectedFile(selectedFIle);
                }
                openSelectedFile(selectedFIle);
            }
        }

        private void onNewActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            File currentFile = fileChooser.getSelectedFile();
            String currentText = textArea.getText();
            if (currentFile != null) {
                System.out.println(currentFile.getName());

                if (!isChanged(currentText, currentFile)) {
                    textArea.setText("");
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionEvent);
                        textArea.setText("");
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }
            }
            if (currentFile == null) { // new file
                if (currentText.length() > 0) {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(actionEvent);
                        textArea.setText("");
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            if (currentFile != null) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else onSaveAsActionPerformed(actionEvent);
        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            JFileChooser dirChooser = new JFileChooser();
            int choice = dirChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                String chosenDirPath = dirChooser.getSelectedFile().getAbsolutePath();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(chosenDirPath))) {
                    bufferedWriter.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                System.exit(0);
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            String currentText = textArea.getText(); // текст в момент закрытия
            if (currentFile != null) {
                if (!isChanged(currentText, currentFile)) {
                    System.exit(0);
                } else {
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
            if (currentFile == null) {
                if (currentText.length() == 0) {
                    System.exit(0);
                } else {
                    int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                    if (option == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(e);
                        System.exit(0);
                    }
                    if (option == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                }
            }
        }

        private boolean isChanged(String textFromArea, File currentFile) {
            String textFromSavedFile = "";
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(currentFile))) {
                textFromSavedFile += bufferedReader.read();
            } catch (IOException err) {
                err.printStackTrace();
            }
            return !textFromArea.contentEquals(textFromSavedFile);
        }

        private void openSelectedFile(File selectedFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                textArea.setText(sb.toString());

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
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
    }

    public static void main(String[] args) {
        new Nodepad();
    }
}
