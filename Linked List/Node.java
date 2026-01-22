public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    // Recursive Traversal
    public static void traversalRecursive(Node arg) {
        String newString = "";
        if (arg == null) {
            System.out.println("Linked List is empty");
            return;
        }
        else {
            System.out.println(arg.data);
            System.out.println("->");
            arg = arg.next;
        }
        
        traversalRecursive(arg);
        

    }

    // Recursive Loop
    public static String traversalLooped(Node arg) {
        
        String final_linked_list = "";
        
        while (arg != null) {
            final_linked_list += arg.data ;
            if(arg.next != null){
                final_linked_list += " -> ";
            }
            arg = arg.next;
        }
        
        System.out.println(final_linked_list);
        return final_linked_list;
        
    }

    public static Node insertion_at_the_beginning(Node head, int num) {
        
        Node newNode = new Node(num);
        newNode.next = head;
        return newNode;


    }

    public static Node NodeInsert(Node head, int pos, int val){
        // Node newNode = new Node(val);       
        Node currVal = head;

        for(int i = 0; i < pos - 1 && currVal != null; ++i){
            currVal = currVal.next;
        }

         Node newNode = new Node(val);
         newNode.next = currVal.next;
         currVal.next = newNode;

        return head;
        
    }  

    // public static Node NodeDele

}
