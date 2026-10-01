public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Aircon = ON");
    }

    @Override 
    public void turnOff() {
        System.out.println("Aircon = OFF");
    }
}