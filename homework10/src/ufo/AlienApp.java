package ufo;

/**
 * Created by Macintosh on 4/24/16.
 */
public class AlienApp {
    public static void main(String[] args) {
        Mothership mothership = Mothership.recallMothership();
        mothership.sendUFOs();
        mothership.stealCows();
        mothership.returnCows();

    }
}
