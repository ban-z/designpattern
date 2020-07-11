package structuretype.proxy.eg;

public class Proxy extends Subject {

    private RealSubject realSubject = new RealSubject();

    public void PreRequest(){
        //...
    }

    private void PostRequest(){
        //...
    }

    @Override
    public void Request() {
        PreRequest();
        realSubject.Request();
        PostRequest();
    }
}
