package homework_14.Lilit_Adamyan.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Notepad extends JFrame {

    private JTextArea textArea;
    private File currentFile;

    public Notepad() {

        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

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
            private JMenuItem armLang;
            private JMenuItem rusLang;
            private JMenuItem engLang;

            public NotepadMenuBar() {
                init();

                file.add(newFile);
                file.add(openFile);
                file.add(save);
                file.add(saveAs);
                file.add(close);

                language.add(engLang);
                language.add(armLang);
                language.add(rusLang);

                add(file);
                add(language);

                newFile.addActionListener(this::newFileActionPerformed);
                openFile.addActionListener(this::onOpenActionPerformed);
                save.addActionListener(this::onSaveActionPerformed);
                saveAs.addActionListener(this::onSaveAsActionPerformed);
                close.addActionListener(this::onCloseActionPerformed);

                armLang.addActionListener(e -> loadMenuLabels(LabelKey.AM));
                rusLang.addActionListener(e -> loadMenuLabels(LabelKey.RU));
                engLang.addActionListener(e -> loadMenuLabels(LabelKey.EN));

            }

            private void init() {

                file = new JMenu();
                newFile = new JMenuItem();
                openFile = new JMenuItem();
                save = new JMenuItem();
                saveAs = new JMenuItem();
                close = new JMenuItem();

                language = new JMenu();
                engLang = new JMenuItem();
                armLang = new JMenuItem();
                rusLang = new JMenuItem();

                loadMenuLabels(LabelKey.EN);

            }

            private void updateMenuText(Properties properties) {
                file.setText(properties.getProperty("menu.file"));
                newFile.setText(properties.getProperty("menu.new"));
                openFile.setText(properties.getProperty("menu.open"));
                save.setText(properties.getProperty("menu.save"));
                saveAs.setText(properties.getProperty("menu.saveAs"));
                close.setText(properties.getProperty("menu.close"));

                language.setText(properties.getProperty("menu.language"));
                engLang.setText(properties.getProperty("menu.english"));
                armLang.setText(properties.getProperty("menu.armenian"));
                rusLang.setText(properties.getProperty("menu.russian"));
            }

            private void loadMenuLabels(LabelKey labelKey) {
                InputStream inputStream;
                String path = switch (labelKey.getLabel()) {
                    case "hy" -> "i18n/Notepad_arm.properties";
                    case "ru" -> "i18n/Notepad_ru.properties";
                    default -> "i18n/Notepad.properties";

                };
                inputStream = getClass().getClassLoader().getResourceAsStream(path);
                Properties properties = new Properties();
                try {
                    Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                    properties.load(reader);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                updateMenuText(properties);
            }


            private void newFileActionPerformed(ActionEvent actionevent) {
                if (textArea.getText().isEmpty()) {
                    textArea.setText("");
                } else {
                    int choice = JOptionPane.showConfirmDialog(null,
                            "Do you want to save your changes?",
                            "Save changes",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                    if (choice == JOptionPane.YES_OPTION) {
                        onSaveActionPerformed(actionevent);
                    } else if (choice == JOptionPane.NO_OPTION) {
                        textArea.setText("");
                    }
                }

            }

            private void onOpenActionPerformed(ActionEvent actionEvent) {
                if (!textArea.getText().equals("")) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save the changes to "
                            + getTitle() + "?", "Confirm Open", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        onSaveAsActionPerformed(actionEvent);
                    } else if (confirm == JOptionPane.CANCEL_OPTION) {
                        return;
                    }
                }

                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        reader.close();
                        textArea.setText(sb.toString());
                        setTitle(selectedFile.getName() + " - Notepad");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error opening file " + selectedFile.getName());
                    }
                }
            }

            private void onSaveActionPerformed(ActionEvent actionEvent) {
                if (currentFile == null) {
                    onSaveAsActionPerformed(actionEvent);
                } else {
                    try {
                        FileWriter writer = new FileWriter(currentFile);
                        writer.write(textArea.getText());
                        writer.close();
                        setTitle(currentFile.getName() + " - Notepad");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error saving file " + currentFile.getName());
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
                        setTitle(currentFile.getName() + " - Notepad");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error saving file " + selectedFile.getName());
                    }
                }
            }

            private void onCloseActionPerformed(ActionEvent actionEvent) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                    System.exit(0);
                }
                if (option == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        }

        public static void main(String[] args) {
            new Notepad();
        }


        enum LabelKey{
        AM("hy"),RU("ru"),EN("en");
        private String label;
        LabelKey(String label){
            this.label = label;
        }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }
        }

}






