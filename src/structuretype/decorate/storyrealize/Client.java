package structuretype.decorate.storyrealize;

import structuretype.decorate.storyrealize.components.Window;
import structuretype.decorate.storyrealize.decorates.ScrollBarDecorator;

public class Client {

    public static void main(String[] args) {

        Component component, componentSB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
    }
}
