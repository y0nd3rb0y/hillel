package hillel;

/**
 * Created by Macintosh on 4/22/16.
 */
public class Application {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();
        flashlight.setName("Lantern");
        flashlight.setNumberOfBatteries(2);
        flashlight.getNumberOfBatteries();
        System.out.println(flashlight.getName());
        flashlight.shine("red");
        flashlight.blink();
        flashlight.setNumberOfBatteries(3);
        flashlight.blink();
    }
}
