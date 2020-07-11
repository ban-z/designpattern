package creationtype.prototype.storyrealize;

import java.io.*;

// 能够实现克隆的Java类必须实现一个标识接口Cloneable，表示这个Java类支持被复制
// 如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常
public class WeekLog implements Cloneable, Serializable {

    private  String name;
    private  String date;
    private  String content;

    /*
    * 在这种方法中，使用深浅不同的克隆的方式完成对附件的克隆
    * */
    private Attachment attachment;// 浅附件类
    private Attachment2 attachment2; // 深附件类

    public WeekLog clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (WeekLog) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
            return null;
        }
    }

    public WeekLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeekLog) ois.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Attachment2 getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(Attachment2 attachment2) {
        this.attachment2 = attachment2;
    }
}
