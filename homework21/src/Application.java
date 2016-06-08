import java.util.List;

public class Application {
    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        try {
            list.add("second");
        } catch (Exception e) {
            e.getMessage();
        }
        list.remove();
    }
}
