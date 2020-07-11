package structuretype.proxy.storyrealized;

public class Client {

    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();

        String result = searcher.DoSearch("杨过", "玉女心机");
        System.out.println(result);
    }
}
