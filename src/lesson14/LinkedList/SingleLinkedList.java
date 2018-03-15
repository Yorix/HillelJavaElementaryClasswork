package lesson14.LinkedList;

public class SingleLinkedList {
    private Node head;
    private int counter;

    public void add(String data) {
        Node current = new Node(data);
        if (head == null) {
            head = current;
            counter++;
            return;
        }

        current.next = head;
        head = current;
        counter++;
    }

    Node find(String data) {
        Node current = head;
        while (current != null) {
            if (current.getValue().equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(String data) {
        if (head.getValue().equals(data)) {
            head = head.next;
            counter--;
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.next.getValue().equals(data)) {
                current.next = current.next.next;
                counter--;
                return;
            }
            current = current.next;
        }
    }

    public Node[] toArray() {
        Node current = head;
        Node[] arr = new Node[counter];
        for (int i = 0; i < counter; i++) {
            arr[i] = current;
            current = current.next;
        }
        return arr;
    }
}
