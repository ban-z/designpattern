package creationtype.factory.abstractfactory.storyrealize;

import creationtype.factory.abstractfactory.storyrealize.factory.SummerSkinFactory;

public class Client {

    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        factory = new SummerSkinFactory();
        button = factory.createButton();
        textField = factory.createTextField();

        button.display();
        textField.display();
    }
}
