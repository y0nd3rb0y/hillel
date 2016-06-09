import java.util.List;

public class Application {
    public static void main(String[] args) {

        CustomLinkedList stringList = new CustomLinkedList();
        try{
            stringList.add("first");
        } catch (Exception e) {
            e.getMessage();
        }

        stringList.remove();
        CustomLinkedList catList = new CustomLinkedList();
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Bob"));


    }
}
