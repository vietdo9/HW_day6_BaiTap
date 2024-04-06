package BaiTapjava6;

import javax.swing.*;
import java.io.*;
import java.util.stream.Stream;

// Controller
public class TextController {
    private TextModel model;
    private TextView view;

    TextController(TextModel model, TextView view) {
        this.model = model;
        this.view = view;

        view.addOpenListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (Stream<String> stream = new BufferedReader(new FileReader(selectedFile)).lines()) {
                    StringBuilder fileContent = new StringBuilder();
                    stream.forEach(line -> {
                        fileContent.append(line);
                        fileContent.append("\n");
                    });
                    view.setText(fileContent.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        view.addSaveListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (PrintWriter writer = new PrintWriter(selectedFile)) {
                    writer.println(view.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}