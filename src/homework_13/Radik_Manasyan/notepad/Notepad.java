package homework_13.Radik_Manasyan.notepad;


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
    private boolean isSaveFile = false;
    private String path = null;

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

        public NotepadMenuBar() {
            init();

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language.add(enLang);
            language.add(amLang);
            language.add(ruLang);

            add(file);
            add(language);

            newFile.addActionListener(this::newFileActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::saveAsActionPerformed);
            close.addActionListener(this::onCloseActionPerformed);

            amLang.addActionListener(e -> loadMenuLabels(LanguageType.AM));
            ruLang.addActionListener(e -> loadMenuLabels(LanguageType.RU));
            enLang.addActionListener(e -> loadMenuLabels(LanguageType.EN));
        }


        private void newFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                if (option == JOptionPane.YES_OPTION) {
                    JFileChooser jFileChooser = new JFileChooser();
                    int i = jFileChooser.showSaveDialog(jFileChooser);
                    if (i == JFileChooser.APPROVE_OPTION) {
                        saveText(String.valueOf(jFileChooser.getSelectedFile()));
                        onSaveActionPerformed(actionEvent);
                    }
                }
                if (option == JOptionPane.NO_OPTION) {
                    textArea.setText("");
                }
            } else {
                new Notepad();
            }
        }

        private void onOpenActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();

            if (isSaveFile || textArea.getText().length() == 0) {
                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    path = fileChooser.getSelectedFile().toString();
                    StringBuffer stringBuffer = readFile(path);
                    textArea.setText(String.valueOf(stringBuffer));
                }
            } else {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");

                if (option == JOptionPane.YES_OPTION) {
                    fileChooser.showSaveDialog(fileChooser);
                    path = fileChooser.getSelectedFile().toString();
                    saveText(path);
                }

                int choice = fileChooser.showOpenDialog(this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    path = fileChooser.getSelectedFile().toString();
                    StringBuffer stringBuffer = readFile(path);
                    textArea.setText(String.valueOf(stringBuffer));
                }
            }
        }

        private void init() {
            file = new JMenu();
            newFile = new JMenuItem();
            openFile = new JMenuItem();
            save = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();

            language = new JMenu();
            enLang = new JMenuItem();
            amLang = new JMenuItem();
            ruLang = new JMenuItem();

            loadMenuLabels(LanguageType.EN);

        }

        private void loadMenuLabels(LanguageType languageType) {

            InputStream inputStream;
            String path = switch (languageType.getLabel()) {
                case "hy" -> "homework_13/Radik_Manasyan/notepad/notepad_hy.properties";
                case "ru" -> "homework_13/Radik_Manasyan/notepad/notepad_ru.properties";
                default -> "homework_13/Radik_Manasyan/notepad/notepad.properties";
            };

            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                properties.load(reader);

            } catch (IOException e) {
                e.printStackTrace();
            }
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties) {
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("create.menu.item.name"));
            save.setText(properties.getProperty("save.menu.item.name"));
            saveAs.setText(properties.getProperty("saves.menu.name"));
            openFile.setText(properties.getProperty("open.menu.item.name"));
            close.setText(properties.getProperty("close.menu.item.name"));
            language.setText(properties.getProperty("lang.menu.name"));
            enLang.setText(properties.getProperty("lang.en.menu.item.name"));
            amLang.setText(properties.getProperty("lang.am.menu.item.name"));
            ruLang.setText(properties.getProperty("lang.ru.menu.item.name"));
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            JFileChooser fileChooser = new JFileChooser();

            if (isSaveFile) {
                textArea.setText(text);
                saveText(path);
                return;
            }
            int i = fileChooser.showSaveDialog(fileChooser);
            if (i == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getName();
                String directory = path.substring(0, path.length() - fileName.length() - 1);
                File file = new File(directory);
                File[] files = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.equals(fileName);
                    }
                });

                if (files.length != 0) {
                    saveText(path);
                    isSaveFile = true;
                }
            }
        }

        private void saveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser jFileChooser = new JFileChooser();
            int i = jFileChooser.showSaveDialog(jFileChooser);
            if (i == JFileChooser.APPROVE_OPTION) {
                String fileName = jFileChooser.getSelectedFile().getName();
                String directory = path.substring(0, path.length() - fileName.length() - 1);
                File file = new File(directory);
                File[] files = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.equals(fileName);
                    }
                });

                if (files.length == 0) {
                    saveText(path);
                    isSaveFile = true;
                } else {
                    JOptionPane.showInternalMessageDialog(jFileChooser, "Change file name");
                }
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            String[] text = textArea.getText().split("\n");

            if (path == null && textArea.getText().length() == 0) {
                System.exit(0);
            } else if (path == null && textArea.getText().length() > 0) {
                fileCloseHelper(e);
            } else {
                String[] split = readFile(path).toString().split("\n");

                if (split.length == text.length) {
                    for (int i = 0; i < text.length; i++) {
                        if (!text[i].equals(split[i])) {
                            fileCloseHelper(e);
                        }
                    }
                    System.exit(0);

                } else {
                    fileCloseHelper(e);
                }
            }
        }

        private void fileCloseHelper(ActionEvent actionEvent) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");

            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(actionEvent);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }

        private void saveText(String path) {
            String text = textArea.getText();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private StringBuffer readFile(String path) {
            String str;
            StringBuffer stringBuffer = new StringBuffer();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
                do {
                    str = bufferedReader.readLine();
                    if (str != null) {
                        stringBuffer.append(str + "\n");
                    }
                } while (str != null);

            } catch (IOException e) {
                System.out.println("Input correct file path.");
            }

            return stringBuffer;
        }
    }

    enum LanguageType {
        AM("hy"), EN("en"), RU("ru");

        private String label;

        LanguageType(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
