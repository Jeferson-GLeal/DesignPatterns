package ui.factory;

import ui.button.Button;
import ui.button.MacButton;
import ui.products.MacTextBox;
import ui.products.TextBox;

public class MacConcreteFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
