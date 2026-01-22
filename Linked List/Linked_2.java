public class Linked_2{

    public static void main(String[] args) {
        
      Node headNode = new Node(40);   // Node no. 1 
        headNode.next =  new Node(50);   // Node no. 1
        headNode.next.next = new Node(60); // Node no. 1

        Node temp = headNode;
        int num = 0;
        while (temp != null) {
            num += 0;
            System.out.println(temp.data);
            temp = temp.next;
        }




    }
}
