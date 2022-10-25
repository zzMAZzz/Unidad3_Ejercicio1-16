package mycompany.unidad3ejercicio14;

public class Unidad3Ejercicio14 {
    public boolean equals(CircularlyLinkedList other){
        boolean result = false;
        int size1 = size();
        int size2 = other.size();
        if(size1 != size2)
            return result;
            result = head.equals(other.head);
        if (!result)
            return result;
        Node next = head.getNext();
        Node nextOfOther = other.head.getNext();
        while (size1 > 1){
            result = next.equals(nextOfOther);
            if (!result)
                break;
            next = next.getNext();
            nextOfOther = nextOfOther.getNext();
            size1--;
        }
        return result;

    }
}
