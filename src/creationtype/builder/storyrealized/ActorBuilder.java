package creationtype.builder.storyrealized;

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildcustume();
    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }
}
