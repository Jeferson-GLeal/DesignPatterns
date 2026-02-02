package ui.factory;

import ui.button.Button;
import ui.button.WindowsButton;
import ui.products.TextBox;
import ui.products.WindowsTextBox;

public class WindowsConcreteFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
