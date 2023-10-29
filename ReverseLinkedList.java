public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList link = new LinkedList();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
       Node reversedLL =  reverseLL(link.getHead());
       System.out.println(reversedLL.next.val);
    }

    static Node reverseLL(Node head){
        if(head == null) return head;

        Node previous = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

}



