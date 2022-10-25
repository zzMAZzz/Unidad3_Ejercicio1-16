package mycompany.unidad3ejercicio10;

public class Unidad3Ejercicio10 {

    public int size( ) {
        if (tail == null) return 0;
        Node<E> walk = tail−>next;
        int count=1;
        while (walk != tail) {
            count++;
            walk = walk.getNext( );
        }
        return count;
    }
}
