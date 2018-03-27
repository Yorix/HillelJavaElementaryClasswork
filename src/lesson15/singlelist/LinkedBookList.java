package lesson15.singlelist;


import lesson15.hashtable.Pair;

public class LinkedBookList {
    private Node head;
    private int size;

    public Node getFirst() {
        return head;
    }

    public void add(Pair pair) {
        if (head == null) {
            head = new Node(pair);
            size++;
            return;
        }

        Node lastNode = getLastNode(pair);
        if (lastNode == null) {
            return;
        }

        Node createdNode = new Node(pair);
        lastNode.setNext(createdNode);
        size++;
    }
    
    public void remove(String key) {
        if (size == 0) return;

        if (head.getPair().getKey().equals(key)) {
            head = head.getNext();
            size--;
            return;
        }

        Node current = head;
        while (current != null) {
            if (size > 1 && current.getNext().getPair().getKey().equals(key)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public Node find(String key) {
        Node current = head;

        while (current == null) {
            if (current.getPair().getKey().equals(key)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }


    public int getSize() {
        return size;
    }

    private Node getLastNode(Pair pair) {
        Node current = head;
        while (current.getNext() != null) {
            if (checkDuplicateKey(current, pair)) {
                return null;
            }
            current = current.getNext();
        }

        if (checkDuplicateKey(current, pair)) {
            return null;
        }

        return current;
    }

    private boolean checkDuplicateKey(Node node, Pair pair) {
        if (node.getPair().getKey().equals(pair.getKey())) {
            return true;
        }
        return false;
    }

    public static class Node {
        private Pair pair;
        private Node next;

        public Node(Pair pair) {
            this.pair = pair;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Pair getPair() {
            return pair;
        }
    }
}
