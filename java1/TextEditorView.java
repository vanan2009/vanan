package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
public class TextEditorView extends JFrame {
    private JTextArea textArea;
    private JButton saveButton;
    private JButton loadButton;
    private JFileChooser fileChooser;

    public TextEditorView() {
        setTitle("Text Editor");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        saveButton = new JButton("SAVE");
        loadButton = new JButton("LOAD");

        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);

        add(buttonPanel, BorderLayout.SOUTH);

        fileChooser = new JFileChooser();
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }

    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void addLoadButtonListener(ActionListener listener) {
        loadButton.addActionListener(listener);
    }

    public File showFileChooser(String title) {
        fileChooser.setDialogTitle(title);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }
}
