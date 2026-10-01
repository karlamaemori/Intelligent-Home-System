public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new Tv();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnLight() {
        light.turnOn();
    }

    public void turnOffLight() {
        light.turnOff();
    }

    public void turnOnTv() {
        tv.turnOn();
    }

    public void turnOffTv() {
        tv.turnOff();
    }

    public void turnOnAirConditioning() {
        airConditioning.turnOn();
    }

    public void turnOffAirConditioning() {
        airConditioning.turnOff();
    }

    public void turnOnAll() {
        System.out.println("Turning on all home services...");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning off all home services...");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}