package creationtype.prototype.storyrealize;

public class Client {

    public static void main(String[] args) {
        WeekLog log = new WeekLog(); // 创建原型对象
        log.setName("张无忌");
        log.setDate("第12周");
        log.setContent("这周工作很忙，每天加班！");

        System.out.println("****周报****");
        System.out.println("周次：" + log.getDate());
        System.out.println("姓名：" + log.getName());
        System.out.println("内容：" + log.getContent());
        System.out.println("--------------------------------");

        WeekLog newLog = log.clone(); // 调用克隆方法创建克隆对象
        newLog.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + newLog.getDate());
        System.out.println("姓名：" + newLog.getName());
        System.out.println("内容：" + newLog.getContent());
        System.out.println("--------------------------------");
    }
}
