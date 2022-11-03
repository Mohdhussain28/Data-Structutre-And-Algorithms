public class IInd {
    static Node insertIst(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static Node insertLast(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    static Node deleteIst(Node head) {
        if (head == null)
            return null;
        else
            return head.next;
    }

    static Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    static void printData(Node head) {
        Node data = head;
        while (data != null) {
            System.out.print(data.data + "->");
            data = data.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Node data = new Node(10);
        data.next = new Node(20);
        data.next.next = new Node(30);
        data = insertIst(data, 5);
        printData(data);
    }
}
