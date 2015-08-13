/**
 * Created by mmadhusoodan on 8/9/15.
 */
public class Node {

    private Node right;
    private Node left;
    private int nodeValue;

    public Node() {
        // a Java constructor
    }

    public Node leftNode() {
        return left;
    }

    public Node rightNode() {
        return right;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void printNodeValue() {
        System.out.println(nodeValue);
    }

    void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.leftNode());

        root.printNodeValue();

        inOrder(root.rightNode());

    }

    public static void main(String args[]) {

        Node node = new Node();

    }

}
