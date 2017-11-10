package Chapter8;

public class TrafficLightTest {
    public static void main(String[] args){
        for(TrafficLight trafficLight : TrafficLight.values()){
            System.out.printf("%-10s%-10s%s%n", trafficLight, trafficLight.getLightName(),trafficLight.getDuration());
        }
    }
}
