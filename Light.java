public class Light implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Light = ON");
    }

    @Override 
    public void turnOff() {
        System.out.println("Light = OFF");
    }
}