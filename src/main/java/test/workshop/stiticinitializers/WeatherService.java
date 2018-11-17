package test.workshop.stiticinitializers;

import java.util.List;

public class WeatherService {

    private static WindServiceClient windServiceClient;
    static {
        windServiceClient = WindServiceClient.initialize();
    }

    private Presenter presenter;

    public WeatherService(Presenter presenter) {
        this.presenter = presenter;
    }

    private void showWindData() {
        List<WindData> windData = windServiceClient.getWindData();
        presenter.show(windData);
    }
}
