package structuretype.bridge.storyrealize;

public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}


//PNG格式图像：扩充抽象类
class JPGImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName + "，格式为JPG。");
    }
}


//BMP格式图像：扩充抽象类
class BMPImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}

//GIF格式图像：扩充抽象类
class GIFImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析GIF文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为GIF。");
    }
}