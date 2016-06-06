public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList cLList = new CustomLinkedList();
        cLList.add("a");
        cLList.add("b");
        System.out.println(cLList.poll());
        System.out.println(cLList.poll());
    }
}
