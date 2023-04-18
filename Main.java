package HomeWork2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(5);
        myLinkedList.add(20);
        myLinkedList.add(15);
        myLinkedList.add(10);
        myLinkedList.add(23);
        myLinkedList.add(1,10);
        myLinkedList.remove(15);

        for (int i = 0; i < myLinkedList.getSize(); i++) {

            System.out.println(myLinkedList.get(i));

        }

    }
}
