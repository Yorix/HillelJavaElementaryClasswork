package lesson16;

public class Stack {
    private final int MAX_SIZE = 100;
    private String[] arr = new String[MAX_SIZE];
    private int ptr = -1;


    public boolean push(String str) {
        if (ptr == -1) {
            ptr = 0;
            arr[ptr] = str;
        } else {
            if (ptr == MAX_SIZE) {
                System.out.println("Current stack is overflow");
                return false;
            }
            arr[++ptr] = str;
        }
        return true;
    }

    public String pop() {
        if (ptr == -1) {
            System.out.println("Current stack is empty");
            return null;
        }
        return arr[ptr--];
    }

    public String peek() {
        if (ptr == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return arr[ptr];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}
