package structuretype.adapter.eg;

import netscape.security.Target;

public class Adapter extends Target {

    private  Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request(){
        adaptee.specificRequest(); //转发调用
    }
}

class Adaptee {


    public void specificRequest() {

    }
}