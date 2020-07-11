package structuretype.proxy.storyrealized;

public class RealSearcher implements Searcher {
    @Override
    public String DoSearch(String userId, String keyWord) {
        System.out.println("用户"+ userId +"使用关键词"+ keyWord +"查询商务信息！");
        return "返回具体内容";
    }
}
