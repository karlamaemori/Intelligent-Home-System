public class Main {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();
        
        System.out.println("--- Turning on individual devices ---");
        home.turnOnLight();
        home.turnOnTv();

        System.out.println("\n--- Turning on all devices ---");
        home.turnOnAll();

        System.out.println("\n--- Turning off individual devices ---");
        home.turnOffAll();
    }
}