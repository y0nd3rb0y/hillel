package hillel;

/**
 * Created by User on 18.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Room physics;
        //physics = new Room(15, 20);
        physics = Room.createRoom(20, 25);
        physics.addStudent();
        //physics.handleNoSeats();

        Room maths = new Room(15, 20);
        /*physics.students=15;
        physics.places=20;
*/
/*
        maths.students=210;
        maths.places=24;
*/
        maths = physics;
        //System.out.println("The number of places: "+maths.places);


    }
}
