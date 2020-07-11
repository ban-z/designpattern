package creationtype.builder.eg;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder() {
            @Override
            public void buildPartA() {
                //...
                //dosomething
            }

            @Override
            public void buildPartB() {
                //...
                //dosomething
            }

            @Override
            public void buildPartC() {
                //...
                //dosomething
            }
        };
        Director director = new Director(builder);
        Product product = director.construct();
    }
}
