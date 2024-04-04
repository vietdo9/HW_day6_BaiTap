package BaiLam;

import java.io.File;
import java.io.IOException;

// Main class
public class Main {
    public static void main(String[] args) {
        EditorModel model = new EditorModel();
        EditorView view = new EditorView();
        EditorController controller = new EditorController(model, view);

        // Load data from file
        try {
            File inputFile = new File("D:\\javaproject\\Btap\\src\\input.txt");
            controller.loadFromFile(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display lines
        controller.displayLines();

        // Save data to file
        try {
            File outputFile = new File("D:\\javaproject\\Btap\\src\\output.txt");
            controller.saveToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
