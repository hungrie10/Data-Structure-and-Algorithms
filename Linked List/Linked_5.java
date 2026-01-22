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
     
        if (pos == 1) {
            Node oldHead = head; 
            newNode.next = oldHead;
            head = newNode;
            return head;
        }

        // Move to the Node before the pos
        Node currentNode = head;
        for (int i = 0; i < pos; i++) {
            currentNode = currentNode.next;
        }

        // Save the Node
        Node temp = currentNode;

        // Link the New Node to the old Node
        currentNode.next = temp;

    }
    
    public static void main(String[] args) {
        Node headNode = new Node(50);
        headNode.next = new Node(60);
        headNode.next.next = new Node(60);




         
    }
    
}