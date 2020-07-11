package structuretype.bridge.eg1;

import java.awt.*;

// 继承转组合
public abstract class Messager {

    public abstract void Login(String userName, String passWord);
    public abstract void SendMessage(String message);
    public abstract void SendPicture(Image image);
}

abstract class MessagerImpl {

    public abstract void PlaySound();
    public abstract void DrawShape();
    public abstract void WriteText();
    public abstract void Connect();
}

// 平台实现
class PCMessagerBase extends MessagerImpl{

    Messager messager;

    @Override
    public void PlaySound() {

    }

    @Override
    public void DrawShape() {

    }

    @Override
    public void WriteText() {

    }

    @Override
    public void Connect() {

    }
}

class MobileMessagerBase extends MessagerImpl{

    Messager messager;

    @Override
    public void PlaySound() {

    }

    @Override
    public void DrawShape() {

    }

    @Override
    public void WriteText() {

    }

    @Override
    public void Connect() {

    }
}

class MessagerLite extends Messager{
    MessagerImpl messagerImpl;

    @Override
    public void Login(String userName, String passWord) {
        messagerImpl.Connect();
    }

    @Override
    public void SendMessage(String message) {
        messagerImpl.WriteText();
    }

    @Override
    public void SendPicture(Image image) {
        messagerImpl.DrawShape();
    }
}

class MessagerPerfect extends Messager{

    MessagerImpl messagerImpl;

    @Override
    public void Login(String userName, String passWord) {
        messagerImpl.Connect();
    }

    @Override
    public void SendMessage(String message) {
        messagerImpl.WriteText();
    }

    @Override
    public void SendPicture(Image image) {
        messagerImpl.DrawShape();
    }
}
// 业务抽象
// 普通版本 lite
// 高级版本 perfer

class PCMessagerLite extends Messager{

    MessagerImpl messagerImpl;

    @Override
    public void Login(String userName, String passWord) {

    }

    @Override
    public void SendMessage(String message) {

    }

    @Override
    public void SendPicture(Image image) {

    }
}

class PCMessagerPerfect extends Messager{

    MessagerImpl messagerImpl;

    @Override
    public void Login(String userName, String passWord) {

    }

    @Override
    public void SendMessage(String message) {

    }

    @Override
    public void SendPicture(Image image) {

    }
}

class MoblieMessagerLite extends Messager{

    MessagerImpl messagerImpl;

    @Override
    public void Login(String userName, String passWord) {

    }

    @Override
    public void SendMessage(String message) {

    }

    @Override
    public void SendPicture(Image image) {

    }
}

class MoblieMessagerPerfect extends MobileMessagerBase{

}