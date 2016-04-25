package hillel;

public class Flashlight {

    private String name;
    private int numberOfBatteries;

    public Flashlight(String name) {
        this.name = name;
    }

    public Flashlight() {

    }

    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void blink() {
        if (this.getNumberOfBatteries() < 3) {
            System.out.println("Minimum 3 batteries required to blink. Please install " + (3 - this.getNumberOfBatteries()) + " more batteries");
        } else {
            System.out.println("Flashlight " + this.getName() + " is blinking...");
        }
    }

    public void shine(String color) {
        if (this.getNumberOfBatteries() < 1) {
            System.out.println("No batteries found in the flashlight. Please install batteries.");
            return;
        }
        switch (color) {

            case "white":
                if (this.getNumberOfBatteries() < 1) {
                    System.out.println("Minimum 1 battery required to shine " + color + ". Please install a battery");
                } else {
                    System.out.println("Flashlight " + this.getName() + " is shining " + color);
                }
                break;
            case "red":
                if (this.getNumberOfBatteries() < 2) {
                    System.out.println("Minimum 2 batteries required to shine red. Please install " + (2 - this.getNumberOfBatteries()) + " more batteries");
                } else {
                    System.out.println("Flashlight " + this.getName() + " is shining " + color);
                }
                break;
        }
    }
}
