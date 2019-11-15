package creationtype.factory.abstractfactory.storyrealize.factory;

import creationtype.factory.abstractfactory.storyrealize.Button;
import creationtype.factory.abstractfactory.storyrealize.SkinFactory;
import creationtype.factory.abstractfactory.storyrealize.TextField;
import creationtype.factory.abstractfactory.storyrealize.button.SummerButton;
import creationtype.factory.abstractfactory.storyrealize.textfield.SummerTextField;
import javafx.scene.control.ComboBox;

public
class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }
}
