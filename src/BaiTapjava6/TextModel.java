package BaiTapjava6;

// Model
public class TextModel {
    private StringBuilder text;

    TextModel() {
        text = new StringBuilder();
    }

    String getText() {
        return text.toString();
    }

    void setText(String newText) {
        text = new StringBuilder(newText);
    }

    void appendText(String newText) {
        text.append(newText);
    }

    void clearText() {
        text.setLength(0);
    }
}
