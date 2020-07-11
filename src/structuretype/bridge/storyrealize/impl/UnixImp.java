package structuretype.bridge.storyrealize.impl;

import structuretype.bridge.storyrealize.ImageImp;
import structuretype.bridge.storyrealize.Matrix;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.print("在Unix操作系统中显示图像：");
    }
}
