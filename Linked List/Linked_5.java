public class Linked_5 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        };

    }
    
    public static Node InsertMyNode(){}
    
    public static void main(String[] args) {
        Node headNode = new Node(50);
        headNode.next = new Node(60);
        headNode.next.next = new Node(60);




         
    }
    
}