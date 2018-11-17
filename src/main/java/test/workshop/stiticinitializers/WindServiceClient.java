package test.workshop.stiticinitializers;

import java.util.List;

public class WindServiceClient {

    private MetricAggregator metricAggregator;
    private WebClient webClient;

    private WindServiceClient(MetricAggregator metricAggregator, WebClient webClient) {
        this.metricAggregator = metricAggregator;
        this.webClient = webClient;
    }

    public static WindServiceClient initialize() {
        WebClient webClient = WebClient.newInstance().host("localhost").port(8080).listener("WindServiceClient.listen");
        return new WindServiceClient(new MetricAggregator(), webClient);
    }

    private void listen(WindData windData) {
        metricAggregator.send(windData);
    }

    public List<WindData> getWindData() {
        return metricAggregator.getWindData();
    }
}
