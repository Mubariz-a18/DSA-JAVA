public class LinkedList {
    private Node head ;
    private Node tail ;

    public Node getHead() {
        return head;
    }

    private int count = 0;
    public int size(){
        return count;
    }
    public  boolean isEmpty(){
        return count == 0;
    }

    public void add(int val){
        ++count;
        Node nd = new Node(val);
        if(tail != null){
            tail.next = nd;
            tail = nd;
        }
        else{
            tail = nd ;
            head = tail;
        }
    }

    public void addToHead(int val){
        ++count;
        Node nd = new Node(val);
        if(head != null){
            nd.next = head ;
            head = nd;
        }else{
            head = nd;
            tail = nd;
        }
    }

    public void delete(int val ){
        Node previous = null;
        Node current = head;
        if(size() == 1){
            --count;
            head = null;
            return;
        }
        while(current != null){
            if(current.val == val){
                previous.next = current.next;
                --count;
                break;
            }else{
                previous = current;
                current = current.next;
            }
        }
    }
}


