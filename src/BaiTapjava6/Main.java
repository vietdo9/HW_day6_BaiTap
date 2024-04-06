package BaiTapjava6;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        TextModel model = new TextModel();
        TextView view = new TextView();
        view.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\javaproject-2\\Btap61\\src\\2205218_folder_document_file_organize_icon.png"));
        TextController controller = new TextController(model, view);

        SwingUtilities.invokeLater(() -> view.setVisible(true));
    }
}

