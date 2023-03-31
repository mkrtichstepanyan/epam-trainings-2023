package homework_13.Davit_Poghosyan.Notepad;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
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
            jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);
            jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);

            NotePadMenuBar menuBar = new NotePadMenuBar();

            add(jScrollPane);
            add(menuBar, BorderLayout.NORTH);

            setSize(800, 600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        class NotePadMenuBar extends JMenuBar {
            private JMenu file;
            private JMenuItem newFile;
            private JMenuItem openFile;
            private JMenuItem saveFile;
            private JMenuItem saveAs;
            private JMenuItem close;

            private JMenu language;
            private JMenuItem amLang;
            private JMenuItem rusLang;
            private JMenuItem engLang;

            public void init() {
                file = new JMenu();
                newFile = new JMenuItem();
                openFile = new JMenuItem();
                saveFile = new JMenuItem();
                saveAs = new JMenuItem();
                close = new JMenuItem();
                language = new JMenu();
                amLang = new JMenuItem();
                rusLang = new JMenuItem();
                engLang = new JMenuItem();

                loadMenuLabels(LanguageType.EN);
            }


            public NotePadMenuBar() {
                init();

                file.add(newFile);
                file.add(openFile);
                file.add(saveFile);
                file.add(saveAs);
                file.add(close);

                language.add(engLang);
                language.add(amLang);
                language.add(rusLang);

                add(file);
                add(language);

                close.addActionListener(this::onCloseActionPerformed);
                saveFile.addActionListener(this::onSaveActionPerformed);
                openFile.addActionListener(this::onOpenActionPerformed);

                amLang.addActionListener(e -> loadMenuLabels(LanguageType.AM));
                rusLang.addActionListener(e -> loadMenuLabels(LanguageType.RU));
                engLang.addActionListener(e -> loadMenuLabels(LanguageType.EN));

            }

            private void onOpenActionPerformed(ActionEvent actionEvent) {
                JFileChooser chooser = new JFileChooser();
                int choice = chooser.showOpenDialog(this);
                if(choice == JFileChooser.APPROVE_OPTION){
                    System.out.println("File is opened");
                }
            }

            private void onSaveActionPerformed(ActionEvent actionEvent) {
                String text = textArea.getText();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile));
                    writer.write(text);
                } catch (IOException e) {
                    e.printStackTrace();
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


            private void loadMenuLabels(Properties properties) {
                file.setText(properties.getProperty("file.menu.name"));
                newFile.setText(properties.getProperty("new.menu.item.name"));
                openFile.setText(properties.getProperty("open.menu.item.name"));
                saveFile.setText(properties.getProperty("save.menu.item.name"));
                saveAs.setText(properties.getProperty("saveAs.menu.item.name"));
                close.setText(properties.getProperty("close.menu.item.name"));

                language.setText(properties.getProperty("language.menu.name"));
                engLang.setText(properties.getProperty("en.menu.item.name"));
                amLang.setText(properties.getProperty("hy.menu.item.name"));
                rusLang.setText(properties.getProperty("ru.menu.item.name"));
            }


            private void loadMenuLabels(LanguageType languageType) {
                InputStream stream;
                String path = switch (languageType.getLabel()) {
                    case "hy" -> "resources/davit_poghosyan/notepad_hy.properties";
                    case "ru" -> "resources/davit_poghosyan/notepad_ru.properties";
                    default -> "resources/davit_poghosyan/notepad.properties";
                };
                Properties properties = new Properties();
                try {   stream = new FileInputStream(path);


                    if(stream!=null) {
                        Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
                        properties.load(reader);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                loadMenuLabels(properties);
            }
        }


        enum LanguageType {
            AM("hy"),
            EN("en"),
            RU("ru");
            String label;

            LanguageType(String label) {
                this.label = label;
            }

            public String getLabel() {
                return label;
            }
        }

        public static void main(String[] args) {
            new Notepad();
        }
    }

