public class MyLinkedList<E> {
    private class Node<E> {
        private Node<E> next;
        private E data;

        public Node(E data){
            this.data = data;
        }
    }
    private Node head;
    private int numNode;

    public MyLinkedList (E data){
        head = new Node(data);
        numNode ++;
    }

    //add
    public void addFirst(E data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    // checkIndex
    public void checkIndex(int index){
        if(index>numNode+1|| index<0) System.out.println("out of Box");
    }
    //addLast
    public void addLast(E data){
     add(numNode,data);
    }

    //add
    public void add (int index, E data){
        checkIndex(index);
    Node temp = head;
    Node holder;
        for (int i = 0; i < index-1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    //remove
    public void remove (int index){
        checkIndex(index);
        if (index==0){
            head = head.next;
        }
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            while (temp.next != null) {
                temp = temp.next;
            }
        }
       numNode--;

    }

    //remove boolean
//    public boolean remove(E data){
//        if(contains(data))r
//        return true;
//    }
//
    //size
    public int size(){
        return numNode;
    }
//
//    //clone
//    @Override
//    public void clone(){
//
//    }
    //contains
    public boolean contains(E dataToCheck){
        Node temp = head;
        while (temp != null){
            if (temp.data == dataToCheck){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //indexOf
    public int indexOf(E dataToCheck){
         Node temp = head;
        for (int i = 0; i <numNode ; i++) {
            if (temp.data==dataToCheck){
                return i;
            }
            temp = temp.next;
        }
        return -1 ;
    }
//
//    //add
//    public boolean add(E dataWannaAdd){
//        return true;
//    }
//
//    //ensureCapacity
//    public void ensureCapacity(){
//
//    }
//
    //get
    public E get(int index){

        if (index==0) return (E) head.data;
        else {
            checkIndex(index);
            Node temp = head;
            for (int i = 0; i< index ; i++) {
                temp = temp.next;
            }
                return (E) temp.data;
            }
        }

    //getFirst
    public E getFirst(){
        return (E) head.data;
    }

    //GetLast
    public E getLast(){
        Node temp = head;
        for (int i = 0; i< numNode-1 ; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    //Clear
    public void clear(){
        head.data = null;
        head.next = null;
    }

    //PrintLinkedList
    public  void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +"\t");
            temp = temp.next;
        }
        System.out.println("\b");
    }

}
