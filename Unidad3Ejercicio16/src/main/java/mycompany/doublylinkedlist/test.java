package mycompany.doublylinkedlist;

public class test {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll1 = new DoublyLinkedList<Integer>();
        dll1.addFirst(100);
        dll1.addFirst(200);

        DoublyLinkedList<Integer> dll2 = new DoublyLinkedList<Integer>();
        dll2.addFirst(100);
        dll2.addFirst(200);

        DoublyLinkedList<Integer> dll3 = new DoublyLinkedList<Integer>();
        dll3.addFirst(42);

        DoublyLinkedList<String> blankList1 = new DoublyLinkedList<String>();
        DoublyLinkedList<String> blankList2 = new DoublyLinkedList<String>();

        if (blankList1.equals(blankList2)) {
            System.out.println(blankList1 + " = " + blankList2);}
        if (!dll1.equals(dll3)) {
            System.out.println(dll1 + " != " + dll3);}
        if (dll1.equals(dll2)) {
            System.out.println(dll1 + " = " + dll2);}
    }
}
