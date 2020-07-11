package structuretype.proxy.storyrealized;

public class ProxySearcher implements Searcher {

    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator = new AccessValidator();
    private Logger logger = new Logger();

    @Override
    public String DoSearch(String userId, String keyWord) {
        if (validator.Validate(userId)){
            String result = realSearcher.DoSearch(userId, keyWord);
            logger.Log(userId);
            return result;
        }else {
            return null;
        }
    }
}
