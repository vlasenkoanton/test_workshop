package test.workshop.singletons;

public enum TrafficLight {
    INSTANCE("red");

    private String color;

    TrafficLight(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
