package creationtype.builder.storyrealized;

public class ActorController {

    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildcustume();
        ab.buildFace();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
