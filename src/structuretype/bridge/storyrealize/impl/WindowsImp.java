package structuretype.bridge.storyrealize.impl;

import structuretype.bridge.storyrealize.ImageImp;
import structuretype.bridge.storyrealize.Matrix;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Windows操作系统中显示图像：");
    }
}
