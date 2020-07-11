package structuretype.bridge.storyrealize;

import structuretype.bridge.storyrealize.impl.UnixImp;

public class Main {

    public static void main(String[] args) {
        Image image;
        ImageImp imp;

        image = new GIFImage();
        imp = new UnixImp();

        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
