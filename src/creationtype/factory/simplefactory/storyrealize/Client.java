package creationtype.factory.simplefactory.storyrealize;

public class Client {

    private static String CHART_TYPE = "histogram";

    public Client(String type){
        CHART_TYPE = type;
    }

    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart(CHART_TYPE);
        chart.display();
    }
}
