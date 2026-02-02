package ui.factory;

import ui.button.Button;
import ui.products.TextBox;

public interface UIAbstractFactory {
    Button createButton();
    TextBox createTextBox();
}
