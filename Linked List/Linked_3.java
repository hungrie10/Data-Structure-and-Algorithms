public class Linked_3 {

    public static void main(String[] args) {
        Node node = new Node(50); // No.1
        node.next = new Node(60); // No.2
        node.next.next = new Node(70); // No.3
        node.next.next.next = new Node(80); // No.4
        node.next.next.next.next = new Node(90); // No.5
        node.next.next.next.next.next = new Node(100); // No.6

        System.out.println(Node.traversalLooped(node));

    }
}
