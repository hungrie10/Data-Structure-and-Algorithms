public class Linked_1{
    public static void main(String[] args) {

        // Creating my First Ever Node 

        // Node no. 1
        Node head = new Node(10);
        
        // Node no. 2
        head.next = new Node(20);
        
        // Node no. 3
        head.next.next = new Node(30);    
        
        // Node no. 4
        head.next.next.next = new Node(40);    
        
        // Printing a Linked List
        Node temp = head;
        int tracker = 0;
        while (temp != null) {
            System.out.println("Node No " + tracker + " " + temp.data);
            tracker +=1;
            temp = temp.next;
        }




    }


}
