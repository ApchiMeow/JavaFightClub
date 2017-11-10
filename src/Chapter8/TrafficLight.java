package Chapter8;

public enum TrafficLight {
    RED("Red", 10),
    YELLOW("Yellow", 5),
    GREEN("Green", 10);

    private final String lightName;
    private final int duration;

    TrafficLight(String lightName, int duration){
        this.lightName = lightName;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getLightName() {
        return lightName;
    }
}
