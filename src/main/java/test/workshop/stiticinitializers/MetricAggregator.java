package test.workshop.stiticinitializers;

import java.util.List;

public class MetricAggregator {
    private List<WindData> windData;

    public void send(WindData windData) {

    }

    public List<WindData> getWindData() {
        return windData;
    }

    public void setWindData(List<WindData> windData) {
        this.windData = windData;
    }
}
