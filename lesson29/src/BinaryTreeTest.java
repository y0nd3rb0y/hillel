public class BinaryTreeTest {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.addNode(2, "Dog");
        tree.addNode(3, "Turtle");
        tree.addNode(1, "Cat");
        tree.addNode(5, "Duck");
        tree.addNode(12, "Zebra");
        tree.addNode(12, "Cat");

        CustomBinaryTree.Node n = tree.findNode(5);
        System.out.println(n.toString());
    }
}
