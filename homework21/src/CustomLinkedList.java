import java.util.Iterator;

public class CustomLinkedList<E> implements Iterable<E> {

    private Node first;


    public void add(E e) {
        Node node = new Node();
        if (first == null) {
            first = node;
            first.next = null;
            first.prev = null;
            first.value = e;
        } else {
            do {
                if (first.next == null) {
                    first.next = node;
                    node.value = e;
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

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }


    class Node {
        public Node next;
        public Node prev;
        public E value;
    }

}
