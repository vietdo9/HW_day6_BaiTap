package BaiTapjava6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// View
public class TextView extends JFrame {
    private JTextArea textArea;
    private JButton openButton;
    private JButton saveButton;

    TextView() {
        setTitle("Bai Tap Lon Java Open File");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        openButton = new JButton("Open");
        saveButton = new JButton("Save");

        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    String getText() {
        return textArea.getText();
    }

    void setText(String newText) {
        textArea.setText(newText);
    }

    void appendText(String newText) {
        textArea.append(newText);
    }

    void clearText() {
        textArea.setText("");
    }

    void addOpenListener(ActionListener listener) {
        openButton.addActionListener(listener);
    }

    void addSaveListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
}