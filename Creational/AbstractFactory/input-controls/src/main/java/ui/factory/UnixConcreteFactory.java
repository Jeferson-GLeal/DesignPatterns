package ui.factory;

import ui.button.Button;
import ui.button.UnixButton;
import ui.products.TextBox;
import ui.products.UnixTextBox;

public class UnixConcreteFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public TextBox createTextBox() {
        return new UnixTextBox();
    }
}
