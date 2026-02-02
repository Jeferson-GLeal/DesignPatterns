package ui.app;

import ui.button.Button;
import ui.factory.UIAbstractFactory;
import ui.products.TextBox;

public class Application {

    private Button button;
    private TextBox textBox;

    public Application(UIAbstractFactory factory) {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }
}
