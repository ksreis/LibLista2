package kreis.aula;

public class SetInt {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;
    }

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
        size++;
        return true;
    }

    public boolean remove(int value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return true;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.value == value) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public boolean contains(int value) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int size() {
        return size;
    }
}