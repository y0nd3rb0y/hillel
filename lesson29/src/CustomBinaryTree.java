public class CustomBinaryTree {

    Node root;

    public void addNode(int key, String value) {
        Node node = new Node(key, value);
        if (root == null) {
            root = node;
            return;
        }
        Node currentNode = root;
        while (true) {
            Node parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parent.leftChild = node;
                    return;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

    public Node findNode(int key) {
        Node currentNode = root;
        while (true) {
            if (key == currentNode.key) return currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }
        }
    }

    @Override
    public String toString() {
        String tree;
        Node currentNode = root;
        while (true) {
            if (currentNode.leftChild != null) {
                currentNode = currentNode.leftChild;
            } else {
            }

            poutput(root)
            output(root.left)
            sout(root.key)
            output(root.right)

        }
        return "CustomBinaryTree{" +
                tree +
                '}';
    }

    public class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
