package creationtype.prototype.eg;

public class ConcretePrototype implements Prototype {

    private String attr;

    public void setAttr(String attr){
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr(this.attr);
        return concretePrototype;
    }
}
