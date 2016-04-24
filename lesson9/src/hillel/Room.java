package hillel;

public class Room {
    private int students;
    private int places;

    /*
    Room(int st, int pl){
        students = st;
        places = pl;
    }
    */

    public static Room createRoom(int stud, int pl){
        Room room = new Room();
        room.students = stud;
        room.places = pl;
        return room;
    }
    public void addStudent(){
        if(students<places) {
            students++;
        } else {
            handleNoSeats();
        }
    }

    private void handleNoSeats(){
        System.out.println("No places left;");
    }
}
