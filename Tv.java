public class Tv implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("TV = ON");
    }

    @Override 
    public void turnOff() {
        System.out.println("TV = OFF");
    }
}