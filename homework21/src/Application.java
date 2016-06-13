import java.util.List;

public class Application {
    public static void main(String[] args) {


        CustomLinkedList list = new CustomLinkedList();
        try {
            list.add("first");
            list.add("second");
            list.add("third");

        } catch (Exception e) {
            e.getMessage();
        }

        list.remove();
        CustomLinkedList catList = new CustomLinkedList();
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Bob"));


    }
}
