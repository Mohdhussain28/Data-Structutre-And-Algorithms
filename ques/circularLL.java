class circularLL {

    static void print(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp;
        }
    }

    static Node delHead(Node head) {
        if (head == null)
            return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static Node delN(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            return delHead(head);
        }
        Node curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head, 10);
        head = insertBegin(head, 10);
        print(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}