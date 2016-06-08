public class CustomLinkedList {

    private Node first;


    public void add(String value) throws ClassNotFoundException {
        Node node = new Node();
        if (first == null) {
            first = node;
            first.next = null;
            first.prev = null;
            first.value = value;
        } else {
            do {
                if (first.next == null) {
                    first.next = node;
                    node.value = value;
                    node.prev = first;
                    break;
                } else first = first.next;

            } while (node.prev == null);

        }
    }

    public void remove() {
        if (first != null) {
            while (first.prev != null) {
                if (first.next == null) {
                    first.value = null;
                    first = null;
                } else first = first.next;
            }
        }
    }


    class Node {
        public Node next;
        public Node prev;
        public String value;
    }

}
