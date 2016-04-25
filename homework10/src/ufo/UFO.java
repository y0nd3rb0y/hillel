package ufo;

/**
 * Created by Macintosh on 4/24/16.
 */
public class UFO {


    private int numberOfCows = 0;

    public UFO() {

    }

    public int getNumberOfCows() {
        return this.numberOfCows;
    }

    public void returnCows() {
        if (this.numberOfCows > 0) {
            System.out.println("Returning " + numberOfCows + " abducted cows");
            numberOfCows = 0;
        } else {
            System.out.println("UFO " + this.toString() + " returned all cows");
        }
    }

    public void stealCows(int cows) {
        if (this.numberOfCows + cows > 3) {
            System.out.println("No more than 3 cow is allowed in single UFO");
        } else {
            numberOfCows += cows;
            System.out.println(numberOfCows + " cows are abducted for tests");
        }
    }

    public void passCowToMothership(int cows) {
        if (this.numberOfCows - cows >= 0) {
            System.out.println(cows + " cows passed to mothership");
            numberOfCows -= cows;
        } else {
            System.out.println("UFO " + this.toString() + " has " + numberOfCows + " cows aboard. Cannot pass requested " + cows + " to mothership");
        }

    }


}
