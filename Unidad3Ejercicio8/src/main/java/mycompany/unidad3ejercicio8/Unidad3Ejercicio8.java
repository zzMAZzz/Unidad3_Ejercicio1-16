public class Unidad3Ejercicio8 {
    private Node<E> middle( ) {
        if (size == 0)
        throw new IllegalStateException("list must be nonempty");
        Node<E> middle = header−>next
        Node<E> partner = trailer−>prev;
        while (middle != partner && middle−>next != partner) {
        middle = middle.getNext( );
        partner = partner.getPrev( );
        }
        return middle;
    }
}
