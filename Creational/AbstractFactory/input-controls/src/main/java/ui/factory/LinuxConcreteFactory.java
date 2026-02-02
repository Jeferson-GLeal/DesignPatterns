package ui.factory;

import ui.button.Button;
import ui.button.LinuxButton;
import ui.products.LinuxTextBox;
import ui.products.TextBox;

public class LinuxConcreteFactory implements UIAbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LinuxTextBox();
    }
}
