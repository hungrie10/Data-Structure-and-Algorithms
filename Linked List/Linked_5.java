public class Linked_5 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        };

    }

    public static Node InsertMyNode(Node head, int pos, int val) {
        // Create a new Node
        Node newNode = new Node(val);

        if (pos == 0) {
            Node oldHead = head;
            newNode.next = oldHead;
            head = newNode;
            return head;
        }

        // Move to the Node before the pos
        Node currentNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currentNode = currentNode.next;
        }

        // Save the Node
        Node temp = currentNode;

        // Link the New Node to the old Node
        newNode.next = temp.next;
        currentNode.next = newNode;

        return head;

    }

    public static Node delNode(Node head, int pos) {
        Node tempNode = head;

        if (pos == 0) {
            head = tempNode.next;
            return head;
        }

        Node prevNode = null;
        for (int i = 0; i < pos; i++) {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }

        prevNode.next = tempNode.next;

        return head;

    }

    public static void main(String[] args) {

        Node headNode = new Node(50);
        headNode.next = new Node(60);
        headNode.next.next = new Node(60);

        headNode = InsertMyNode(headNode, 1, 0);

        // Traverse A Node
        Node currNode = headNode;

        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print("->");

            }
            currNode = currNode.next;
        }

    }

}