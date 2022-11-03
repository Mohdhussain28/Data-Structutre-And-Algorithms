public class searchInTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    };

    static boolean ifNodeExists(Node node, int key) {
        if (node == null)
            return false;

        if (node.data == key)
            return true;
        boolean res1 = ifNodeExists(node.left, key);
        if (res1)
            return true;
        boolean res2 = ifNodeExists(node.right, key);
        return res2;
    }

    // Driver Code
    public static void main(String args[]) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.left.left = new Node(3);
        root.left.left.left = new Node(7);
        root.left.right = new Node(4);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        int key = 4;

        if (ifNodeExists(root, key))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}