package creationtype.factory.abstractfactory.storyrealize.factory;

import creationtype.factory.abstractfactory.storyrealize.Button;
import creationtype.factory.abstractfactory.storyrealize.SkinFactory;
import creationtype.factory.abstractfactory.storyrealize.TextField;
import creationtype.factory.abstractfactory.storyrealize.button.SpringButton;
import creationtype.factory.abstractfactory.storyrealize.textfield.SpringTextField;
import javafx.scene.control.ComboBox;

public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }
}
