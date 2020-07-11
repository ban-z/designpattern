package creationtype.builder.storyrealized;

public class Client {

    public static void main(String[] args) {
        Actor actor;
        ActorBuilder ab = new AngelBuilder();
        ActorController ac = new ActorController();

        actor = ac.construct(ab);
        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());

    }
}
