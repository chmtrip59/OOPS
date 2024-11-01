package in.myEnums;

public enum TrafficLight {
    RED("Stop"),GREEN("Go"),YELLOW("Caution");


    TrafficLight(String action) {
        this.action = action;
    }

    private final String action;
}
