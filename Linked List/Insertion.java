public class Insertion {
    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(70);
        head.next.next = new Node(70);

        head = Node.NodeInsert(head, -1, 0);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }
}
