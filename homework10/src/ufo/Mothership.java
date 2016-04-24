package ufo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by Macintosh on 4/24/16.
 */
public class Mothership extends UFO {

    private int numberOfCows;
    private static int numberOfMotherships = 0;
    private ArrayList<UFO> UFOs = new ArrayList<>();
    final Random random = new Random();

    public static Mothership recallMothership() {
        if (Mothership.numberOfMotherships == 0) {
            Mothership.numberOfMotherships++;
            return new Mothership();
        } else {
            System.out.println("No more motherships allowed");
            return null;
        }
    }

    @Override
    public int getNumberOfCows() {
        return numberOfCows;
    }

    public void returnCows() {
        for (UFO ufo : this.UFOs) {
            if (ufo.getNumberOfCows() > 0) {
                ufo.returnCows();
            }
        }
    }

    public void sendUFOs() {
        int ufos = getRandom();
        System.out.println(ufos + " UFOs are being sent for cows");
        while (ufos > 0) {
            this.UFOs.add(new UFO());
            ufos--;
        }

    }

    public void stealCows() {
        for (UFO ufo : this.UFOs) {
            int cows = getRandom();
            this.UFOs.get(UFOs.size() - 1).stealCows(cows);
            if (this.numberOfCows + cows <= 3) {
                ufo.passCowToMothership(cows);
            }
        }
    }

    public int getRandom() {
        ;
        return random.nextInt(2) + 1;
    }

}
