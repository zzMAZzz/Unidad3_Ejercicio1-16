package mycompany.unidad3ejercicio9;

public class Unidad3Ejercicio9 {

    public int size() {
        Node<AnyType> tmp = head;
        int size = 0;
        if (head == null) {
            return size;
        } else {
            size++;
            while (tmp.next != null) {
                tmp = tmp.next;
                size++;
            }
        }
        return size;
    }
}
