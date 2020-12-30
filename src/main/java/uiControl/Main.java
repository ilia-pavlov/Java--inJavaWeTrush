package uiControl;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for (UIControl control : controls)
            control.render();
            ///
    }
}





//    UIControl control = new UIControl(true);
//    TextBox textBox = new TextBox();
//    show(control);
//}
//
//    public static void show(UIControl control) {
//        if(control instanceof TextBox) {
//            TextBox textBox = (TextBox) control;
//            textBox.setText("Hello World");
//        }
//        System.out.println(control);
//    }

