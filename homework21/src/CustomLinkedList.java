import java.util.Iterator;

public class CustomLinkedList<E> implements Iterable<E> {

    private Node first;

    public boolean checkLoop(Node first) throws LoopFoundException{
        Node fast = first;
        Node slow = first;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){

                return true;
            }
        }

        if((fast == null) && (fast.next == null)){
            return false;
        }

        return false;
    }
    public void add(E value) {
        try {
            checkLoop(first);
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
        } catch(LoopFoundException lfe){
            lfe.getMessage();
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

    private class LoopFoundException extends Exception {
        public LoopFoundException(String message) {
            super(message);
        }
    }
}
