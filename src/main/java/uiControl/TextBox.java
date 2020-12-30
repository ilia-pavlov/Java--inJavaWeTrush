package uiControl;

public class TextBox extends UIControl {
    private String text = ""; // text field in Text Box object

//

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void clear() {
        text = "";
    }
}

