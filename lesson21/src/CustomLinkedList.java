public class CustomLinkedList {

    private Node first;
    private Node last;

    CustomLinkedList(){

    }

    private class Node{
        String value;
        Node next;
    }

    public void add(String s){

            Node node = new Node();
            node.value = s;
            node.next = null;

        if( last != null){
            last.next = node;

        }
        if (first == null) {
            first = node;
        }
        last = node;


    }

    public String poll(){

        if(first!=null){
            String result = first.value;
            Node second = first.next;
            if(second==null) {
                first.next = null;
            } else first.next = second.next;
            first = second;
            return result;
        }
        return null;
    }

}
