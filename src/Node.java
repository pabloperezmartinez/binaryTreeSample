public class Node {
    private int info;
    private Node leftChild;
    private Node rightChild;

    /**
     * Constructor de nodo
     */
    public Node (){
        this.info = 0;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Constructor de nodo
     * @param info
     */
    public Node (int info){
        this.info = info;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    /**
     * Obtiene la información del nodo
     * @return información del nodo
     */
    public int getInfo() {
        return info;
    }

    /**
     * Agrega la información a nodo
     * @param info información a agregar
     */
    public void setInfo(int info) {
        this.info = info;
    }

    /**
     * Retorna la referencia al "hijo" de la izquierda
     * @return nodo "hijo" de la izquierda
     */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * Agrega una referencia al hijo de la izquierda
     * @param leftChild
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Retorna la referencia al "hijo" de la derecha
     * @return nodo "hijo" de la derecha
     */
    public Node getRightChild() {
        return rightChild;
    }

    /**
     * Agrega una referencia al hijo de la derecha
     * @param rightChild
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

}