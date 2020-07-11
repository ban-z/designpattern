package structuretype.decorate.storyrealize.decorates;

import structuretype.decorate.storyrealize.Component;
import structuretype.decorate.storyrealize.ComponentDecorator;

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条！");
    }
}
