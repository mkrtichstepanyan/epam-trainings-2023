package homework_13.karen_mikayelyan.notepad;


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

    private JLabel label;

    public Notepad() {
        currentFile = new File("Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        label = new JLabel(currentFile.getName(), JLabel.CENTER);
        label.setBounds(0, 0, 300, 30);
        label.setHorizontalTextPosition(JLabel.CENTER);
        add(label);
        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);

        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar implements FilenameFilter {

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
            loadMenuLabels(Language.EN);


            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewActionPerformed);

            amLang.addActionListener(e -> loadMenuLabels(Language.AM));
            ruLang.addActionListener(e -> loadMenuLabels(Language.RU));
            enLang.addActionListener(e -> loadMenuLabels(Language.EN));

        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {

            currentUnsavedText(actionEvent);
        }

        private void onNewActionPerformed(ActionEvent actionEvent) {

            currentUnsavedText(actionEvent);
        }

        private File onOpenActionPerformed(ActionEvent actionEvent) {

            currentUnsavedText(actionEvent);
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                writeFile(fileChooser);
            }
            label.setText(currentFile.getName());
            return currentFile;
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
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

        private void loadMenuLabels(Language language) {
            InputStream inputStream;
            String path = switch (language.getName()) {
                case "hy" -> "i18n/notepad_hy.properties";
                case "ru" -> "i18n/notepad_ru.properties";
                default -> "i18n/notepad.properties";
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
            newFile.setText(properties.getProperty("new.menu.item.name"));
            save.setText(properties.getProperty("save.menu.item.name"));
            saveAs.setText(properties.getProperty("saveAs.menu.name"));
            openFile.setText(properties.getProperty("open.menu.item.name"));
            close.setText(properties.getProperty("close.menu.item.name"));

            language.setText(properties.getProperty("lang.menu.name"));
            enLang.setText(properties.getProperty("lang.en.menu.item.name"));
            amLang.setText(properties.getProperty("lang.am.menu.item.name"));
            ruLang.setText(properties.getProperty("lang.ru.menu.item.name"));
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.equals(currentFile.getName());
        }

        private void currentUnsavedText(ActionEvent actionEvent) {
            if (!textArea.getText().equals("")) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    JFileChooser fileChooser = new JFileChooser();
                    int choice = fileChooser.showSaveDialog(this);
                    if (choice == JFileChooser.APPROVE_OPTION) {
                        String currentFileAbsolutePath = fileChooser.getSelectedFile().getAbsolutePath();
                        String currentFileName = fileChooser.getSelectedFile().getName();
                        File current = new File(currentFileAbsolutePath);
                        if (current.equals(currentFile)) {
                            currentFile = current;
                            onSaveActionPerformed(actionEvent);
                        } else if (current.exists() && current.isFile()) {
                            JOptionPane.showMessageDialog(this, String.format("Please input another name. File with %s name already exists.", currentFileName));
                            currentUnsavedText(actionEvent);
                        }
                    }
                }
                label.setText("");
                textArea.setText("");
            }
        }

        private void writeFile(JFileChooser fileChooser) {
            StringBuilder selectedFileContext = new StringBuilder();
            String lineContent;
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile))) {
                while ((lineContent = bufferedReader.readLine()) != null) {
                    selectedFileContext.append(lineContent).append("\n");
                }
                textArea.setText(String.valueOf(selectedFileContext));
                currentFile = selectedFile;
                System.out.println("File is opened");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        new Notepad();
    }
}
