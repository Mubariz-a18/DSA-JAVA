public class UseLL {
    public static void main(String[] args){
        LinkedList LL = new LinkedList();
        System.out.println(LL.size()); //0
        LL.add(1);
        System.out.println(LL.isEmpty()); //false
        LL.delete(1);
        System.out.println(LL.size());
        System.out.println(LL.isEmpty()); //false
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        System.out.println(LL.size());
        LL.addToHead(1);
        System.out.println(LL.getHead().val);
        System.out.println(LL.size());

    }
}
