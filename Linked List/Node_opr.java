public class Node_opr {

    public static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node Insert_My_Node(Node head, int pos, String valString) {
        Node newNode = new Node(valString);
       
        if (pos == 1) {
            Node holdHeadNode = head;
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node currNode = head;
        
        for (int i = 0; i < pos; i++) {
            currNode = currNode.next;    
        }
        
       Node temp = currNode.next;
       newNode.next = currNode;
       currNode.next = newNode;
       
       return head;
        

    }

    public static void main(String[] args) {
        // Baking a cake
        Node eggs = new Node("Eggs");
        Node milk = new Node("Milk");
        Node flour = new Node("Flour");
        Node sugar = new Node("Sugar");

        eggs.next = milk;
        milk.next = flour;
        flour.next = sugar;

        
        eggs =  Insert_My_Node(eggs, 2, "Vanilla Extract");

        Node curr = eggs;
        while (curr != null) {
            System.out.print(curr.data + " ");
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }

    }

}
