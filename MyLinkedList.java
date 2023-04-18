package HomeWork2;


public class MyLinkedList<E> {

    private class Node{

        public E element;

        public Node next;

        public Node(E element){
            this.element = element;
            next = null;
        }

        public Node(E element, Node next){
            this.element=element;
            this.next=next;
        }

        public String toString(){
            return "Node = " + this.element.toString();
        }
    }

    private int size;

    private Node head;

    public MyLinkedList(){
        size = 0;
        head = null;
    }

    private Node getNode(int index){
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public E get(int index){
        Node node = getNode(index);
        return node.element;
    }

    public int indexOf(Object obj){
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(obj.equals(node.element)) return i;
            node = node.next;
        }
        return -1;
    }

    public void add(E element){
        Node newNode = new Node(element);
        Node node = head;
        if(head == null){
            head = newNode;

        }
        else {
            while(node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }
        size++;



    }

    public void add(int index, E element){
        Node indexOf = getNode(index);
        Node node = head;
        Node newNode = new Node(element, indexOf);
        if(index < 0 || index>=size) throw new IndexOutOfBoundsException();
        if(node == null){
            head = node = newNode;
        }
        else {
            while (node.next != indexOf){
                node = node.next;
            }
            node.next = newNode;

        }
        size++;
    }

    public boolean remove(E element){
        Node node = head;
        Node deleteNode = new Node(element);
        while(node.next != deleteNode){
            node = node.next;
        }
        if(node.next!=deleteNode){
            return false;
        }
        else{
            node.next = node.next.next;
            size--;
        }

        return true;
    }

    public int getSize(){
        return this.size;
    }
}
