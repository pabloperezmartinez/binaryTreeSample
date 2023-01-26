public class BinaryTree {
    private Node root;
    private Node p, q;

    /**
     * Constructor que crea la raíz del árbol
     * @param info
     */
    public BinaryTree(int info) {
        this.root = new Node();
        this.p = new Node();
        this.q = new Node();
        this.root.setLeftChild(null);
        this.root.setRightChild(null);
        this.root.setInfo(info);
        this.p = root;
    }

    /**
     * Obtiene la raíz del árbol
     * @return raíz
     */
    public Node getRoot() {
        return root;
    }
    
    /**
     * Agrega nodo a la izquierda del árbol
     * @param node
     * @param info
     */
    public void insertLeftChild(Node node, int info) {
        Node newNode = new Node();
        newNode.setInfo(info);
        newNode.setLeftChild(null);
        newNode.setRightChild(null);
        node.setLeftChild(newNode);
    }

    /**
     * Agrega nodo a la derecha del árbol
     * @param node
     * @param info
     */
    public void insertRightChild(Node node, int info) {
        Node newNode = new Node();
        newNode.setInfo(info);
        newNode.setLeftChild(null);
        newNode.setRightChild(null);
        node.setRightChild(newNode);
    }

    /**
     * Agrega nodo y selecciona su posición de acuerdo a su valor
     * @param info
     */
    public void addNode(int info) {
        if (root.getInfo() == 0) {
            root.setInfo(info);
            return;
        }

        p = root;
        q = p;

        while (q!= null && p.getInfo()!= info) {
            p = q;
            if (p.getInfo() == info) {
                System.out.println("Nodo repetido");
                return;
            }

            if (info < q.getInfo()) {
                q = q.getLeftChild();
            } else {
                q = q.getRightChild();
            }
           
        }
        if (info < p.getInfo()) {
            this.insertLeftChild(p, info);
        } else {
            this.insertRightChild(p, info);
        }
    }

    /**
     * Imprime el árbol en orden
     * @param p
     */
    public void printInOrder (Node p) {
        if (p == null) return;
        this.printInOrder(p.getLeftChild());
        System.out.println(" " + p.getInfo());
        printInOrder(p.getRightChild());
    }
}
