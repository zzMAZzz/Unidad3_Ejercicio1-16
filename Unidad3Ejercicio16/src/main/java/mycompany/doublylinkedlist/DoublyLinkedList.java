package mycompany.doublylinkedlist;

public class DoublyLinkedList<E> {

    private Node<E> header;
    private Node<E> trailer;

    public boolean isEmpty() {
      return header == null;
    }

    public E getFirst() {
        return header != null ? header.getElement() : null;
    }

    public E getLast() {
        return trailer != null ? trailer.getElement() : null;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element, null, header);
        header = newNode;
        if (trailer == null) {
            trailer = newNode;
        }
    }

    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if (!(that instanceof DoublyLinkedList))
            return false;

        DoublyLinkedList<E> other = (DoublyLinkedList<E>) that;

        if (header == null) {
            return other.header == null ? true : false;
        }

        if (!header.equals(other.header))
            return false;

        if (header == trailer) {
            return true;
        }

        if (!trailer.equals(other.trailer))
            return false;

        Node<E> thisNode = header;
        Node<E> otherNode = other.header;

        while (thisNode.getNext() != trailer) {
            thisNode = thisNode.getNext();
            otherNode = otherNode.getNext();
            if (!(thisNode.equals(otherNode))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DoublyLinkedList<");

        Node<E> finger = header;
        while (finger != null) {
            sb.append(finger.toString());
            if (finger.getNext() != null) {
                sb.append("-");
            }
            finger = finger.getNext();
        }

        sb.append(">");
        return sb.toString();
    }
}

