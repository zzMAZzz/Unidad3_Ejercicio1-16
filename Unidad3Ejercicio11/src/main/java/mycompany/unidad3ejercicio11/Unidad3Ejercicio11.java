package mycompany.unidad3ejercicio11;

public class Unidad3Ejercicio11 {
    public int size( ) {
        int count=0;
        Node<E> walk = header−>next;
        while (walk != trailer) {
            count++;
            walk = walk.getNext( );
        }
        return count;
    }
}
