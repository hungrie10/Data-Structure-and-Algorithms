public class Linked_9{
    
    

    public static void main(String[] args) {
            
            // First create a linked list
            Node myNode = new Node(50);
            myNode.next = new Node(60);
            myNode.next.next = new Node(70);
            myNode.next.next.next = new Node(90);

            // Traverse the original list 
            Node.traversalLooped(myNode); 
            
            // Insertion at the beginning Of a linked list
            myNode = Node.insertion_at_the_beginning(myNode , 30);
            
            // Traverse the original list 
            Node.traversalLooped(myNode);; 

    }
}
