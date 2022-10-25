package mycompany.doublylinkedlist;

public class Node<E> {

    private E element;
    private Node<E> previous;
    private Node<E> next;

    public Node<E> getPrevious() {
        return previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getElement() {
        return element;
    }

    public Node(E element, Node<E> previous, Node<E> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if (!(that instanceof Node)) {
            return false;
        }
        Node<E> other = (Node<E>) that;
        if (element == null) {
            return other.element == null ? true : false;
        }
        return element.equals(other.element);
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
