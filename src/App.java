
public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(18);
        tree.addNode(12);
        tree.printInOrder(tree.getRoot());
    }
}
