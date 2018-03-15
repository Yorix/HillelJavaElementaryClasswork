package lesson14;

import lesson14.LinkedList.Node;
import lesson14.LinkedList.SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add("CCC");
        list.add("BBB");
        list.add("AAA");
        showList(list);

        list.remove("BBB");
        showList(list);
    }

    static void showList(SingleLinkedList list) {
        for (Node n : list.toArray()) {
            System.out.println(n.getValue());
        }
    }
}
